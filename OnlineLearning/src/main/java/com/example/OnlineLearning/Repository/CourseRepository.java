package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.DTO.CourseEnrollDTO;
import com.example.OnlineLearning.Entity.CourseEntity;
import com.example.OnlineLearning.Entity.ModuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
    CourseEntity findByCourseName(String courseName);


}
