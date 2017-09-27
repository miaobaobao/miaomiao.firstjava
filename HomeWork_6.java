/*
 * 15个红球15个绿球排成一圈，从第一个球开始数，
 * 当数到第13个球时就拿出此球，然后再从下一个球开始数，
 * 当再数到第13个球时又取出此球，如此循环进行，知道仅剩15个球为止
 * 问怎样排法才能使每次取出的球都是红球
 */
public class HomeWork_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [30];
		int i,count=0,sum=0;
		for(i=0;i<a.length;i++) {
			a[i] = 1; //所有元素置1
		}
		System.out.println("从1开始摆放，红球应该摆放：");
		while(sum<15) {
			for(i=0;i<a.length;i++) { //循环数组
				if(a[i] == 1) {       
					count++;
				}
				if(count == 13) {     //count为13时输出元素的值i+1因为排序的时候是从0开始
					System.out.print(+(i+1) + " ");
					a[i] = 0;        //把输出过的元素置0当遇到0的元素时count不会递增~
					count = 0;       //输出过一个元素值后count置0从头开始
				}
			}
			sum++;   //计数
		}		
	}

}
