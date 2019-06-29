package ListConcept;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,2,3};
		System.out.println("Given Array");
		printArray(arr,6);
		sortArray(arr);
		System.out.println();
		System.out.println("Array after removing the duplicates");
		removeDuplicates(arr);
	}

	private static void removeDuplicates(int[] arr) {
		int resultedArray[]= new int[6];
		int j=0;
		for(int i=0;i<6;i++,j++) {
			resultedArray[j] = arr[i];
			for(int k=i+1;k<6;k++) {
				if(arr[i] == arr[k]) {
					i++;
				}else {
					break;
				}
			}
		}
		printArray(resultedArray,j);
	}
	private static void sortArray(int[] arr) {
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<6;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	private static void printArray(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
