package com.bits.assignment;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configures routes for the API Gateway.
 */
@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("user-service", r -> r.path("/api/users/**")
                .uri("http://localhost:8082")) // Points to UserService
            .route("order-service", r -> r.path("/api/orders/**")
                .uri("http://localhost:8081")) // Points to OrderService
            .build();
    }
}
