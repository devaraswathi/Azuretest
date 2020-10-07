package com.kroger.b2b.exampleservice.common;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

  public LocalDateTime now() {
    return LocalDateTime.now();
  }
}
