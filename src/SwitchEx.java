public class SwitchEx {
    public static void main(String[] args) {
        int dayofweek = 2;

        switch (dayofweek) {
            case 1:
                System.out.println("this is monday");
                break;
            case 2:
                System.out.println("this is tuesday");
                break;
            default:
               System.out.println("this is not a week day given");
        }

    }
}
