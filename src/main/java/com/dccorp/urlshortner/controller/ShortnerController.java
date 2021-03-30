package com.dccorp.urlshortner.controller;

import com.dccorp.urlshortner.domain.ServiceRequest;
import com.dccorp.urlshortner.domain.ServiceResponse;
import com.dccorp.urlshortner.service.ShortnerService;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.function.Function;

@Controller
public class ShortnerController {

    ShortnerService shortnerService;

    public ShortnerController(ShortnerService shortnerService) {
        this.shortnerService = shortnerService;
    }

    @Bean
    public Function<ServiceRequest, ServiceResponse> create() {
        return (serviceRequest) -> shortnerService.createShortCode(serviceRequest);
    }

}
