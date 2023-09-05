/*c03 -prgm -3
Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data
members. Use array of objects to display details of N teachers. */

import java.util.Scanner;

class ePerson1{
    
    public static void main(String[] args) {
        String Name,Gender,Address,company_Name,Qualification,Department,Subject;
        int age,Empid,salary,Teacher_id;
        Scanner sc =new Scanner(System.in);
        System.out.println("limit:");
        int n=sc.nextInt();
        P_Techer1 obj[] = new P_Techer1[n];
        for(int i=0;i<n;i++){
            System.out.println("name:");
            Name=sc.next();
            System.out.println("Gender:");
            Gender=sc.next();
            System.out.println("Address:");
            Address=sc.next();
            System.out.println("age:");
            age=sc.nextInt();
            System.out.println("empid:");
            Empid=sc.nextInt();
            System.out.println("Salary:");
            salary=sc.nextInt();
            System.out.println("company name:");
            company_Name=sc.next();
            System.out.println("Quali:");
            Qualification=sc.next();
            System.out.println("tid:");
            Teacher_id=sc.nextInt();
            System.out.println("Depart:");
            Department=sc.next();
            System.out.println("SUb:");
            Subject=sc.next();
            
            obj[i]= new P_Techer1(Name, Gender, Address, age, Empid, salary, company_Name, Qualification, Teacher_id, Department, Subject);
            System.out.println("..........................................");
        }
       for(int i=0;i<n;i++){
       
       obj[i].display();
       System.out.println("..........................................");
    }
    }
}

class Person1{
    String Name,Gender,Address;
    int age;
    Person1(String n,String g,String A,int Age){
        this.Name =n;
        this.Gender =g;
        this.Address =A;
        this.age=Age;
    }
    void display(){
        System.out.println("Name   : " + this.Name);
        System.out.println("Gender    : " + this.Gender);
        System.out.println("Address : " + this.Address);
        System.out.println("age  : " + this.age);
    }

}
class Emp1 extends Person1 {
    int Empid,salary;
    String company_Name,Qualification;

    Emp1(String n ,String  g,String A,int Age,int id,int sal ,String c_name,String Qual){
        super(n,g,A,Age); 
        this.Empid =id;
        this.salary =sal;
        this.company_Name =c_name;
        this.Qualification=Qual; 
         }

    void display(){
        super.display();
        System.out.println("EmpID   : " + this.Empid);
        System.out.println("Company Name    : " + this.company_Name);
        System.out.println("Qualification : " + this.Qualification);
        System.out.println("Salary  : " + this.salary);
    }


}
class  P_Techer1 extends Emp1{
String Department,Subject;
int Teacher_id;

            P_Techer1(String n ,String  g,String A,int Age,int id,int sal,String c_name,String Qual ,int t_id ,String dep ,String sub){
               super(n,g,A,Age,id,sal,c_name,Qual); 
               this.Department =dep;
               this.Teacher_id =t_id;
               this.Subject = sub;
            }
            void display(){   
                    super.display();
                    System.out.println("Dept Name : " + this.Department);
                    System.out.println("Subject Name : " + this.Subject);
                    
            }

}