import java.util.Scanner;

public class CalculatorUsingUserinput {
    public static void main(String[] args) {

        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter two integers for doing arithmetic operation");
        a = sc.nextInt();
        b= sc.nextInt();

        c = a+b;
        System.out.println("addition is " +c);

        c = a/b;
        System.out.println("division is " +c);

    }
}
