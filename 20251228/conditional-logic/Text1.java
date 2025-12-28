import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char x = scan.next().charAt(0); // 【点评】直接取第一个字符，简洁有效
		if(x == '女') // 【点评】使用字符比较，语法正确
			System.out.println(x + "去女厕所");
		else
			System.out.println(x + "去男厕所");
		scan.close(); // 【点评】记得关闭Scanner，资源管理良好
	}
	// 【建议】可以考虑：
	// 1. 加入输入提示：System.out.print("请输入性别(男/女): ");
	// 2. 使用switch语句处理多种情况
	// 3. 添加输入验证，处理无效输入
}
