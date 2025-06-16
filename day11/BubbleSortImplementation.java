package day11;

public class BubbleSortImplementation {		
	
	public static void main(String[] args) {
	
		int[] numbers = {3,1,4,6,2,7,3,2,7,7,2,};
		System.out.println("ArrayList before sorting the value : ");
		for(int s : numbers) {
			System.out.print(s + " ");
		}
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = 0; j < numbers.length-i-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		
		System.out.println("\n\nArrayList after sorting the value : ");
		for(int s : numbers) {
			System.out.print(s + " ");
		}
		
		//Sorting names using bubble sort
		String names[] = {"vamsi", "krishna", "saketh", "praveen", "kushal"};
		System.out.println("\nArray before sorting: ");
		for(String name: names) {
			System.out.print(name + " ");
		}
		
		//Sorting the name array
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names.length-i-1; j++) {
				if(names[j].compareTo(names[j+1]) > 0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
				
			}
		}
		
		System.out.println("\nArray before sorting: ");
		for(String name: names) {
			System.out.print(name + " ");
		}
		
		
	}

}
