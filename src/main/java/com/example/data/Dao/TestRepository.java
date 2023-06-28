package com.example.data.Dao;

import com.example.data.Enity.Test;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends JpaRepository<Test,Long> {
  public List<Test> findAll();
}
