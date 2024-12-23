import java.util.Scanner;

public class Arrayswithinput {
    public static void main(String[] args) {

        int arr[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 5 array elements");

        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("you have entered following array elements ");
        for (int i=0;i<arr.length;i++){
            System.out.println("value at index "+i +  arr[i]);
        }
        System.out.println("summation of array element = ");

        for (int i =0;i<arr.length;i++)
        {
           sum += arr[i];
        }

        System.out.println("summation is " + sum);


    }
}
