package oopsprogramming;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
       // dog1.Setproperties("Alsassian","white");
        dog1.breed = "dabarman";
        dog1.color = "black";
        Dog dog2 = new Dog();
        dog2.Setproperties("Lambrador","grey");

        System.out.println("dog1 breed and color is " +dog1.getbreed() + dog1.getColor()) ;

        System.out.println("dog2 breed and color is " +dog2.getbreed() + dog2.getColor()) ;


        //3rd way by user input
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter third dog details : ");
        Dog dog3 = new Dog();

        System.out.println("please enter color of dog");
        dog3.color =  sc.next();
        System.out.println("please enter breed of dog");
        dog3.breed = sc.next();
        System.out.println("you have provided following details of dog3");
        System.out.println("color -->" +dog3.getColor());
        System.out.println("breeed -->" +dog3.getbreed());

    }
}
