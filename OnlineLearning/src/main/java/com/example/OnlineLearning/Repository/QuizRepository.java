package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.Entity.ModuleEntity;
import com.example.OnlineLearning.Entity.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<QuizEntity , Integer> {
    List<QuizEntity> findAllByModuleEntity(ModuleEntity moduleId);

    QuizEntity findByModuleEntity(ModuleEntity i);
}
