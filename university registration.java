/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
 package data.project;
import java.util.Scanner;
 package data.project;
import java.util.*;
import java.util.Calendar; 
 package data.project;
import java.util.Scanner;
 package data.project;
import java.util.ArrayList;
public class DataProject {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        student stu=new student();
        stu.name();
        stu.RegistraionNumber();
        stu.nationality();
        stu.StudentID();
        stu.Adress();
        stu.MailingAdress();
        stu.birth();
        stu.gender();
        stu.TermAndYear();
        stu.department();
        stu.tutor_name_and_code();
        
        data d=new data();
        System.out.println("Enter your email : ");
        String email=scan.next();
        d.set_email(email);
        
        System.out.println("Enter your home number : ");
        int hnumber=scan.nextInt();
        d.set_homeNo(hnumber);
        
        System.out.println("Enter your phone number : ");
        int phone=scan.nextInt();
        d.set_phoneNo(phone);
        
        courses c = new courses();
        c.addcourse();
        c.finished();
        c.current();

        System.out.println("enter the name of the bank : ");
        String ban=scan.next();
        System.out.println("enter the amount paid : ");
        int am = scan.nextInt();
        System.out.println("enter the transaction number : ");
        int trans=scan.nextInt();
        payment p = new payment(ban,am,trans);
        p.setTransaction_number(trans);
        p.setAmount_paid(am);
        p.setBank(ban);
        p.getAmount_paid();
        p.getBank();
        p.getTransaction_number();
    }
    
}

public class courses {
     Scanner scan = new Scanner(System.in);
     int maxhours=140;
     int total=0;
     int totalhours=0;
     double mark1 , mark2 , mark3 , mark4 , totalmark ;
    public void addcourse(){
        String []arr= new String[7];
        
        System.out.println(" Add course name : ");
        String add =scan.next();
        System.out.println(" Add course code : ");
        int addcode =scan.nextInt();        
        System.out.println(" Add course hours : ");
        int addhours =scan.nextInt();
        if ( addhours<=17){
        totalhours+=addhours;
        tutors();
        System.out.println("add another course ? ");
        String another = scan.next();
        if( "yes".equals(another.toLowerCase())){
        if(totalhours <= 17){
            addcourse();
            total++;
        }
        } else{
            System.out.println("O.K.");
        }
    } else {
            System.out.println("sorry your total hours is "+ totalhours +"can't be over 17 hours ");
}
    }
    public void finished(){
        String finish[]=new String[2];
        finish[0]="omar";
        System.out.println(" Add course name : ");
        String add =scan.next();
        System.out.println(" Add course code : ");
        int addcode =scan.nextInt();        
        System.out.println(" Add course hours : ");
        int addhours =scan.nextInt();
        System.out.println(" Number of times took for this course : ");
        int times = scan.nextInt();
        System.out.println(" The semester which the course taken in : ");
        String semester = scan.next();
        System.out.println(" The year which the course taken in : ");
        int yearr=scan.nextInt();
        
        tutors();
        
        System.out.println(" Marks... ");
        System.out.println(" Final exam mark :  ");
        mark1=scan.nextInt();
        if (mark1>40){
        System.out.println("the degree is out of 40. ");
        System.out.println("Enter the degree again.  ");
        mark1=scan.nextInt();
        }
        System.out.println(" Year work mark :  ");
        mark2=scan.nextInt();
        if (mark2>10){
        System.out.println("the degree is out of 10. ");
        System.out.println("Enter the degree again.  ");
        mark2=scan.nextInt();


}        
        System.out.println(" midterm mark :  ");
        mark3=scan.nextInt();
        if (mark3>30){
        System.out.println("the degree is out of 30. ");
        System.out.println("Enter the degree again.  ");
        mark3=scan.nextInt();
        }        
        System.out.println(" project mark :  ");
        mark4=scan.nextInt();
        if (mark4>20){
        System.out.println("the degree is out of 20. ");
        System.out.println("Enter the degree again.  ");
        mark4=scan.nextInt();

        }  
        totalmark = mark1 + mark2 + mark3 + mark4 ;
        System.out.println(" course mark :  " + totalmark);
        System.out.println(" absence percentage " );
        int abs=scan.nextInt();
        
        gpa();
        
    }
    public void current(){
        
    }
    public void tutors(){
        System.out.println(" Course tutors..");
        System.out.println(" course lecturer ...");
        System.out.println("");
        System.out.println(" First name : ");
        String f =scan.next();
        System.out.println(" Middle name : ");
        String m1=scan.next();
        System.out.println(" Last name : ");
        String l1=scan.next();
        
        System.out.println(" course GTA (Graduate Teaching Assistant )...");
        System.out.println(" First name : ");
        String f2=scan.next();
        System.out.println(" Middle name : ");
        String m2=scan.next();
        System.out.println(" Last name : ");
        String l2=scan.next();
        
        System.out.println(" course lab GTA (Graduate Teaching Assistant )...");
        System.out.println(" First name : ");
        String f3=scan.next();
        System.out.println(" Middle name : ");
        String m3=scan.next();
        System.out.println(" Last name : ");
        String l3=scan.next();
    }
    public void gpa(){
        String degree = null;
        double gpa=0;
    if(totalmark>=90||totalmark<100){
        degree= "A";
        gpa=4.0;
    }
    if(totalmark>=85||totalmark<90){
        degree="A-";
        gpa=3.66;
    }
    if(totalmark>=80||totalmark<85){
        degree="B+";
        gpa=3.33;
    }
    if(totalmark>=75||totalmark<80){
        degree="B";
        gpa=3.0;
    }
    if(totalmark>=70||totalmark<75){
        degree="C+";
        gpa=2.66;
    }
    if(totalmark>=65||totalmark<70){
        degree="C";
        gpa=2.33;
    }
    if(totalmark>=60||totalmark<65){
        degree="D+";
        gpa=2.0;
    }    
    if(totalmark>=50||totalmark<60){
        degree="D";
        gpa=1.66;
    }    
    if(totalmark<50){
        degree="F";
        gpa=0;
    }
        System.out.println("your degree is " + degree + "  and your gpa is  "+gpa );
    }
    
    
}

