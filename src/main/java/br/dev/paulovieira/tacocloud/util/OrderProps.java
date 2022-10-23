package br.dev.paulovieira.tacocloud.util;

import lombok.*;
import org.springframework.boot.context.properties.*;
import org.springframework.stereotype.*;
import org.springframework.validation.annotation.*;

import javax.validation.constraints.*;

@Component
@ConfigurationProperties(prefix = "taco.orders")
@Data
@Validated
public class OrderProps {

    @Min(value = 5, message = "must be between 5 and 25")
    @Max(value = 25, message = "must be between 5 and 25")
    private int pageSize = 20;

}
