/*
 * 0~100�������8����������ð�����򽫽������
 */
public class HomeWork_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [8];
		int i,j,t;
		for(i=0;i<a.length;i++) {
			a[i] = new java.util.Random().nextInt(100)+1;//��+1���0-99
			System.out.print(a[i]+"\t");
		}
		for(j=0;j<7;j++) {    //ð������Ҫ����������
			for(i=0;i<7-j;i++) {//ÿһ������Ҫ����7-i������
				if(a[i]>a[i+1]) {
					t = a[i];
					a[i] = a[i+1]; //��С�ķ�ǰ��
					a[i+1] = t;
				}
			}
		}
		System.out.println("\n�����");
		for(i=0;i<8;i++) {
			System.out.print(a[i] + "       ");
		}
	}

}
