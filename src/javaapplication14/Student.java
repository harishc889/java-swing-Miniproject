/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Template
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author mannu
 */
public class Student {
    String studentName,collegeName,city;
    int fees;
    public Student(String studentName,String collegeName ,int fees,String city)
    {
        this.studentName=studentName;
        this.collegeName=collegeName;
        this.fees=fees;
        this.city=city;
        
        
    
    }
    public void display()
    {
        System.out.print("studentname is :" + studentName);
        System.out.println();
        System.out.print("college name is :"+ collegeName);
        System.out.println();
        System.out.print("fees is :" + fees);
        System.out.println();
        System.out.print("city :" + city);
        System.out.println();
        
        
    }
    
}
