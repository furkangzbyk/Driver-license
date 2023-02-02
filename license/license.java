import java.util.Scanner;

public class license {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Age:");
        int age = scanner.nextInt();
        System.out.println(age >= 18 ? "You can take Driving License!" : "You can not take Driving License");


    }

}
