package oopproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public abstract class Teachers {
    private final int TeacherID;
    private String phone ;
    private String email ;
    private final String name;

    public String getName() {
        return name;
    }

    public int getTeacherID() {
        return TeacherID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    Teachers(int TeacherID, String name ,String phone, String email){
    this.TeacherID = TeacherID;
    this.name=name;
    this.phone= phone;
    this.email=email;
    
    }
    
}
class Professor extends Teachers {
    Professor(int TeacherID,String name ,String phone, String email){
        super( TeacherID,name,phone, email);
    }
}
class TA extends Teachers{
    TA(int TeacherID,String name ,String phone, String email){
        super( TeacherID,name ,phone, email);
    }


}