/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

/**
 *
 * @author Lenovo
 */
public abstract class GeneralLecLab {
    private int numOfHrs;
    private Teachers tech;
    private Rooms room;
    
    public int getNumOfHrs() {
        return numOfHrs;
    }

    public void setNumOfHrs(int numOfHrs) {
        this.numOfHrs = numOfHrs;
    }

    public Teachers getTech() {
        return tech;
    }

    public void setTech(Teachers tech) {
        this.tech = tech;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }

   
    
}



class Lecture extends GeneralLecLab{
    
    Lecture (int TeacherID,String name ,String phone, String email, int numOfHrs, String nameOfRoom){
        Teachers t = new Professor(TeacherID,name ,phone, email);
        setTech(t);
        Rooms cr=new ClassRoom(nameOfRoom);
        setRoom(cr);
        setNumOfHrs(numOfHrs);
    }
    

}


class Lab extends GeneralLecLab{
  
   
    Lab (int TeacherID,String name ,String phone, String email, int numOfHrs,String nameOfRoom){
        Teachers t = new TA(TeacherID,name ,phone, email);
        setTech(t);
        Rooms lb=new Laboratory(nameOfRoom);
        setRoom(lb);
        setNumOfHrs(numOfHrs);
    }


} 