import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
/*
 * ����n���������������ƽ��ֵ������
 */
public class HomeWork_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ����ĸ�����");
		int count = scan.nextInt();
		int []a = new int[count];
		int sum = 0;
		int average = 0;
		int i;
		System.out.println("������" + count + "������");
		for( i=0;i<a.length;i++){
			a[i] = scan.nextInt(); //��ֵ����
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
