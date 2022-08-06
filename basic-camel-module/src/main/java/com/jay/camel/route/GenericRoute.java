package com.jay.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.RouteDefinition;

public abstract class GenericRoute extends RouteBuilder {

  protected RouteDefinition fromLocalEndpoint(String routeId) {
    return from(fromLocal("direct:", routeId));
  }

  protected RouteDefinition fromLocalScheduler(String routeId) {
    return from(fromLocal("timer:", routeId));
  }

  protected void fromLocalLog(String routeId) {
    from(fromLocal("log:", routeId));
  }

  private String fromLocal(String type, String routeId) {
    return type + routeId;
  }
}
