package myjava;

import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[]names = {"陈芳平","陈爽","丁菁","耿林灿","胡芯蕊"};
		for(int i = 0;i< names.length;i++);
		int number = scan.nextInt();
		if(number == 1)
			System.out.println("陈芳平");
		else if(number == 2)
			System.out.println("陈爽");
		else if(number == 3)
			System.out.println("丁菁");
		else if(number == 4)
			System.out.println("耿林灿");
		else if(number == 5)
			System.out.println("胡芯蕊");
		else
			System.out.println("无此人");
		scan.close();

	}

}
