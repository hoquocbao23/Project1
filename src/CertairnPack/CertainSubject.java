/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CertairnPack;

import SubjectPack.Subjects;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CertainSubject {

    Scanner sc = new Scanner(System.in);
    private String courseCode;
    private String courseName;
    private int numberOfPeriod;
    // private Subjects sub; -> nullPointerException
    // private Subjects sub = new Subjects(courseCode, courseName, numberOfPeriod);

    private int tuitionFee;
    private double subjectAvg;
    private boolean status;

    private double[] mark = new double[4];

//    public CertainSubject(Subjects sub) {
//        this.sub = sub;
//    }
    public CertainSubject() {
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getSubjectAvg() {
        return subjectAvg;
    }

    public void setSubjectAvg(double subjectAvg) {
        this.subjectAvg = subjectAvg;
    }

    public void tuitionPay(Subjects sub) {
        this.tuitionFee = sub.getNumberOfCredit() * 560;
        System.out.println("Hoc Phi " + sub.getCourseCode() + ": " + this.tuitionFee);
    }

    // tinh diem trung binh
    public void nhapDiem(Subjects sub) {
        int baiTest = sub.getNumberOfTest();
        for (int i = 0; i < baiTest; i++) {
            do {
                System.out.println("mark" + (i + 1) + ":");
                mark[i] = Double.parseDouble(sc.nextLine());
            }while (mark[i] >10 || mark[i] < 0);
            
        
        }
    }

    public void diemTrungBinh(Subjects sub) {
        double tongDiem = 0;
        int baiTest = sub.getNumberOfTest();
        switch (baiTest) {
            case 2:
                tongDiem = mark[0] * 0.3 + mark[1] * 0.7;
                break;
            case 3:
                tongDiem = mark[0] * 0.2 + mark[1] * 0.3 + mark[2] * 0.5;
                break;
            case 4:
                tongDiem = mark[0] * 0.1 + mark[1] * 0.2 + mark[2] * 0.3 + mark[3] * 0.4;
                break;
        }
        this.subjectAvg = tongDiem;
        System.out.println("AVG:" + this.subjectAvg);

    }

    public void passOrNot() {
        if (this.subjectAvg >= 4) {
            status = true;
            System.out.println("Passed");
        } else {
            status = false;
            System.out.println("Not Passed");
        }
    }

}
