import java.util.Scanner;

public class HomeWork_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要输入的个数：");
		int count = scan.nextInt();
		int []a = new int[count];
		System.out.println("请输入" + count + "个正数");
		int i;
		for(i=0;i<a.length;i++) {
			a[i] = scan.nextInt(); //赋值数组
		}
		int max = a[0];
		int min = a[0];
		for (i= 0; i < a.length; i++) {
			if (a[i] > max) { 
				max = a[i];
	        }
	    }
		 for (i= 0; i < a.length; i++) {
			 if (a[i] < min) { 
				 min  = a[i];
	         }
	     }
		 System.out.println("最大值为" + max);
		 System.out.println("最小值为" + min);
	}
}
