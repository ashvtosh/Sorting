public class BubbleSort {
    public void bubbleSort(int A[], int n){
        for(int pass=n-1;pass>=0;pass--){
            for(int i=0;i<pass;i++){
                if(A[i]> A[i+1]){
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
    }
    public void display(int A[], int n){
        for(int i=0;i<n;i++)
            System.out.println(A[i]+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSort s =  new BubbleSort();
        int A[] = {3,5,8,9,6,2};
        System.out.println("Original Array");
        s.display(A,6);
        s.bubbleSort(A,6);
        System.out.println("Sorted Array");
        s.display(A,6);
    }
}
