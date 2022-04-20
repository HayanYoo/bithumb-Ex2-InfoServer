package com.example.infoserver.component;

import com.example.infoserver.Dto.InfoResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PostHandler {

    public Mono<ServerResponse> infoService(ServerRequest serverRequest) {

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(new InfoResponse(""));
    }
}
