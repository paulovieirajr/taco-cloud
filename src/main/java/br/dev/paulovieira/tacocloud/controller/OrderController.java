package br.dev.paulovieira.tacocloud.controller;

import br.dev.paulovieira.tacocloud.model.*;
import br.dev.paulovieira.tacocloud.repository.*;
import lombok.extern.slf4j.*;
import org.springframework.security.core.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.*;
import org.springframework.web.servlet.*;

import javax.validation.*;
import java.util.*;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    TacoOrderRepository tacoOrderRepository;
    UserRepository userRepository;

    public OrderController(TacoOrderRepository tacoOrderRepository, UserRepository userRepository) {
        this.tacoOrderRepository = tacoOrderRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/current")
    public ModelAndView orderForm(@AuthenticationPrincipal User user, ModelMap model) {
        // Pass the user to fill the inputs in orderForm.html
        model.addAttribute("user", user);
        return new ModelAndView("orderForm", model);
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder order,
                               Errors errors,
                               SessionStatus sessionStatus,
                               @AuthenticationPrincipal User user) {

        if (errors.hasErrors()) {
            return "orderForm";
        }

        order.setUser(user);
        order.setPlacedAt(new Date());

        tacoOrderRepository.save(order);

        log.info("Order submitted: {}", order);

        sessionStatus.setComplete();

        return "redirect:/";
    }

}
