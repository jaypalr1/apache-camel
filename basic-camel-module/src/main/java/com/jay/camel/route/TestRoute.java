package com.jay.camel.route;

import com.jay.camel.bean.RouteBean;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestRoute extends GenericRoute {

  private final RouteBean routeBean;

  @Override
  public void configure() throws Exception {

//    from("timer:first-timer")
//        .to("log:first-logger");

    fromLocalScheduler("firstRoute")
        .to("log:some-where");
  }
}
