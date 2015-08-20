/**
 * 
 */
package euro.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author euro
 *
 */
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int values[] = {-1, 0, 1, 2, -1, -4};
		/*List<List<Integer>> returnValue = new ArrayList<List<Integer>>();
		List<Integer> elements = new ArrayList<Integer>();
		for(int i=0;i<values.length;i++){
			for(int j=i+1;j<values.length;j++){
				for(int k=j+1;k<values.length;k++){
					int sum = values[i]+values[j]+values[k];
					if(sum == 0){
						elements.add(values[i]);
						elements.add(values[j]);
						elements.add(values[k]);
						returnValue.add(elements);
						elements.clear();
					}
				}
			}
		}*/
		threeSum(values);
		
	}
	
	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		if (num.length < 3)
			return result;
	 
		// sort array
		Arrays.sort(num);
	 
		for (int i = 0; i < num.length - 2; i++) {
			// //avoid duplicate solutions
			if (i == 0 || num[i] > num[i - 1]) {
	 
				int negate = -num[i];
	 
				int start = i + 1;
				int end = num.length - 1;
	 
				while (start < end) {
					//case 1
					if (num[start] + num[end] == negate) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);
	 
						result.add(temp);
						start++;
						end--;
						//avoid duplicate solutions
						while (start < end && num[end] == num[end + 1])
							end--;
	 
						while (start < end && num[start] == num[start - 1])
							start++;
					//case 2
					} else if (num[start] + num[end] < negate) {
						start++;
					//case 3
					} else {
						end--;
					}
				}
	 
			}
		}
	 
		return result;
	}

}
