package com.example.data.Servicer;

import com.example.data.Enity.Test;
import java.util.List;

public interface TestServicer {
  public Test createUser(Test user);
  public List<Test> findAll();
}