public class payment {
     private int amount_paid, transaction_number;
    private String bank;
    public static int counter = 0;
    public static ArrayList<payment> arr= new ArrayList();
    public payment(String bank, int amount_paid, int transaction_number) {
        this.amount_paid = amount_paid;
        this.bank = bank;
        this.transaction_number= transaction_number;
        counter++;
        this.arr.add(this);
    }

    public int getTransaction_number() {
        return transaction_number;
    }

    public void setTransaction_number(int transaction_number) {
        this.transaction_number = transaction_number;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(int amount_paid) {
        this.amount_paid = amount_paid;
    }
}

public class data {
    
    private int phoneNo, homeNo;
    private String email;
    public void set_phoneNo(int phoneNo){
        this.phoneNo = phoneNo;
    }
    public void set_homeNo(int homeNo){
        this.homeNo = homeNo;
    }
    public void set_email(String email){
        this.email = email;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }
}


public class student {
    static Calendar mycalobj =  Calendar.getInstance();
      public void name(){
       Scanner sc = new Scanner(System.in);  
    System.out.println("please, Enter your first name: ");
    String firstname = sc.nextLine();
        System.out.println("please, Enter your middle name: ");
    String middlename = sc.nextLine();
        System.out.println("please, Enter your last name: ");
    String lastname = sc.nextLine();
  System.out.println( "your name is: " + firstname + " " + middlename + " " + lastname);
     }
     public void RegistraionNumber(){
      Scanner sc = new Scanner(System.in);
          System.out.println("please, Enter your term: ");
    int term = sc.nextInt();
          System.out.println("please, Enter faculty number ");
    int FacultyNumber = sc.nextInt();
          System.out.println("please, Enter your department code: ");
    int DepartmentCode = sc.nextInt();
          System.out.println("please, Enter your student number: ");
    int StudentNumber = sc.nextInt();
    System.out.println("your Registraion Number is: " + mycalobj.get(Calendar.YEAR) + term + FacultyNumber + DepartmentCode + StudentNumber);
     }
        public void nationality(){
             Scanner sc = new Scanner(System.in);  
    System.out.println("please, Enter your nationality: ");
    String nationality = sc.next();
        }
        public void StudentID(){
             Scanner sc = new Scanner(System.in);  
    System.out.println("please, Enter type of your id (e.g, national iD, passport.....) ");
    String IDtype = sc.next();
    System.out.println("please, Enter your ID  number : ");
    int ID = sc.nextInt();
}
public  void Adress(){
             Scanner sc = new Scanner(System.in); 
             System.out.println("please, Enter your flat number : ");
    int flat = sc.nextInt();
    System.out.println("please, Enter your house number : ");
    int house = sc.nextInt();
      System.out.println("please, Enter your street name : ");
    String street = sc.next();
     System.out.println("please, Enter your Area/District name :  ");
    String area = sc.next();
         System.out.println("please, Enter your city name :  ");
    String city = sc.next();
         System.out.println("please, Enter your Governorate name :  ");
    String Governorate = sc.next();
         System.out.println("please, Enter your Country name :  ");
    String Country = sc.next();
         System.out.println("please, Enter your postal code :  ");
    int PostalCode = sc.nextInt();
      
}
public void MailingAdress(){
 Scanner sc = new Scanner(System.in);
 System.out.println("do your mailing adress diffrent than adress ? ");
    String ans = sc.nextLine();
     
if( "yes".equals(ans.toLowerCase())){
    System.out.println("please, write mailing adress ");
    Adress();
} else {
        System.out.println("OK, please continue Registration your data ");
 System.out.println("");
}

}
public void gender(){
             Scanner sc = new Scanner(System.in); 
    System.out.println("please, Enter your gender: ");
    String gender = sc.nextLine();
}
 public  void tutor_name_and_code(){
       Scanner sc = new Scanner(System.in); 
    System.out.println("please, Enter your tutor name and his/her code");

Mohamed Modar, [7/5/2023 5:33 PM]
String tutor_name = sc.nextLine();
    int tutor_code = sc.nextInt();
 }
 public  void TermAndYear(){
    Scanner sc = new Scanner(System.in);
      System.out.println("please, Enter first enrolment year: ");
    int year = sc.nextInt();
          System.out.println("please, Enter your first enrolment term: ");
    int term = sc.nextInt();

 }
 public  void department(){
           Scanner sc = new Scanner(System.in);
 System.out.println("please, Enter your department: ");
    String Department = sc.nextLine();
 }

 public void birth(){
  Scanner sc = new Scanner(System.in);
      System.out.println("please, day of birth: ");
    int day = sc.nextInt();
    if(day>31 || day<1){
              System.out.println("please, enter your day of birth again: ");
                 birth();
    }
       System.out.println("please, month of birth: ");
    int month = sc.nextInt();
    if(month>12 || month<1){
              System.out.println("please, enter your month of birth again: ");
                  birth();
    }
       System.out.println("please, year of birth: ");
    int year = sc.nextInt();
    if(year>mycalobj.get(Calendar.YEAR) || year<1980 ){
              System.out.println("please, enter your year of birth bewtween(1980 : " + mycalobj.get(Calendar.YEAR) + ")");
                  birth();
    }
    int age = mycalobj.get(Calendar.YEAR)-year ;
  System.out.println("your current age is: " + age); 

}
 

}