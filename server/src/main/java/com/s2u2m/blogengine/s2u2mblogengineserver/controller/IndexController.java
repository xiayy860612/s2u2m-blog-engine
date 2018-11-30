package com.s2u2m.blogengine.s2u2mblogengineserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class IndexController {

  @GetMapping("/")
  public Mono<String> index() {
    return Mono.just("Hello World");
  }
}