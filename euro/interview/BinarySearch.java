package euro.interview;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args){
		int searchText[] = {10,9,8,54,24,54,12,23};
		Arrays.sort(searchText);
		search(searchText, 24);
	}
	
	private static int search(int[] searchText,int search){
		int elementFound = 0;
		int first = 0;
		int last = searchText.length;
		int middle = last/2;
		while( first <= last){System.out.println("First " + middle);
		System.out.println("Last " + middle);
		System.out.println("First " + middle);
		System.out.println("Last " + middle);
		
			System.out.println("First " + first);
			System.out.println("Last " + last);
			System.out.println("Middle " + middle);
			if(search < searchText[middle] ){
				last = middle-1;
			}
			else if(search > searchText[middle] ){
				first = middle +1;
			}else{
				elementFound = searchText[middle];
				System.out.println(elementFound);
				break;
			}
			
			middle = ((last+first)/2);
			System.out.println("updated First " + first);
			System.out.println("updated Last " + last);
			
			System.out.println("Updated Middle " + middle);

		}
		return elementFound;
	}

}
