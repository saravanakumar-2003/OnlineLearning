# OnlineLearning

Admins can create/manage Courses, Modules, Quizzes, and Assignments.

3 Course
1 module / course
1 quiz / module 1 question
1 assignment / module 1 question

Students can register, enroll in courses, complete modules, take quizzes, submit assignments.

student - course - status - completed

1. Course Entity - 
   1. Course id
   2. Course name
   
2. Module Entity
    1. Module id
   2. Course id
   3. Module name
   4. Assignment
   
3. Quiz Entity
   1. Quiz id
   2. Module id
   3. question

4. Student Entity
    1. stud id
   2. name
   
5. Course Enrolled
   1. id
   2. stud id
   3. course id
   4. status

6. quiz completed
   1. id
   2. stud id
   3. course id
   4. module id
   5. quiz id
   6. quiz status

7. Module completed
   1. id
   2. stud id
   2. course id
   3. module id
   4. assignment status
   5. quiz status

   