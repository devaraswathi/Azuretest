package com.kroger.b2b.exampleservice.adapter.out.ospclient;

import com.kroger.b2b.exampleservice.service.ThingPort;
import com.kroger.b2b.exampleservice.service.model.Thing;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
class OspClient implements ThingPort {

  private final OspClientProperties ospClientProperties;

  @Override
  public Optional<Thing> get(final String thingId) {
    // TODO: Implement
    return Optional.empty();
  }
}
