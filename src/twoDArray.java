public class twoDArray {
    public static void main(String[] args) {

        int arr[][] = new int[2][3];
        int r=0,c=0;
         arr[0][0] =111 ;
        arr[0][1] = 112;
        arr[0][2] =113 ;
        arr[1][0] =114 ;
        arr[1][1] = 115;
        arr[1][2] = 116;

        for(r=0 ;r<=2;r++){
            for(c=0;c<=2;c++){
                System.out.println("value = "+arr[r][c]);
            }
        }



    }
}
