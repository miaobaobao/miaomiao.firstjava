import java.util.Scanner;
/*
 * ����һ����ά�����������Ӧ�������󣬲����ҵ������Сֵ������к�
 */
public class HomeWork_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ֱ������ά������кź��кţ�");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int i,j;
		int  [][] array = new int [a][b];
		System.out.println("����������ĸ�Ԫ��ֵ��");
		for(i=0;i<a;i++) {  //Ϊ��ά���鸳ֵ
			for( j=0;j<b;j++) {
				array[i][j] = scan.nextInt();
			}
		}
		System.out.println("��ά�������ǣ�");
		for( i=0;i<array.length;i++) {   //���������
			for( j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ") ;
			}
			System.out.println(); //��һ��ѭ������ʱ����
		}
		int tempmax = array[0][0];
		int tempmin = array[0][0];
		int imax = 0, jmax = 0 , imin = 0 , jmin = 0;
		for(i=0;i<array.length;i++) { //һ���µ�ѭ����Ѱ������ֵ����С��ֵ
			for(j=0;j<array[i].length;j++) {
				if(tempmax < array[i][j]) {
					tempmax = array[i][j];
					 imax = i;     // ��¼ֵ
					 jmax = j;
				}
				if(tempmin > array[i][j]) {
					tempmin = array[i][j];
					imin = i;     //��¼ֵ
					jmin = j;
				}
			}
		}
		System.out.println("������������ֵ�ǣ�" + tempmax + " ���ֵ���к��ǣ�" + (imax+1) + " ���ֵ���к��ǣ�" + (jmax+1));
		System.out.println("�����������Сֵ�ǣ�" + tempmin + " ��Сֵ���к��ǣ�" + (imin+1) + " ��Сֵ���к��ǣ�" + (jmin+1) );
	}

}
