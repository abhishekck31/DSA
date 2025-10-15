public class sortbyrec {
    // Recursive function to sort the array
    public static void sort(int arr[], int n) {
        // Base case
        if (n <= 1) {
            return;
        }
        // Sort first n-1 elements
        sort(arr, n - 1);

        // Insert last element at its correct position in sorted array
        int last = arr[n - 1];
        int j = n - 2;
        // This part is handled after the recursive call, so nothing is needed here.
        // Move elements greater than last to one position ahead
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 5, 6};
        sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}