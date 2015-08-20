/**
 * 
 */
package euro.interview;

import java.util.Arrays;


/**
 * @author euro
 *
 */
public class Calculator {
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		System.out.println(calculator.calculate("10+1 * 2"));
	}
	
	

	public int calculate(String s) {
		int values[] = new int[s.length()];
		String symbols[] = new String[s.length()];
		int i = 0;
		int j = 0;
		for (int index = 0; index < s.length(); index++) {
			String tokenValue = "" + s.charAt(index);
			tokenValue = tokenValue.trim();
			if (isInteger(tokenValue)) {
				values[i++] = Integer.parseInt(tokenValue);
			} else if (!tokenValue.equals("")) {
				symbols[j++] = tokenValue;
			}
		}
		int x = values[0];
		int sym = 0;
		int value = 0;
		for (int k = 1; k < values.length; k++) {
			int y = values[k];
			if ("+".equals(symbols[sym])) {
				x = add(x, y);
			}
			if ("-".equals(symbols[sym])) {
				x = subtract(x, y);
			}
			if ("*".equals(symbols[sym])) {
				x = multiply(x, y);
			}
			if ("/".equals(symbols[sym])) {
				x = divide(x, y);
			}
		}

		return x;
	}
    
    public boolean isInteger(String value){
        try{
        int intValue = Integer.parseInt(value);
        }catch(Exception r){
            return false;
        }
        return true;
    }
    
    public int add(int x,int y){
        return x+y;
    }
    
    public int subtract(int x,int y){
        return x-y;
    }
    
    public int multiply(int x,int y){
        return x*y;
    }
    
    public int divide(int x,int y){
        return x/y;
    }
    
}
