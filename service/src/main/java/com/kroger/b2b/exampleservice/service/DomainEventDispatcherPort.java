package com.kroger.b2b.exampleservice.service;

public interface DomainEventDispatcherPort {

  <T> void dispatch(T payload);
}
