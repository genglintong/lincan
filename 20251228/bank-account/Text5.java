public class Text5 {

	public static void main(String[] args) {
		Account myAccount = new Account(1000.0); // 【点评】对象创建正确，初始余额1000
		myAccount.show(); // 【点评】调用方法显示余额
		myAccount.save(500.0); // 【点评】存款500元
		myAccount.show(); // 【点评】再次显示余额，验证存款结果
	}
	// 【点评】代码简洁明了，很好地演示了Account类的使用
	// 【建议】可以尝试：
	// 1. 创建多个Account对象，对比不同账户
	// 2. 添加用户交互，让用户输入存款金额
	// 3. 添加循环，模拟多次存款操作

}
