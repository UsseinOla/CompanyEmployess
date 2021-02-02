/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author alia.ghaddar
 */
public class Instructor {
    protected int id;
 protected String name;

 public Instructor(int a, String n){
     this.id=a;
     this.name=n;
 }

 public Instructor (){
     this.id=0;
     this.name=" ";
 }
 
    @Override
public String toString(){
return " Instructor ID: "+this.id+" , Name:"+this.name;
} 
}
