import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
/*
 * 输入n个数，输出大于其平均值的数字
 */
public class HomeWork_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要输入的个数：");
		int count = scan.nextInt();
		int []a = new int[count];
		int sum = 0;
		int average = 0;
		int i;
		System.out.println("请输入" + count + "个正数");
		for( i=0;i<a.length;i++){
			a[i] = scan.nextInt(); //赋值数组
			sum+=a[i];
		}
		average = sum / a.length ;  
		for(i=0;i<a.length;i++) {
			if(a[i]>average){
				System.out.println(a[i]+"");
			}
		}
	}

}
