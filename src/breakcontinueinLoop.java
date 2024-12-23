public class breakcontinueinLoop {

    public static void main(String[] args) {

        for(int i=0;i<=10;i++){

            System.out.println("i ="+i);
            if(i==6)
            {
                System.out.println("i is 6 now , lets break...");
                break;
            }
        }


        for(int i=0;i<=10;i++){

            if(i==6)
            {
                System.out.println("breaking at "+i);
                continue;

            }
            System.out.println("i is"+i +"  now ");
            System.out.println("i ="+i);
        }
    }
}
