class Counter {
    // 1. Changed return type to 'void' since we are only printing
    public void count(int[] nums) {
        
        // 2. Initialized the array with a size of 10
        int[] hashtable = new int[10]; 

        for (int num : nums) {
            // Increments the count at the index of the number
            hashtable[num]++;
        }
        
        // Prints the frequency of the number 3
        System.out.println("Frequency of 3: " + hashtable[3]); 
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 2, 1, 6, 1, 0, 3};
        Counter c = new Counter();
        c.count(arr);
    }
}