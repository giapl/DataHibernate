package com.example.data.contronller;

import com.example.data.Enity.Test;
import com.example.data.Servicer.TestServicer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestContronller {
  @Autowired
  private TestServicer testServicer;
  @PostMapping("/user")
  public ResponseEntity<Test> createUser(@RequestBody Test user){
    Test save=testServicer.createUser(user);
    return new  ResponseEntity<Test>( save,HttpStatus.CREATED);
  }
  @GetMapping("/")
  public ResponseEntity<?> findAll(){
    List<Test> user=testServicer.findAll();
    return ResponseEntity.ok(user);
  }
}
