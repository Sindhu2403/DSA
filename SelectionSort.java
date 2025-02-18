// Java program for implementation of Selection Sort
class SelectionSort {
    
    // Function to perform Selection Sort
    void sort(int a[]) {
        int n = a.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            
            // Find the minimum element in the unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) { 
                if (a[j] < a[min_idx]) {  
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    // Function to print an array
    void printArray(int a[]) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int[] a = { 64, 25, 12, 22, 11 };  

        System.out.println("Original array:");
        ob.printArray(a);

        ob.sort(a);
        
        System.out.println("Sorted array:");
        ob.printArray(a);
    }
}



