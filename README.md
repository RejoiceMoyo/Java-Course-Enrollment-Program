Course Enrollment and Grade Management System

Overview
This project is a Course Enrollment and Grade Management System implemented in Java. The system allows administrators to manage student enrollments, assign grades, and calculate overall course grades.

Features
- Enroll students in courses
- Assign grades to students
- Calculate overall course grades for each student
- Command-line interface for administrators to interact with the system

Classes
1. Student
    - Private instance variables for storing student information such as name, ID, and enrolled courses.
    - Methods to enroll in courses, assign grades, and retrieve grades.

2. Course
    - Private instance variables for storing course information such as course code, name, and maximum capacity.
    - Static variable to keep track of the total number of enrolled students across all courses.
    - Methods to increment enrollment and retrieve course information.

3. CourseManagement
    - Static variables for storing a list of courses and student grades.
    - Static methods to add courses, enroll students, assign grades, and calculate overall course grades.

4. Main
    - Command-line interface for administrators to add courses, enroll students, assign grades, and calculate overall grades.

 Instructions for Running the Program
1. Compile the Java files:
   ```bash
   javac *.java
   
2. **Run the program:**
   ```bash
   java Main

 Usage
1. Add a new course:
   - Enter course code, course name, and maximum capacity.
2. Enroll a student:
   - Enter student name, student ID, and course code.
3. Assign a grade:
   - Enter student ID, course code, and grade.
4. Calculate overall grade:
   - Enter student ID to calculate and display the overall grade.

Documentation
- The code is well-documented with comments explaining the purpose and usage of each class, method, and variable.
- Instructions for running the program and interacting with the administrator interface are included.
