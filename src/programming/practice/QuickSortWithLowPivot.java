package programming.practice;

public class QuickSortWithLowPivot {
	public static void main(String[] args) {
		int arr[] = {4, 1, 6, 8, 0, 10, 9, 13, 2};
		quickSort(arr, 0, arr.length-1);
		for(int n: arr) {
			System.out.print(n+" ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex -1);
			quickSort(arr, pivotIndex+1, high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = high+1;
		for(int j=high;j>low;j--) {
			if(arr[j]>pivot) {
				i--;
				swap(arr, i, j);
			}
		}
		swap(arr, i-1, low);
		return i-1;
	}

	private static void swap(int[] arr, int i, int j) {
		if(i!=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
