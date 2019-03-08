package Project_1;
import java.util.Scanner;
public class Build_A_Wall {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		
		//dimensions of wall
		int h = banter.nextInt();
		int w = banter.nextInt();
		int numOfBricks = banter.nextInt();
		int [] brickLengths = new int[numOfBricks];
		int usedBricks = 0;
		int widthLeft = w;
		int i = 0; 
		boolean answer = false;
		boolean notFinished = true;
		
		//enter all the lengths
		for(int o = 0; o < numOfBricks; o++) {
			brickLengths[o] = banter.nextInt();	
		}
		
		
		while(notFinished) {
			if(usedBricks > numOfBricks) {
				notFinished = false; 
				answer = false;	
			}
			
			if(widthLeft - brickLengths[i] >=0 ) {
				widthLeft -= brickLengths[i];
			}else {
				notFinished = false;
				answer = false;
			}
			
			if(widthLeft == 0 && h > 1) {
				widthLeft = w;
				h--;
			}else if(widthLeft == 0 && h == 1) {
				notFinished = false;
				answer = true;
			}
			
			
		}
		
		
		
		//print answer
		if(answer == false) {
			System.out.println("NO");
		}else if(answer == true) {
			System.out.println("YES");
		}
		
	}
}
