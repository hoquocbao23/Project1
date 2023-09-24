/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubjectPack;

import CertairnPack.CertainSubject;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Subjects {

    Scanner sc = new Scanner(System.in);
    private String courseCode;
    private String courseName;
    private int numberOfPeriod;
    private int numberOfCredit = 1;
    private int numberOfTest = 2;
    private CertainSubject certain;

    public Subjects(String courseCode, String courseName, int numberOfPeriod) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.numberOfPeriod = numberOfPeriod;

    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfPeriod() {
        return numberOfPeriod;
    }

    public void setNumberOfPeriod(int numberOfPeriod) {
        this.numberOfPeriod = numberOfPeriod;
    }

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public boolean setNumberOfCredit(int numberOfCredit) {
        if (numberOfCredit >= 1 && numberOfCredit <= 4) {
            this.numberOfCredit = numberOfCredit;
            return true;
        } else {
            System.out.println("Number of credits must be between 1 and 4 .");
        }
        return false;
    }

    public int getNumberOfTest() {
        return numberOfTest;
    }

    public boolean setNumberOfTest(int numberOfTest) {
        if (numberOfTest >= 2 || numberOfTest < 5) {
            this.numberOfTest = numberOfTest;
            return true;
        } else {
            System.out.println("Number of tests must be between 2 and 4");
        }
        return false;
    }

    public void showSubject() {
        System.out.println("courseCode=" + courseCode + ", courseName=" + courseName + ", numberOfPeriod=" + numberOfPeriod + ", numberOfCredit=" + numberOfCredit + ", numberOfTest=" + numberOfTest);
    }

}
