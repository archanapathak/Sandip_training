import java.util.Scanner;

public class TwoDaaraywithuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        int r=0,c=0;
        System.out.println("please enter array elements ");

        for(r=0 ;r<2;r++){
            for(c=0;c<3;c++){
               arr[r][c] = sc.nextInt();
            }
        }

        System.out.println("you have entered following array elements ");

        for(r=0 ;r<2;r++){
            for(c=0;c<3;c++){
                System.out.print("\t "+arr[r][c]);
            }
            System.out.println();
        }
    }
}
