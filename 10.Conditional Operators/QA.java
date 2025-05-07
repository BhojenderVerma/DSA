/*Write a Java program to get a number from the user and print whether it is
positive or negative.*/
/*import java.util.*;
public class QA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
*/

/*Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever.*/

/*public class QA {
public static void main(String[] args) {
double temp = 103.5;
if(temp >= 100){
    System.out.println("you have fever");
}else{
    System.out.println("you don't have fever");
}
}
}*/


// Write a Java program to input week number(1-7) and print day of week name using switch case.
/*import java.util.*;
public class QA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter between 1-7");
        int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("sunday");
            break;
            case 2 : System.out.println("monday");
            break;
            case 3 : System.out.println("tue");
            break;
            case 4 : System.out.println("wed");
            break;
            case 5 : System.out.println("thu");
            break;
            case 6 : System.out.println("fri");
            break;
            case 7 : System.out.println("sat");
            break;
            default:
                System.out.println("option is out of range");
        }
    }
}*/


/*Write a Java program that takes a year from the user and print whether that
year is a leap year or not.*/
import java.util.*;
public class QA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100==0) && (year % 400==0));
        if (x && (y || z)){
            System.out.println("year is leap year");
        }else{
            System.out.println("year is not leap");
        }
    }
}