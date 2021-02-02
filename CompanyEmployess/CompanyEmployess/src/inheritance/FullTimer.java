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
public class FullTimer extends Instructor{
     private double salary;
    public FullTimer(){
        this.salary=0;
        this.name=" ";
        this.id=0;
    }
    public FullTimer(int a,String n, double b){
    super(a,n);
        this.salary=b;
    }
    public double getSalary(){
        return this.salary;
    }
 
     @Override
    public String toString(){
        String y=super.toString()+" => Full timer=> "+ ", salary is "+this.salary;
        return y;
    } 
//    public String toString(){
//        String y="Full timer=> ID : "+this.id+",Name : "+this.name+", salary is "+this.salary;
//        return y;
//    } 
}
