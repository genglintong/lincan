public class Text6 {

	public static void main(String[] args) {
		int[]a = {85, 92, 76, 88, 95, 68, 72, 81, 79, 91, 83, 77, 65, 89, 94, 71, 84, 58, 96, 73, 82, 90, 69, 75, 87, 93, 80, 64, 78, 86};
		int n =  a.length; // 【点评】用变量保存长度，代码可读性好
		for(int i = 1;i<n;i++) { // 【点评】冒泡排序实现正确
			for(int j =  0;j<n-1;j++) {
				if(a[j]<a[j+1]) { // 【点评】降序排序逻辑正确
					int t = a[j]; // 【点评】交换逻辑正确，变量命名可以更清晰
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("前十名：");
		for(int i= 0;i<Math.min(10, a.length-10);i++) { // 【错误】应该是Math.min(10, a.length)
			System.out.println(a[i]+" ");
		}
	}
	// 【建议】改进方案：
	// 1. 使用Arrays.sort(a, Collections.reverseOrder())更简洁
	// 2. 交换变量可以命名为temp，更清晰
	// 3. 可以优化冒泡排序：添加标志位检测是否已排序完成
	// 4. 循环条件改为：Math.min(10, a.length)
}
