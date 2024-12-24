package oopsprogramming;

public class Dog {

    String breed,color; // class variable

    public void Setproperties(String b, String c){

    String dogage = "10years";
        breed = b;
        color = c;
        System.out.println("dog age will be "+dogage);

    }

    public  String getbreed(){
        return breed;
    }
    public String getColor(){
        return color;
    }
}
