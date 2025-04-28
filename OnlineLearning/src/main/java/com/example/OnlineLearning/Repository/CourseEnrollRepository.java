package com.example.OnlineLearning.Repository;

import com.example.OnlineLearning.Entity.CourseEnrollEntity;
import org.hibernate.persister.entity.SingleTableEntityPersister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollRepository extends JpaRepository<CourseEnrollEntity , Integer> {
}
