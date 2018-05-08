package com.whforever.simplespring.test;

public class ReferenceBean {

  private HelloWorld hello;

  public void say() {
    hello.say();
  }

  public void setHello(HelloWorld hello) {
    this.hello = hello;
  }
}
