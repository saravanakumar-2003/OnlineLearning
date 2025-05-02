package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.Entity.CourseEntity;
import com.example.OnlineLearning.Entity.ModuleCompletedEntity;
import com.example.OnlineLearning.Entity.ModuleEntity;
import com.example.OnlineLearning.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleCompletedRepository extends JpaRepository<ModuleCompletedEntity, Integer> {

    @Modifying
    @Query("UPDATE ModuleCompletedEntity mce SET mce.quizStatus = true WHERE mce.moduleEntity = :moduleEntity")
    void moduleCompleted(@Param("moduleEntity") ModuleEntity moduleEntity);

    @Modifying
    @Query("UPDATE ModuleCompletedEntity mce SET mce.assignmentStatus = true WHERE mce.studentEntity = :studentEntity AND mce.courseEntity = :courseEntity AND mce.moduleEntity = :moduleEntity")
    void attendAssignment(@Param("studentEntity") StudentEntity studentEntity,@Param("courseEntity") CourseEntity courseEntity,@Param("moduleEntity") ModuleEntity moduleEntity);
}
