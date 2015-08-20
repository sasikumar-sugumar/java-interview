/**
 * 
 */
package euro.interview;

import java.util.Stack;

/**
 * @author euro
 *
 */
public class ReversePolishNotation {
	
	public static void main(String args[]){
		String[] values = {"1","2","+","3","*"};
		System.out.println(evaluate(values));
	}
	
	public static int evaluate(String[] values) {
		int returnValue = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		for(String token : values){
			if(!operators.contains(token)){
				stack.push(token);
			}else{
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(token);
				switch(index){
				case 0:
					stack.push(String.valueOf(a+b));
				break;
				case 1:
					stack.push(String.valueOf(a-b));
					break;
				case 2:
					stack.push(String.valueOf(a*b));
					break;
				case 3:
					stack.push(String.valueOf(a/b));
					break;
				}
			}
		}
		
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}

}
