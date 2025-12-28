import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char x = scan.next().charAt(0);
		if(x == '女')
			System.out.println(x + "去女厕所");
		else
			System.out.println(x + "去男厕所");
		scan.close();
	}

}
