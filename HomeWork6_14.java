
/*
 * 以m行n列二维数组为参数进行方法调用，分别计算各列元素之和
 */

public class HomeWork6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] x = {{1,2,3},{5,6,7},{9,10,11}};
		Q q = new Q();
		q.sum(x);
		
	}

}

class Q {
	public void  sum (int [][]a) {
		int [] sum = new int [a.length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				sum [j] += a[i][j];
			}
		}
		for (int j=0;j<sum.length;j++) {
			System.out.println("第" + j + "列的元素之和为：" + sum[j]);
		}
		
	}
}