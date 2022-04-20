package com.example.infoserver.config;

import com.example.infoserver.component.PostHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> route(PostHandler postHandler) {
        return RouterFunctions.route()
                .GET("/info-service/uri",
                        postHandler::infoService)
                .build();

    }


//    @Bean
//    public RouterFunction<ServerResponse> getRoute(PostHandler postHandler) {
//        return RouterFunctions.route()
//                .path("/hello", builder -> builder
//                        .GET("", accept(APPLICATION_JSON), postHandler::createHello)
//                )
//                .build();
//
//
//    }



}
