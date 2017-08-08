package DogBarkDemo;

import java.util.*;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BigDog bigdog = new BigDog();
		bigdog.bark();
		System.out.println("请输入一个整数~~~");
		int shout=scanner.nextInt();
		bigdog.bark(shout);
	}

}
