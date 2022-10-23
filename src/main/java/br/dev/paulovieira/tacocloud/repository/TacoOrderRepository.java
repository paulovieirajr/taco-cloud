package br.dev.paulovieira.tacocloud.repository;

import br.dev.paulovieira.tacocloud.model.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface TacoOrderRepository extends JpaRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);

    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}

