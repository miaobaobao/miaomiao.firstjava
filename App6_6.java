/*
 *��һ������ת�ú����; 
 */
public class App6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b = new int[3][3];
		Trans trans = new Trans();
		b = trans.transpose(a);//������a��Ϊ�������ã�����ֵ����b
		for(int i=0;i<b.length;i++) {  //�������
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j] + " ");
			}
			System.out.println("\n");
		}
			
	}

}

class Trans {
	int temp;
	int [][] transpose(int [][]array){
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<=array[i].length;j++) {
				temp = array [i][j];    //�Խ�����ת��
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		return array;
	}
}