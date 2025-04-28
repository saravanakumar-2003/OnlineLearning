package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.Entity.QuizCompletedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizCompletedRepository extends JpaRepository<QuizCompletedEntity, Integer> {
}
