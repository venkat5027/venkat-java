package com.example.Api.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Service
public class ApiService {
    private final WebClient.Builder webClientBuilder;

    public ApiService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public Mono<String> getObjects() {
        return webClientBuilder.baseUrl("http://api.restful-api.dev")
                .build()
                .get()
                .uri("/objects")
                .retrieve()
                .bodyToMono(String.class);
    }
    public Mono<String> createObject(Object requestObject) {
        return webClientBuilder.baseUrl("http://api.restful-api.dev")
                .build()
                .post()
                .uri("/objects")
                .bodyValue(requestObject)
                .retrieve()
                .bodyToMono(String.class);
    }
}
