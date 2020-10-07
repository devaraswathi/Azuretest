package com.kroger.b2b.exampleservice.service;

public class ThingNotFoundException extends RuntimeException {

  public ThingNotFoundException() {
    super("Thing not found.");
  }
}
