import java.util.Scanner;

public class HomeWork_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ����ĸ�����");
		int count = scan.nextInt();
		int []a = new int[count];
		System.out.println("������" + count + "������");
		int i;
		for(i=0;i<a.length;i++) {
			a[i] = scan.nextInt(); //��ֵ����
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
		 System.out.println("���ֵΪ" + max);
		 System.out.println("��СֵΪ" + min);
	}
}
