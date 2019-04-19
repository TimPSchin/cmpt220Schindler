package softwareDevelopement;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_8_11_11 {
	
	
	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) 
        {
            for (int j = i + 1; j < list.size(); j++) 
            {
                if (list.get(i) > list.get(j))  {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(i, temp);
                }
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a number:");
			l1.add(banter.nextInt());
		}
		
		sort(l1);
		System.out.println(l1);
	}
	
}
