package com.whforever.simplespring.test.model;

/**
 * @author wuhaifei 2019-09-05
 */
public class StudentA {
    private StudentB studentB ;

    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }

    public StudentA() {
    }

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}
