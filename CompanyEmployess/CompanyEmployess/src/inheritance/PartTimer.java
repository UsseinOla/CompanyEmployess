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
public class PartTimer extends Instructor{
     private int nbhrs;
    private double hourRate;
    public PartTimer(){
        this.hourRate=0;
        this.nbhrs=0;
        this.name=" ";
        this.id=0;
    }
    public PartTimer(int a,String n,double b,int c){
       super(a,n);
        this.hourRate=b;
        this.nbhrs=c;
    }
    public double getSalary(){
        return this.getSalary();
    }
     @Override
    public String toString(){
        String y=super.toString()+" => Part Timer=> "+", hour rate is "+this.hourRate+", the number of hours is "+this.nbhrs;
  return y;
    }
    
//    public String toString(){
//        String y="Part Timer=> ID : "+this.id+", Name: "+super.name+", hour rate is "+this.hourRate+", the number of hours is "+this.nbhrs;
//  return y;
//    }
}
