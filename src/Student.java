import java.util.Scanner;

public class Student {
    int id;
    String fulName;
    int age;
    String group;

    public void getId( Student[] ids){
        Scanner scanner=new Scanner(System.in);
        int id=scanner.nextInt();
        switch ( id){
            case 1234567:
                System.out.println("Amin Amirbekov:"+20+" "+"1-komp");
            case 1334566:
                System.out.println("Amir Arek:"+20+" "+"2-imp");
                break;
            case 1434566:
                System.out.println("Amina Beko:"+20+" "+"3-mp");
                break;
            case 1534566:
                System.out.println("Inna Kan:"+20+" "+"4-kop");
                break;
            case 1634566:
                System.out.println("Arina Miro:"+20+" "+"5-kom");
                break;
        }

        }
           }











