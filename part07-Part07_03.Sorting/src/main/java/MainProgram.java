
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int small = array[0];

        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        // write your code here
        int small = array[0];
        int smallIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
                smallIndex = i;
            }
        }
        
        return smallIndex;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // write your code here
        int small = array[startIndex];
        int smallIndex = startIndex;
        
        for (int i = startIndex; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
                smallIndex = i;
            }
        }
        
        return smallIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        // Before sorted print
        System.out.println(Arrays.toString(array));
        
        // Sort
        for (int i = 0; i < array.length; i++){
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            
            // After sorted print
            System.out.println(Arrays.toString(array));
        }
        
    }

}
