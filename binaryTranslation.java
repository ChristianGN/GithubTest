public class binaryTranslation{
	public static void main (String[]args){
		decimalToBinary(257);
		
		System.out.println(power(2,5));
		
		binaryToDecimal(10100);
		
		System.out.println(twosCompliment(10100));
	}
	public static int twosCompliment(int n){
		int topValue = 0;
		float temp = n;
		int i = 0;
		while(temp > 0){
			
		}
	}
	public static int power(int n, int p){
		if(p == 0){
			return 1;
		}
		else{
			int i = 0;
			int result = 1;
			while(i < p){
				result = result * n;
				i = i+1;
			}
			return result;
		}
	}
	public static void binaryToDecimal(int n){
		System.out.print("the decimal representation of " + n + ": ");
		int result = 0;
		int i = 0;
		while(n > 0){
			
			
			n = n + 1;
			if (n % 2 == 0){
				result = result + power(2,i);
			}
			i = i + 1;
			n = n/10;
		}
		System.out.println(result);
	}
	public static void decimalToBinary(int n){
		System.out.print("the binary representation of " + n + ": ");
		int lengthFinder = n;
		int length = 0;
		
		while(lengthFinder > 0){
			lengthFinder = lengthFinder / 2;
			length = length + 1; 
		}
		int rest = 0;
		int binary[] = new int[length];
		int index = length - 1;
		
		while(n > 0){
			rest = n%2;
			binary[index] = rest;
			index = index - 1;
			n = n/2;
		}
		int i = 0;
		while(i < length){
			System.out.print(binary[i]);
			i = i+1;
		}
		System.out.println("");
		
	}
}