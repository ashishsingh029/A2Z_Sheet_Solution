package step2.sorting1.selectionsort;

public class Solution {
    public void selectionSort(int []arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int minIdx = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swapping
            arr[minIdx] = (arr[minIdx] + arr[i]) - (arr[i] = arr[minIdx]);
        }
    }
}
