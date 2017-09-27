/*
 * 0~100随机产生8个整数，用冒泡排序将结果升序
 */
public class HomeWork_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [8];
		int i,j,t;
		for(i=0;i<a.length;i++) {
			a[i] = new java.util.Random().nextInt(100)+1;//不+1则从0-99
			System.out.print(a[i]+"\t");
		}
		for(j=0;j<7;j++) {    //冒泡排序要有七趟排序
			for(i=0;i<7-j;i++) {//每一趟排序要进行7-i次排序
				if(a[i]>a[i+1]) {
					t = a[i];
					a[i] = a[i+1]; //把小的放前面
					a[i+1] = t;
				}
			}
		}
		System.out.println("\n升序后：");
		for(i=0;i<8;i++) {
			System.out.print(a[i] + "       ");
		}
	}

}
