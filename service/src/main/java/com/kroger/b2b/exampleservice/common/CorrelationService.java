package com.kroger.b2b.exampleservice.common;

import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class CorrelationService {

  public String nextCorrelationId() {
    return UUID.randomUUID().toString();
  }
}
