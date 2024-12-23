import javax.sound.midi.SysexMessage;

public class Incrementdecrementoperator {

    public static void main(String[] args) {
        //++ --  unary operator

        int a= 1;
       // a++; pre post
        System.out.println(++a);//2
        System.out.println(a++);
        System.out.println(a);//3

        System.out.println(--a);//2
        System.out.println(a--);
        System.out.println(a);//1
    }
}
