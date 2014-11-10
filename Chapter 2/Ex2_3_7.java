//输入: 集合S由n个整数组成，和另一个整数x
//输出：判断S中是否存在两个其和等于x的元素。
//要求: 时间复杂度O(nlogn)
package preliminary;

public class Ex2_3_7 {
	public static void main(String[] args) {
		int a[] ={5,2,4,7,1,3,2,600};
		int x = 600;
		int key ;
		boolean flag = false;
		// to sort
		MergeSort e = new MergeSort(a);
		e.sort(0, 7);
		//e.show();
		for(int i= 0;i<a.length;i++){
			key = x -a[i];
			BinarySearch2 e1 = new BinarySearch2(a,key);
			if( e1.search(0,i-1)  +  e1.search(i+1,a.length-1) == -2 )
				flag = false;
			else
				{
				flag =  true;
				break;
				}
		}
		System.out.print(flag);
	}	 
}
