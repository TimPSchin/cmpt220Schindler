package softwareDevelopement;

public class MyLong {

	long value;
	
	public MyLong(long value) {
		this.value = value;
	}
	
	public long getValue() {
		return value;
	}
	
	public boolean isEven() {
		if(value % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime() {
		for (int divisor = 2; divisor <=value/2; divisor++) {
			if(value % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isOdd() {
		if(value % 2 > 0) {
			return true;
		}
		return false;
	}
	
	public boolean isEven(long value) {
		if(value % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd(long value) {
		if(value % 2 > 0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime(long value) {
		for (int divisor = 2; divisor <=value/2; divisor++) {
			if(value % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyLong value) {
		return value.isEven();
	}
	
	public static boolean isOdd(MyLong value) {
		return value.isOdd();
	}
	
	public static boolean isPrime(MyLong value) {
		return value.isPrime();
	}
	
	boolean equals(long value) {
		return this.value == value;
	}
	
	boolean equals(MyLong value) {
		return this.value == value.getValue();
	}
	
	public static long[] parseLong(char[] x) {
		long hold = 0;
		for(int i = 0; i < x.length; i++) {
			hold *= 10 + (x[i] - '0');
		}
		return hold;
	}
	
	public static long[] parseLong(String x) {
		long hold = 0;
		for(int i = 0; i < x.length(); i++) {
			hold *= 10 + (x.charAt(i) - '0');
		}
		return hold;
	}
}

