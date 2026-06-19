package ecommerce.springboot.microservice.supplierservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;


@RestController
public class FluxAndMonoController {

    @GetMapping("/flux")
    public Flux<String> getFlux() {
        return Flux.just("Supplier1", "Supplier2", "Supplier3", "Supplier4", "Supplier5").log();
    }

    @GetMapping("/mono")
    public Mono<String> getMono() {
        return Mono.just("Single Supplier").log();
    }

    //Streaming endpoint
    @GetMapping(value = "/stream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Long> streamNumbers() {
        return Flux.interval(Duration.ofSeconds(1)).log();
    }
}