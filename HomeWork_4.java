import java.util.Scanner;
/*
 * 定义一个二维数组输出所对应的行列阵，并且找到最大最小值输出行列号
 */
public class HomeWork_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请分别输入二维数组的行号和列号：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int i,j;
		int  [][] array = new int [a][b];
		System.out.println("请输入数组的各元素值：");
		for(i=0;i<a;i++) {  //为二维数组赋值
			for( j=0;j<b;j++) {
				array[i][j] = scan.nextInt();
			}
		}
		System.out.println("二维数组表达是：");
		for( i=0;i<array.length;i++) {   //输出行列阵
			for( j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ") ;
			}
			System.out.println(); //当一行循环结束时换行
		}
		int tempmax = array[0][0];
		int tempmin = array[0][0];
		int imax = 0, jmax = 0 , imin = 0 , jmin = 0;
		for(i=0;i<array.length;i++) { //一个新的循环来寻找最大的值和最小的值
			for(j=0;j<array[i].length;j++) {
				if(tempmax < array[i][j]) {
					tempmax = array[i][j];
					 imax = i;     // 记录值
					 jmax = j;
				}
				if(tempmin > array[i][j]) {
					tempmin = array[i][j];
					imin = i;     //记录值
					jmin = j;
				}
			}
		}
		System.out.println("该行列阵的最大值是：" + tempmax + " 最大值的行号是：" + (imax+1) + " 最大值的列号是：" + (jmax+1));
		System.out.println("该行列阵的最小值是：" + tempmin + " 最小值的行号是：" + (imin+1) + " 最小值的列号是：" + (jmin+1) );
	}

}
