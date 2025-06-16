package day11;

public class MergeSort {
	public void  Sort(int[] numbers,int left,int mid,int right) {
		 int n1 = mid - left + 1;
		 int n2 = right  - mid;
		 int[] l = new int[n1];
		 int[] l2 = new int[n2];
		 for(int i =0 ;i < n1;i++)
			 l[i] = numbers[left+i];
		 for(int j =0 ;j < n2; j++)
			 l2[j] = numbers[mid+1+j];
		 int i=0,j=0;
		 int k = left;
		 while(i<n1 && j<n2) {
			 if(l[i] <= l2[j]) {
				 numbers[k] = l[i];
				 i++;
			 }else {
				 numbers[k] = l2[j];
				 j++;
			 }
			 k++;
		 }
		 while(i<n1) {
			 numbers[k] = l[i];
			 i++;
			 k++;
		 }
		 while (j < n2) {
	            numbers[k] = l2[j];
	            j++;
	            k++;
	        }
	}
	void  Sort(int[] numbers,int left,int right) {
		
		if(left<right) {
			int mid = (left+right)/2;
			 Sort(numbers,left,mid);
			 Sort(numbers,mid+1,right);
			 Sort(numbers,left,mid,right);
		}
	}
	static void printArray(int numbers[]) {
		for(int num : numbers)
			System.out.print(num+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		  int[] numbers = {12,11,13,5,6,7};
		  System.out.println("Original Array");
		  printArray(numbers);
		  MergeSort ob = new MergeSort();
		  ob.Sort(numbers, 0, numbers.length-1);
		  System.out.println("sortedArray:");
		  ob.printArray(numbers);
	}

}
