public class OOpsIntro {

    String username = "archana p";

   public void sayHi(){
       System.out.println("hello welcome to class and object programming");
   }

    public static void main(String[] args) {
// classname objectname = new OOpsIntro();

        OOpsIntro oopsintroobject = new OOpsIntro(); // instatiation of object , object instance created

       oopsintroobject.sayHi();  // calling method of this class

        System.out.println("welcome dear ...." +oopsintroobject.username);
    }
}
