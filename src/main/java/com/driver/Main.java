package com.driver;

public class Main {
  RWOnly obj = new RWOnly();
  obj.setName("New Value");
  System.out.println(obj.getName());
}
