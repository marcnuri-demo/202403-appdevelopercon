package com.marcnuri.demo.spring.appdevelopercon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AppDeveloperConApplication {

  public static void main(String... args) {
    SpringApplication.run(AppDeveloperConApplication.class, args);
  }

  @RestController
  public static final class RootResource {
    @GetMapping
    public String hello() {
      return "Hello AppDeveloperCon!";
    }
  }

}


