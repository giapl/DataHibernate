package com.example.data.Servicer;

import com.example.data.Dao.TestRepository;
import com.example.data.Enity.Test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServicerImpl implements TestServicer{
@Autowired
private TestRepository testRepository;
  @Override
  public Test createUser(Test user) {
    return testRepository.save(user);
  }

  @Override
  public List<Test> findAll() {
    return testRepository.findAll();
  }
}
