/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPack;

/**
 *
 * @author Admin
 */
public class Student {
    private String middleName;
    private String address;
    private String emails;
    private String phoneNumber;
    private String studentCode;

    public Student(String middleName, String address, String emails, String phoneNumber, String studentCode) {
        this.middleName = middleName;
        this.address = address;
        this.emails = emails;
        this.phoneNumber = phoneNumber;
        this.studentCode = studentCode;
    }

    public Student() {
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
     
    public void goToSchool(){
        System.out.println(this.middleName.toUpperCase() + " dang di den truong");
    }
    public void doHomeWork(){
        System.out.println(this.middleName.toUpperCase() + " dang lam bai tap");
    }
    public void payTuition(){
        System.out.println(this.middleName.toUpperCase() + " da dong hoc phi ");
    }
    public void takingExam(){
        System.out.println(this.middleName.toUpperCase() + " dang di den truong");
    }

    public void showStudent(){
        System.out.println("middleName=" + middleName + ", address=" + address + ", emails=" + emails + ", phoneNumber=" + phoneNumber + ", studentCode=" + studentCode);
    }
    
    
}
