import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
       int[] array = {19,22,3,28,26,17,18,4,28,0};
       System.out.println("input: " + Arrays.toString(array)); // print array

       // Call function to get reversed array
       int[] reversedArray = reverse(array);
       System.out.println("output: " + Arrays.toString(reversedArray)); // print reversed array
   }

   // Method returns a new reversed array, based on the array which was passed to it.
   static int[] reverse(int[] array) {
       int[] newArray = new int[array.length];

       for (int i = 0; i < array.length; i++) {
           newArray[array.length - 1 - i] = array[i];
       }

       return newArray;
   }
}
