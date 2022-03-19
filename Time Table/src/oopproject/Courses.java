package oopproject;
import java.util.*;

public class Courses {
    private int id ;
    private String name; 
    private int numOfLectures;
    private int numOfLabs;
    private GeneralLecLab[] lecs ;
    private GeneralLecLab[] labs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfLectures() {
        return numOfLectures;
    }

    public void setNumOfLectures(int numOfLectures) {
        this.numOfLectures = numOfLectures;
    }

    public int getNumOfLabs() {
        return numOfLabs;
    }

    public void setNumOfLabs(int numOfLabs) {
        this.numOfLabs = numOfLabs;
    }

    public GeneralLecLab[] getLecs() {
        return lecs;
    }

    public void setLecs(Lecture[] lecs) {
        this.lecs = lecs;
    }

    public GeneralLecLab[] getLabs() {
        return labs;
    }

    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }
    
    Courses(int id , String name ,int numOfLectures , int numOfLabs ){
        this.id=id;
        this.name=name;
        this.numOfLectures=numOfLectures;
        this.numOfLabs=numOfLabs;
        lecs = new Lecture[numOfLectures];
        labs = new Lab[numOfLabs];
        
    }
   
}

