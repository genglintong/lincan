import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[]names = {"陈芳平","陈爽","丁菁","耿林灿","胡芯蕊"}; // 【点评】数组定义正确
		for(int i = 0;i< names.length;i++); // 【错误】这里有分号！循环体为空，相当于没有执行循环
		int number = scan.nextInt();
		if(number == 1) // 【点评】逻辑清晰，但代码重复
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
			System.out.println("无此人"); // 【点评】边界处理不错
		scan.close();

	}
	// 【建议】更优雅的写法：
	// if(number >= 1 && number <= names.length) {
	//     System.out.println(names[number-1]);
	// } else {
	//     System.out.println("无此人");
	// }
	// 优点：代码简洁，易于维护，数组长度变化时无需修改逻辑

}
