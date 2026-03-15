
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Employee{
    String id;
    String name;
    String dob;
    String mail;
    LocalDate joiningDate;
    String type;

    int vacationLeave;
    int sickLeave;

    public Employee(String id, String name, String dob, String mail, String type, LocalDate joiningDate){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mail = mail;
        this.type = type;
        this.joiningDate = joiningDate;

        calculateLeave();
    }

    void calculateLeave(){
        int vacationTotal = 0;
        int sickTotal = 0;

        if(type.equalsIgnoreCase("Officer")){
            vacationTotal = 15;
            sickTotal = 10;
        }else{
            vacationTotal = 10;
            sickTotal = 7;
        }

        int daysInYear = joiningDate.isLeapYear() ? 366: 365;
        LocalDate endDate = LocalDate.of(2025, 12, 31);
        long daysWorked = ChronoUnit.DAYS.between(joininDate, endDate)+1;

        double vacationCalc = (daysWorked * vacationTotal) / (double) daysInYear;
        double sickCalc = (daysWorked * sickTotal) / (double) daysInYear;

        vacationLeave = roundLeave(vacationCalc);
        sickLeave = roundLeave(sickCalc);

    }

    int roundLeave(double value){
        if(value - Math.floor(value) < 0.5)
            return (int) Math.floor(value);
        else
            return (int) Math.ceil(value);
    }

    void display(){
        System.out.println("Employee Details----");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Email: "+mail);
        System.out.println("Type: "+type);
        System.out.println("Joining Date: "+joiningDate);
        System.out.println("Vacation Leave: "+vacationLeave);
        System.out.println("Sick Leave: "+sickLeave);
    }
}


public class Main {
    public static void main(String[] args) {

    }
}