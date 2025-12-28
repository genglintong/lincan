class Account { // 【建议】可以加public修饰符，便于其他包访问
	private double money; // 【点评】使用private封装，面向对象概念正确
	public Account(double money) { // 【点评】构造方法正确
		super(); // 【多余】调用Object的构造方法，可以省略
		this.money = money; // 【点评】this关键字使用正确，区分参数和成员变量
	}
	public void save(double amount) { // 【点评】存款方法简洁明了
		money += amount; // 【建议】可以加入参数验证：if(amount > 0)
	}
	public void show() { // 【点评】显示余额方法正确
		System.out.println("余额："+money);
	}
}
// 【总体评价】类设计简洁，封装性良好，适合初学者
// 【建议】可以添加：
// 1. 取款方法withdraw(double amount)
// 2. 参数验证（金额不能为负）
// 3. getter方法获取余额
// 4. 格式化金额显示（保留两位小数）

