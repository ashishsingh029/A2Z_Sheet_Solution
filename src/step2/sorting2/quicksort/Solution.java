package step2.sorting2.quicksort;

public class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low >= high) {
            return;
        }
        int part = partition(arr, low, high);
        quickSort(arr, low, part - 1);
        quickSort(arr, part + 1, high);
    }

    public int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int j = low;
        int pivot = arr[high];
        while(j < high) {
            if(arr[j] < pivot) {
                i++;
                arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
            }
            j++;
        }
        arr[i + 1] = (arr[i + 1] + arr[high]) - (arr[high] = arr[i + 1]);
        return i + 1;
    }
}
