import java.util.Scanner;
/*
 * 由键盘输入为二维数组赋值
 */

public class HomeWork_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请分别输入二维数组的行号和列号：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum1=0,sum2=0;
		int i,j=0;//只是给J赋给他一个值
		int  [][] array = new int [a][b];
		System.out.println("请输入数组的各元素值：");
		/*
		 * 为二维数组赋值
		 */
		for( i=0;i<a;i++){  
			for( j=0;j<b;j++) {
				array[i][j] = scan.nextInt();
			}
		}
		/*
		 * 显示输出二维数组
		 */
		System.out.println("二维数组表达是：");
		for( i=0;i<array.length;i++){   
			for( j=0;j<array[i].length;j++){
				System.out.print(array[i][j] + " ") ;
			}
			System.out.println(); //当一行循环结束时换行
		}
		
		/*
		 * 当有对角线的时候即必须为n*n的结构此方法用来写两个对角线的和
		 */
		if(i == j) {
			sum1 += array[i][j];//array[0][0]+array[1][1]+array[2][2]+...+array[i][j] 即i==j
		}
		if((i+j)==i) {
			sum2+=array[i][j]; //array[i][0]+array[i-1][1]+array[i-2][2]+...+array[0][j] 即(i+j)==i
		}
		System.out.println("对角线的第一侧的值为：" + sum1 + "对角线第二侧的值为：" + sum2 );
	
	}
}
