public class Text6 {

	public static void main(String[] args) {
		int[]a = {85, 92, 76, 88, 95, 68, 72, 81, 79, 91, 83, 77, 65, 89, 94, 71, 84, 58, 96, 73, 82, 90, 69, 75, 87, 93, 80, 64, 78, 86};
		int n =  a.length;
		for(int i = 1;i<n;i++) {
			for(int j =  0;j<n-1;j++) {
				if(a[j]<a[j+1]) {
					int t = a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("前十名：");
		for(int i= 0;i<Math.min(10, a.length-10);i++) {
			System.out.println(a[i]+" ");
		}
	}
}
