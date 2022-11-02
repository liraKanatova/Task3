import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student= new Student();
        student.id=1234567;
        student.fulName="Amin Amirbekov";
        student.age=20;
        student.group="1-komp";

        Student student1= new Student();
        student1.id=1334566;
        student1.fulName="Amir Arek";
        student1.age=20;
        student1.group="2-imp";

        Student student2= new Student();
        student2.id=1434566;
        student2.fulName="Amina Beko";
        student2.age=20;
        student2.group="3-mp";

        Student student3= new Student();
        student3.id=1534566;
        student3.fulName="Inna Kan";
        student3.age=20;
        student3.group="4-kop";

        Student student4= new Student();
        student4.id=1634566;
        student4.fulName="Arina Miro";
        student4.age=20;
        student4.group="5-kom";
     Student [] ids={student,student1,student2,student3,student4};

         student.getId(ids);
    }
}