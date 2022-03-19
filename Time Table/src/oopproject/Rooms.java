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
public abstract class Rooms {
    private final String name;  

    public String getName() {
        return name;
    }
    
    Rooms (String name){
    this.name=name;
    }
}
class ClassRoom extends Rooms{
    ClassRoom(String name){
    super(name);

    }
}

class Laboratory extends Rooms{

    Laboratory(String name){
    super(name);

    }

}