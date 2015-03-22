/**
 * Binary Sort - non recursively
 * Chapter 2 in Introduction to Algorithms
 * by GSM 2014-11-7
 */
package preliminary;

public class BinarySearch2 {
	private int[] arraytoSort;
	private int key;
	private int index;
	
	// 通过构造函数 初始化待排元素数组（private 成员）
	BinarySearch2(int[] arraytoSort, int key){
		this.arraytoSort = arraytoSort;
		this.key = key;
	}

	//如果search到了返回index
	public int search(int start, int end){
		while(start <= end){
			int mid = (start + end) / 2;
			if(arraytoSort[mid] > key)
			{
				end = mid - 1;
			}
			else if(arraytoSort[mid] < key){
				start = mid + 1;
			}
			else{
				index = mid;
				return index+1;
				}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] ={2,4,6,8,10};
		BinarySearch2 e = new BinarySearch2(a,10);
		System.out.print(e.search(0,a.length-1));
		}
}
