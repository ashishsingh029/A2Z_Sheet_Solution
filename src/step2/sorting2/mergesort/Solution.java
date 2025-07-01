package step2.sorting2.mergesort;

public class Solution {
    public void merge(int []A, int p, int q, int r) {
        int i,j,k;
        i = p;
        j = q+1;
        k = 0;
        int []B = new int[r-p+1];
        while(i<=q && j<=r)
        {
            if(A[i]<A[j])
            {
                B[k] = A[i];
                i++;
            }
            else
            {
                B[k] = A[j];
                j++;
            }
            k++;
        }
        while(i<=q)
        {
            B[k] = A[i];
            k++;
            i++;
        }
        while(j<=r)
        {
            B[k] = A[j];
            k++;
            j++;
        }
        for(i=p,j=0;i<=r;i++,j++) {
            A[i] = B[j];
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l >= r) {
            return;
        }
        int mid = l + (r - l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
}
