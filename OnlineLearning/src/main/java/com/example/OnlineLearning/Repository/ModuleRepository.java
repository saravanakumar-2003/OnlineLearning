package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.Entity.CourseEntity;
import com.example.OnlineLearning.Entity.ModuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleEntity , Integer> {
    ModuleEntity findByModuleName(String moduleName);



    List<ModuleEntity> findAllByCourseEntity(CourseEntity ce);
}
