public class MergeSort {
    public void MergeSort(int A[], int left, int right){
        if(left < right){
            int mid = (left+right) / 2;
            MergeSort(A,left,mid);
            MergeSort(A,mid+1,right);
            Merge(A,left,mid,right);
        }
    }
    public void Merge(int A[], int left, int mid, int right){
        int i = left;
        int j = mid +1;
        int k = left;
        int B[] = new int[right+1];
        while(i<=mid && j<=right){
            if(A[i] < A[j]){
                B[k] = A[i];
                i = i+1;
            }
            else{
                B[k] = A[j];
                j = j +1;
            }
            k = k+1;
        }
        while(i<=mid){
            B[k] = A[i];
            i = i+1;
            k = k+1;
        }
        while(j<=right){
            B[k] = A[j];
            j = j+1;
            k = k+1;
        }
        for(int x=left; x<right+1; x++)
            A[x] = B[x];
    }
    public void display(int A[], int n){
        for(int i=0;i<n;i++)
            System.out.println(A[i]+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSort s = new MergeSort();
        int A[] = {3,5,8,9,6,2};
        System.out.println("Original Array");
        s.display(A,6);
        s.MergeSort(A,0,5);
        System.out.println("Sorted Array");
        s.display(A,6);
    }
}
