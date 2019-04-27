package softwareDevelopement;

public class bin2Dec {

	public int binary2Decimal(String binaryString){
		int number = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1' ) {
				number += 2;
			}else if(binaryString.charAt(i) != '0'){
				throw new NumberFormatException();
			}
			number *= 2;
		}
		number /= 2;
		return number;
	}
}
