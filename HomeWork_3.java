import java.util.Scanner;
/*
 * �ɼ�������Ϊ��ά���鸳ֵ
 */

public class HomeWork_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ֱ������ά������кź��кţ�");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum1=0,sum2=0;
		int i,j=0;//ֻ�Ǹ�J������һ��ֵ
		int  [][] array = new int [a][b];
		System.out.println("����������ĸ�Ԫ��ֵ��");
		/*
		 * Ϊ��ά���鸳ֵ
		 */
		for( i=0;i<a;i++){  
			for( j=0;j<b;j++) {
				array[i][j] = scan.nextInt();
			}
		}
		/*
		 * ��ʾ�����ά����
		 */
		System.out.println("��ά�������ǣ�");
		for( i=0;i<array.length;i++){   
			for( j=0;j<array[i].length;j++){
				System.out.print(array[i][j] + " ") ;
			}
			System.out.println(); //��һ��ѭ������ʱ����
		}
		
		/*
		 * ���жԽ��ߵ�ʱ�򼴱���Ϊn*n�Ľṹ�˷�������д�����Խ��ߵĺ�
		 */
		if(i == j) {
			sum1 += array[i][j];//array[0][0]+array[1][1]+array[2][2]+...+array[i][j] ��i==j
		}
		if((i+j)==i) {
			sum2+=array[i][j]; //array[i][0]+array[i-1][1]+array[i-2][2]+...+array[0][j] ��(i+j)==i
		}
		System.out.println("�Խ��ߵĵ�һ���ֵΪ��" + sum1 + "�Խ��ߵڶ����ֵΪ��" + sum2 );
	
	}
}
