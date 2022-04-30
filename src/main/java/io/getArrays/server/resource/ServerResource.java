package io.getArrays.server.resource;

import io.getArrays.server.service.implementation.ServerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerResource {
    private final ServerServiceImpl serverService;

}
