
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Employee{
    String id;
    String name;
    String dob;
    String mail;
    LocalDate joininDate;
    String type;

    int vacationalLeave;
    int sickLeave;

    public Employee(String id, String name, String dob, String mail, String type, LocalDate joininDate){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mail = mail;
        this.type = type;
        this.joininDate = joininDate;

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


    }

}

public class Main {
    public static void main(String[] args) {

    }
}