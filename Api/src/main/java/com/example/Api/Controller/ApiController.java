package com.example.Api.Controller;

import com.example.Api.Service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {
    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/get-objects")
    public Mono<String> fetchObjects() {
        return apiService.getObjects();
    }
    @PostMapping("/create-object")
    public Mono<String> createObject(@RequestBody Object requestObject) {
        return apiService.createObject(requestObject);
    }
}
