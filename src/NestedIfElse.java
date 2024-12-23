public class NestedIfElse {


    public static void main(String[] args) {
        int no = 21;

         if(no%2==0){

             if(no%5==0){
                 System.out.println("multiple of 5");
             }
             else {
                 System.out.println("not a multiple of 5");
             }

         }
         else{
             System.out.println("given number is not a even number");
         }
    }
}
