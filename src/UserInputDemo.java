import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputDemo {

    public static void main(String[] args) {

        String str=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
             str = br.readLine();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("welcome to user inpts in java " +str);
    }
}
