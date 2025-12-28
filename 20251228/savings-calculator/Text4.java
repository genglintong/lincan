public class Text4 {

	public static void main(String[] args) {
		int a = 4200; // 【建议】变量命名可以更清晰：targetAmount
		int b = 100;  // 【建议】变量命名可以更清晰：yearlyAmount
		int c = 0;    // 【建议】变量命名可以更清晰：totalSaved
		for(int i =0;c<a;i++) { // 【点评】for循环用法正确，i代表年数
			{ // 【多余】这个花括号是多余的，但不影响功能
				c += b;
				System.out.println("第"+i+"年：攒了"+b+"元，总共"+c+"元"); // 【注意】年份从0开始，应该是i+1年
			}
		}
				System.out.println("已攒够"+a+"元，需要"+(c/b)+"年。"); // 【点评】计算年数正确
			} // 【多余】多了一个右花括号

	}
	// 【建议】改进方案：
	// 1. 使用更清晰的变量名：targetAmount, yearlyAmount, totalSaved, year
	// 2. 年份显示改为：System.out.println("第"+(i+1)+"年...")
	// 3. 可以加入输入功能，让用户自定义目标和每年存款
	// 4. 删除多余的花括号，保持代码简洁


