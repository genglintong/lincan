package myjava;

class Account {
	private double money;
	public Account(double money) {
		super();
		this.money = money;
	}
	public void save(double amount) {
		money += amount;
	}
	public void show() {
		System.out.println("余额："+money);
	}
}

