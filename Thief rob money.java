import java.util.*;
public class money {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int house = s.nextInt();
		int money = s.nextInt();
		int odd = 0, even = 0; 
		if(house % 2 == 1) {
			for(int i = 1; i <= house; i++) {
				if(i%2==1)
				odd++; 
			}
		System.out.println(odd*money);
		}
		else {
			for(int j = 1; j <= house; j++) {
				if(j%2==0)
				even++;
			}
		System.out.println(even*money);
		}
	}
}
