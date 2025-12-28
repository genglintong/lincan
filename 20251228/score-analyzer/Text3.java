public class Text3 {

	public static void main(String[] args) {
		int[]arr = {87,65,92,78,53,89,74,95,61,82};
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int sum = 0;
		for(int i= 0;i<arr.length;i++) {
			sum +=arr[i];
		}
		double aver = sum*1.0/arr.length;
		int pass =0;
		for(int i :arr) {
			if(i>=60) {
				pass++;
			}
		}
		double rate =pass*100.0/arr.length;
		System.out.println("最高分为："+max);
		System.out.println("总分为："+sum);
		System.out.println("平均分为："+aver);
		System.out.println("及格率为："+rate+"%");
		}
	
	}


