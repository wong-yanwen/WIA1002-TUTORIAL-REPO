# Individual Assignment Task 2

## WONG YAN WEN (25005619)

1.  Given the following code: 
   
    ```
     LectureCourse lecCourse = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3); 
        System.out.println(lecCourse.calculateTotalWorkload());
    ```
      
    What will be the output? 
    <br>a) 3 
    <br>b) 14 
    <br>c) 42 
    <br>d) 17

    ```
    ANSWER: c)42
    ```

2. Given the following code: 
   
    ```
    LabCourse labCourse = new LabCourse("CS201", "Data Structures Lab", "Prof. Jones", 2.5, 2); 
    System.out.println(labCourse.getCourseCode()); 
    ```     
    What will be the output? 
    <br>a) CS201 
    <br>b) Data Structures Lab 
    <br>c) Prof. Jones 
    <br>d) 2.5

    ```
    ANSWER : a) CS201
    ```

3. What will be the output of the following code snippet? 
    ```
    LectureCourse lec1 = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3); 
    LectureCourse lec2 = new LectureCourse("CS102", "OOP", "Prof. Lee", 4); 
    System.out.println(lec2.calculateTotalWorkload()); 
    ```
    
    <br>a) 56 
    <br>b) 42 
    <br>c) 3 
    <br>d) 4

    ```
    ANSWER: a)56
    ```


4. Given the following code, what is the expected output? 
    ```
    LabCourse lab1 = new LabCourse("CS201", "Data Structures Lab", "Prof. Jones", 2.5, 2); 
    LabCourse lab2 = new LabCourse("CS202", "Algorithms Lab", "Dr. Brown", 2.0, 1); 
    System.out.println(lab1.getCourseTitle()); 
    ```     
    <br>a) CS201 
    <br>b) Data Structures Lab 
    <br>c) Prof. Jones 
    <br>d) 2.5 

    ```
    ANSWER: b) Data Structures Lab 
    ```

5. Considering the `LectureCourse` class, what would be the result of the following code? 
    ```
    LectureCourse lec = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3); 
    lec.printCourseDetails(); 
    ```  
    <br>a) A compilation error. 
    <br>b) A runtime error. 
    <br>c) The details of the lecture course will be printed to the console. 
    <br>d) Nothing will be printed. 

    ```
    ANSWER: c) The details of the lecture course will be printed to the console. 
    ```

6. What is the primary difference between how a `LectureCourse` and a `LabCourse` calculate their total workload? 
    <br>a) `LabCourse` uses hours per week * sessions, while `LectureCourse` uses hours per week. 
    <br>b) `LabCourse` uses a `double` for hours, while `LectureCourse` uses an `int`. 
    <br>c) `LectureCourse` uses weeks in a semester, while `LabCourse` does not. 
    <br>d) `LabCourse` does not have a `calculateTotalWorkload()` method. 

    ```
    ANSWER: a) `LabCourse` uses hours per week * sessions, while `LectureCourse` uses hours per week. 
    ```
    
7. If we add a new type of course, `OnlineCourse`, which has `videoHours` and `quizCount` as attributes, what method from the `Course` interface would need to be implemented in a unique way for this new class? 
    <br>a) `getCourseCode()` 
    <br>b) `getCourseTitle()` 
    <br>c) `calculateTotalWorkload()` 
    <br>d) `printCourseDetails()` 
   
   ```
    ANSWER: c) `calculateTotalWorkload()` 
   ```

8. What is the purpose of the `@Override` annotation used in the `LectureCourse` class? 
    <br>a) It tells the compiler to ignore the method. 
    <br>b) It tells the compiler that this method is intended to override a method in a superclass or interface. 
    <br>c) It is required for all methods in an interface. 
    <br>d) It is used to define a new method. 

    ```
    ANSWER: b) It tells the compiler that this method is intended to override a method in a superclass or interface.
    ```

