/**
 * Binary Sort - non recursively
 * Chapter 2 in Introduction to Algorithms
 * by GSM 2014-11-7
 */
package preliminary;

public class BinarySearch {
	private int[] arraytoSort;
	private int key;
	private int index;
	//private InsertionSort i; 
	
	// 通过构造函数 初始化待排元素数组（private 成员）
	BinarySearch(int[] arraytoSort, int key){
		this.arraytoSort = arraytoSort;
		this.key = key;
	}
	/* 如果想用排序
	public void toSort(){
		i = new InsertionSort(arraytoSort);
		i.sort();
		//i.show();
	}
	*/
	//如果search到了返回index
	public int search(int start, int end){
		
		if(start <= end){
			int mid = (start + end)/2;
			if(arraytoSort[mid] > key)
				search(start,mid-1);
			else if(arraytoSort[mid] < key)
				search(mid+1,end);
			else 
				index = mid;
		}
		else 
			index = -1;
		return index+1;
	}
	public static void main(String[] args) {
		int a[] ={5,2,4,6,1,3};
		//InsertionSort i = new InsertionSort(a);
		BinarySearch e = new BinarySearch(a,4);
		//e.toSort();
		System.out.print(e.search(0,a.length-1));
		}
}
