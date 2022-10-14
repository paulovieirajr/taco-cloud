package br.dev.paulovieira.tacocloud.repository;

import br.dev.paulovieira.tacocloud.model.TacoOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TacoOrderRepository extends JpaRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
}

