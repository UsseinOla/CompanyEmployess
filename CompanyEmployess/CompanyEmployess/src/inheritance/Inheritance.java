/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alia.ghaddar
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner scan=new Scanner(System.in);
     ArrayList<Instructor> x=new ArrayList<Instructor>();
     int a;
    do{  
  
    System.out.println("1.Add instructor");
    System.out.println("2.Add Parttimer");
    System.out.println("3.Add FullTimer");
    System.out.println("4.Exit"); 
    System.out.print("Choose an option: ");
     a=scan.nextInt();
    if(a==1){
      System.out.print("Enter name & ID: ");
      String name=scan.next();
      int id=scan.nextInt();
      Instructor y=new Instructor(id,name);
      x.add(y);
    }
    if(a==2){
        System.out.print("Enter name,id,number of hours,hour rate: ");
        String name=scan.next();
        int id=scan.nextInt();
        int nbhrs=scan.nextInt();
        double hrrate=scan.nextDouble();
        PartTimer y=new PartTimer(id,name,hrrate,nbhrs);
         x.add(y);     
  }
    if(a==3){
        System.out.print("Enter  name,id,salary: ");
        String name=scan.next();
        int id=scan.nextInt();   
        double salary=scan.nextDouble();
        FullTimer y=new FullTimer(id,name,salary);
       x.add(y);
    }
    if(a<1||a>4){
        System.out.println("Wrong choise,choose again");
      
    }
    }while(a!=4);
    
    for (int i=0;i<x.size();i++){ 
        System.out.println(x.get(i).toString());

       
    }
    }
    
}
