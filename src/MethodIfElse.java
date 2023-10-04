import java.util.Scanner;

public class MethodIfElse {
    static void checkAge(int age){

        if (age < 18){
            System.out.println("Acces denied - you are not old enough");
        }else{
            System.out.println("Acces granted - you are old enough");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        checkAge(age);
    }
}
