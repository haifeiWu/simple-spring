package com.whforever.simplespring.test.model;

/**
 * @author wuhaifei 2019-09-05
 */
public class StudentC {
    private StudentA studentA ;

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC() {
    }

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}
