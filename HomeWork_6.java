/*
 * 15������15�������ų�һȦ���ӵ�һ����ʼ����
 * ��������13����ʱ���ó�����Ȼ���ٴ���һ����ʼ����
 * ����������13����ʱ��ȡ���������ѭ�����У�֪����ʣ15����Ϊֹ
 * �������ŷ�����ʹÿ��ȡ�������Ǻ���
 */
public class HomeWork_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [30];
		int i,count=0,sum=0;
		for(i=0;i<a.length;i++) {
			a[i] = 1; //����Ԫ����1
		}
		System.out.println("��1��ʼ�ڷţ�����Ӧ�ðڷţ�");
		while(sum<15) {
			for(i=0;i<a.length;i++) { //ѭ������
				if(a[i] == 1) {       
					count++;
				}
				if(count == 13) {     //countΪ13ʱ���Ԫ�ص�ֵi+1��Ϊ�����ʱ���Ǵ�0��ʼ
					System.out.print(+(i+1) + " ");
					a[i] = 0;        //���������Ԫ����0������0��Ԫ��ʱcount�������~
					count = 0;       //�����һ��Ԫ��ֵ��count��0��ͷ��ʼ
				}
			}
			sum++;   //����
		}		
	}

}
