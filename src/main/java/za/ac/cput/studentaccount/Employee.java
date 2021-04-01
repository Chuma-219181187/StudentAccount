/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentaccount;


/**
 *
 * @author Dieuci ND
 */
public class Employee {


   String name;
   String employeeNumber;

   public Employee(){

   }

   public Employee(String employeeNumber ,String name, double salary)
   {
      this.name = name;
      this.salary = salary;
      this.employeeNumber = employeeNumber;
   }

    @Override
   public String toString(){
       String src="Name:" + this.name + "\n Salary:"+" R"+ this.salary;

       return src;
   }

   public String getName()
   {
      return name;
   }
public void setName(String name){
       this.name = name;
   }

   double salary;

   public double getSalary(){
       return salary;     
   }


   @Override
   public boolean equals(Object that) {
       Employee other = (Employee)that;
       return this.employeeNumber.equals(other.employeeNumber); 
   }
}


