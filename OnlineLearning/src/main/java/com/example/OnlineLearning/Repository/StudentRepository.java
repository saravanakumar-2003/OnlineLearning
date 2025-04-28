package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity , Integer> {
    StudentEntity findByStudName(String studName);
}
