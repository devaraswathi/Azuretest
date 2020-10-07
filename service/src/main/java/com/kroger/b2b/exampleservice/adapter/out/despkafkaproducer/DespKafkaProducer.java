package com.kroger.b2b.exampleservice.adapter.out.despkafkaproducer;

import com.kroger.b2b.exampleservice.service.DomainEventDispatcherPort;
import org.springframework.stereotype.Component;

@Component
class DespKafkaProducer implements DomainEventDispatcherPort {

  @Override
  public <T> void dispatch(T event) {
    // TODO: implement
  }
}
