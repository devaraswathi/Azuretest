package com.kroger.b2b.exampleservice;

import com.kroger.b2b.exampleservice.adapter.in.ospwebhook.OspWebhookConfiguration;
import com.kroger.b2b.exampleservice.adapter.in.webbootstrap.WebBootstrapConfiguration;
import com.kroger.b2b.exampleservice.adapter.out.despkafkaproducer.DespKafkaProducerConfiguration;
import com.kroger.b2b.exampleservice.adapter.out.ospclient.OspClientConfiguration;
import com.kroger.b2b.exampleservice.common.CorrelationService;
import com.kroger.b2b.exampleservice.common.ObjectMapperConfiguration;
import com.kroger.b2b.exampleservice.common.TimeService;
import com.kroger.b2b.exampleservice.service.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@SpringBootConfiguration
@Import({
    TimeService.class,
    CorrelationService.class,
    ObjectMapperConfiguration.class,
    WebBootstrapConfiguration.class,
    OspWebhookConfiguration.class,
    DespKafkaProducerConfiguration.class,
    OspClientConfiguration.class,
    ApplicationConfiguration.class})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
