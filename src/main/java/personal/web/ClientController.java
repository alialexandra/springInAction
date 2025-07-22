package personal.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.web.domain.Client;
import personal.web.dto.ClientDto;
import personal.web.service.ClientService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientController {


    private final ClientService clientService;

    @GetMapping("/fetch-all")
    public List<ClientDto> getAllClients() {
        return clientService.getAllClients();
    }

}
