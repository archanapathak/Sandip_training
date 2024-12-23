import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class JavaArray1 {
    public static void main(String[] args) {


          int arr[] = new int[5];  // 5 is size of array declared

        arr[0] = 101; // initialised
        arr[1] = 102;
        arr[2] = 103;
        arr[3] = 104;
        arr[4] = 105;

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        Integer arr2[] = {101,102,103,104};  // direct declare and intialization

        for(int i :arr2){    //for each loop
            System.out.println(i);
        }

        List<Integer> numbers = Arrays.asList(arr2);

        // Step 1: Find the second largest number in the list
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Step 2: Remove duplicates
                .sorted(Comparator.reverseOrder()) // Step 3: Sort in descending order
                .skip(1) // Step 4: Skip the first (largest) number
                .findFirst(); // Step 5: Get the second largest number
System.out.println("second largest" +secondLargest);
    }
}
