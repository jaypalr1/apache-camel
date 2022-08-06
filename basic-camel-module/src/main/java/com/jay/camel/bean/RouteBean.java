package com.jay.camel.bean;

import org.springframework.stereotype.Component;

@Component
public class RouteBean {

  public void testMethod1() {
    System.out.println("Hi from M1");
  }

  public void testMethod2() {
    System.out.println("Hi from M2");
  }
}
