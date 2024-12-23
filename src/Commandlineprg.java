public class Commandlineprg {

    public static void main(String[] args) {

        System.out.println("you have passed following number of Commandline args "+args.length);

        for(int i=0;i< args.length;i++){
            System.out.println("commandline argument no %d is %s"+i +args[i]);
        }
    }
}
