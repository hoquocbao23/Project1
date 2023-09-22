/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.CertainSubject;
import data.*;
import javax.security.auth.Subject;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("Bao", "BinhDinh", "se181694", "09293", "se181694");
        s1.goToSchool();
        s1.doHomeWork();
        s1.payTuition();
        s1.takingExam();
        s1.showStudent();
        System.out.println("--------------------------------------");
        
        Subjects sub1 = new Subjects("PRF", "C++", 20);
        sub1.setNumberOfCredit(4);
        sub1.setNumberOfTest(4);
        sub1.showSubject();
        CertainSubject certainSub = new CertainSubject();
        certainSub.tuitionPay(sub1);
        certainSub.nhapDiem(sub1);
        certainSub.diemTrungBinh(sub1);
        certainSub.passOrNot();
        
        
        

    }
}
