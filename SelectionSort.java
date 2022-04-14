public class SelectionSort {
    public void Selectionsort(int A[], int n){
        for(int i=0;i<n-1;i++){
            int position = i;
            for(int j=i+1;j<n;j++)
                if(A[j] < A[position])
                    position = j;
            int temp = A[i];
            A[i] = A[position];
            A[position] = temp;
        }
    }
    public void display(int A[], int n){
        for(int i=0;i<n;i++)
            System.out.println(A[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int A[] = {3,5,8,9,6,2};
        System.out.println("Original Array");
        s.display(A,6);
        s.Selectionsort(A,6);
        System.out.println("Sorted Array");
        s.display(A,6);
    }
}
