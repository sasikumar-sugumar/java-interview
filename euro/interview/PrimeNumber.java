package euro.interview;

public class PrimeNumber {
	
	public static void main(String[] args){
		prime(100);
	}
	
	private static void prime(int x){
		int y = 1;
		while(y<x){
			y=y+1;
			if(y%2==0){
			System.out.println(y);
			}
		}
	}

}
