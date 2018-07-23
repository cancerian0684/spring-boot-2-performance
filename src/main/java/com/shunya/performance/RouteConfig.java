package com.shunya.performance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouteConfig {

    @Bean
    public RouterFunction<?> routerFunction(HelloController testController) {
        return route(GET("/api/perf"), testController::ping);
    }
}
