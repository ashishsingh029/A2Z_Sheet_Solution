import step2.sorting1.selectionsort.Solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/input.txt");
        Scanner in = new Scanner(file);
        Solution solution = new Solution();
        int []arr = { 4, 1, 3, 9, 7 };
        solution.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}