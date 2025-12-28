public class Text3 {

	public static void main(String[] args) {
		int[]arr = {87,65,92,78,53,89,74,95,61,82}; // 【点评】数组初始化正确
		int max = arr[0]; // 【点评】用第一个元素初始化最大值，思路正确
		for(int i=1;i<arr.length;i++) // 【点评】从索引1开始，避免重复比较，效率好
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int sum = 0; // 【点评】累加思路正确
		for(int i= 0;i<arr.length;i++) {
			sum +=arr[i];
		}
		double aver = sum*1.0/arr.length; // 【点评】*1.0强制转换为double，避免整数除法，很好
		int pass =0;
		for(int i :arr) { // 【点评】使用增强for循环，代码简洁优雅
			if(i>=60) {
				pass++;
			}
		}
		double rate =pass*100.0/arr.length; // 【点评】计算百分比正确
		System.out.println("最高分为："+max);
		System.out.println("总分为："+sum);
		System.out.println("平均分为："+aver);
		System.out.println("及格率为："+rate+"%");
		} // 【注意】多了一个右花括号
	
	}
	// 【建议】可以改进的地方：
	// 1. 使用Arrays.stream(arr).max().orElse(0)求最大值
	// 2. 使用DecimalFormat格式化小数显示
	// 3. 可以将每个计算封装成独立的方法，提高代码可读性


