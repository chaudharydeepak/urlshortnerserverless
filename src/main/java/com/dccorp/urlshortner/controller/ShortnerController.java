package com.dccorp.urlshortner.controller;

import com.dccorp.urlshortner.domain.ServiceRequest;
import com.dccorp.urlshortner.domain.ServiceResponse;
import com.dccorp.urlshortner.service.ShortnerService;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Slf4j
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

    @Bean
    public Supplier<String> getItIs() {
        log.info("invoked getItIs");
        return () -> "invoked isItGet";
    }

    @Bean
    public Consumer<String> postItIs() {
        log.info("invoked postItIs");
        return log::info;
    }

}
