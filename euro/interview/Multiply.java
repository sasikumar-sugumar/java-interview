package euro.interview;

public class Multiply {
	
	public static void main(String args[]){
		System.out.println(mul(20, -30));
		System.out.println(reverseRecursively("sasikumar"));
	}
	
	private static int multiply(int x,int y){
		int answer = 0;
		for (int i=1;i<=y;i++){
			answer = answer + x;
		}
	
		return answer;
	}
	
	private static int mul(int x,int y){
		if(y == 0)
			return 0;
		if (y > 0){
			return (x + mul(x,y-1));
		}
		if (y < 0){
			return -mul(x,-y);
		}
		return 0;
	}
	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
        	System.out.println("new-sub : " + str);
        	//System.out.println(str);
            return str;
        }
        
        //System.out.println(str.charAt(0));
        //System.out.println(str);

		test = test + str.charAt(0);

		System.out.println("substring : " + str.substring(1) + str.charAt(0));

		String test =  reverseRecursively(str.substring(1)) + str.charAt(0);
		System.out.println("-");
		System.out.println("output : " + test);
		return test;

    }
	
	private static String test;



}
