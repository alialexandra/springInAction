package personal.web.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import personal.web.domain.Client;
import personal.web.dto.ClientDto;
import personal.web.repository.ClientRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepo clientRepo;


    public List<ClientDto> getAllClients() {
        return clientRepo.findAll().stream().map(ClientDto::new).collect(Collectors.toList());
    }

}
