package personal.web.dto;


import lombok.*;
import personal.web.domain.Client;
import personal.web.domain.Orders;

import java.util.List;
@Getter
@Setter
public class ClientDto {
    public ClientDto(Long id, String name, String address, List<Orders> orders) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.orders = orders;
    }


    private final Long id;

    private final String name;
    private final String address;

    private final List<Orders> orders;

    public ClientDto(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.address = client.getAddress();
        this.orders = client.getOrders();
    }
}
