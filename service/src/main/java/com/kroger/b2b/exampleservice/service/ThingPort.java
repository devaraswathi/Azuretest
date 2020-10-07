package com.kroger.b2b.exampleservice.service;

import com.kroger.b2b.exampleservice.service.model.Thing;
import java.util.Optional;

public interface ThingPort {

  Optional<Thing> get(final String thingId);
}
