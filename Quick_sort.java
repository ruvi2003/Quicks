package recursion;

public class Quick_sort {
		    
		    
		    private static int partition(int[] array, int low, int high) {
		        int pivot = array[high];
		        int i = (low - 1);

		        for (int j = low; j < high; j++) {
		            if (array[j] < pivot) {
		                i++;

		                // Swap array[i] and array[j]
		                int temp = array[i];
		                array[i] = array[j];
		                array[j] = temp;
		            }
		        }
		        int temp = array[i + 1];
		        array[i + 1] = array[high];
		        array[high] = temp;

		        return i + 1;
		    }

		    // Recursive method to sort the array
		    private static void quickSort(int[] array, int low, int high) {
		        if (low < high) {
		            
		            int partitionIndex = partition(array, low, high);

		           
		            quickSort(array, low, partitionIndex - 1);
		            quickSort(array, partitionIndex + 1, high);
		        }
		    }

		    // Method to print the array
		    private static void printArray(int[] array) {
		        for (int element : array) {
		            System.out.print(element + " ");
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        int[] array = {10, 7, 8, 9, 1, 5};
		        int n = array.length;

		        System.out.println("Original array:");
		        printArray(array);

		        quickSort(array, 0, n - 1);

		        System.out.println("Sorted array:");
		        printArray(array);
		    }

	}
