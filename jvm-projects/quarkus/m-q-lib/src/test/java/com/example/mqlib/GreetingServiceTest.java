package com.example.mqlib;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingServiceTest {

  @Inject
  GreetingService service;

  @Test
  public void testGreetingService() {
    Assertions.assertEquals("Hello World!", service.greeting());
  }
}
