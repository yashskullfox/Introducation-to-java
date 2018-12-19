package Chapter_01;


        import java.util.*;

public class Exercise_02 {

    public static void main(String[] args) {

        // Create a random number object from 0 to 100.
        // Create an array object.
        Random r = new Random();
        int[] random = new int[100];

        // Insert random numbers into the array
        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt(100) + 1;
        }

        // Printing out the unsorted array
        for (int i = 0; i < random.length; i++) {
            System.out.println(random[i]);
        }

        List<int[]> randomList = Arrays.asList(random);

        // Call the method in here.
        sortElements(randomList);

    }

    // Sort the elements
    private static void sortElements(Collection<int[]> values) {

        Set<int[]> set = new HashSet<int[]>(values);

        for (int[] is : set) {
            System.out.printf("Sorted Elements: %d ", values);
        }

        System.out.println();
    }

    // Calculate Sum of the elements

    // Calculate floating point average of the elements.

}