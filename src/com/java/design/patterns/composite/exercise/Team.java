package com.java.design.patterns.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Team extends Resource {
  private final List<Resource> resources = new ArrayList<>();

  public void add(Resource resource) {
    resources.add(resource);
  }

  public void deploy() {
    for (var resource : resources)
      resource.deploy();
  }
}

