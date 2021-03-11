
import java.util.Arrays;


public class MainProgram {
    
    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
    // write your code here
    int smallest = array[0];
        for (int element : array) {
            if(element < smallest) {
                smallest = element;
            }

        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
    // write your code here
        int smallest = smallest(array);
        
        int i = 0;
        
        while (i < array.length) {
            if(array[i] == smallest) {
                return i;
            } 
            i += 1;
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int indexOfSmallest = 0;
        
        for (int i = startIndex; i < array.length; i++) {
            if(array[i] <= smallest) {
                indexOfSmallest = i;
                smallest = array[i];
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int holder = array[index1];
        
        array[index1] = array[index2];
        array[index2] = holder;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.println(Arrays.toString(array));
            int smallestValue = array[i];
            if(array[i] <= smallestValue) {
                swap(array, i, indexOfSmallestFrom(array, i));
            } 
        }
    }
}
