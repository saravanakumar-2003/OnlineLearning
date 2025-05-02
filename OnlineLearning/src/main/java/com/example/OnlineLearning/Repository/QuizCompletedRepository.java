package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizCompletedRepository extends JpaRepository<QuizCompletedEntity, Integer> {


    @Modifying
    @Query("UPDATE QuizCompletedEntity qce SET qce.status = true WHERE qce.studentEntity = :studentEntity AND qce.courseEntity = :courseEntity AND qce.moduleEntity = :moduleEntity AND qce.quizEntity = :quizEntity")
    void attendQuiz(@Param("studentEntity") StudentEntity studentEntity, @Param("courseEntity") CourseEntity courseEntity, @Param(("moduleEntity")) ModuleEntity moduleEntity, @Param(("quizEntity")) QuizEntity quizEntity);

    @Query("""
    SELECT
        (SELECT count(*) from QuizCompletedEntity qce WHERE qce.moduleEntity = :moduleEntity AND qce.status = true) =
        (SELECT count(*) from QuizCompletedEntity qce WHERE qce.moduleEntity = :moduleEntity)
    """)
    boolean isCompleted(@Param("moduleEntity") ModuleEntity moduleEntity);

}
