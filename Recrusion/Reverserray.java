public class Reverserray {
    // Function to reverse the array using recursion
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap the elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(arr);

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed Array:");
        printArray(arr);
    }
}
