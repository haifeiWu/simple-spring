package com.whforever.simplespring.test.model;

/**
 * @author wuhaifei 2019-09-05
 */
public class StudentB {
    private StudentC studentC ;

    public void setStudentC(StudentC studentC) {
        this.studentC = studentC;
    }

    public StudentB() {
    }

    public StudentB(StudentC studentC) {
        this.studentC = studentC;
    }
}
