
class BubbleSort {
    
    
    static void bubbleSort(int array[]) {
        int size = array.length;

        
        for (int i = 0; i < size - 1; i++) {
            
            
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int array[]) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
