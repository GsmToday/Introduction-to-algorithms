/**
 * Insertion Sort
 * Chapter 2 in Introduction to Algorithms
 * by GSM 2014-11-6
 */
package preliminary;

public class InsertionSort {
	private int[] arraytoSort;
	// 通过构造函数 初始化待排元素数组（private 成员）
	InsertionSort(int [] arraytoSort){
		this.arraytoSort = arraytoSort;
	}
	//插入排序
	public void sort(){
		int temp;
		for(int i = 1; i<arraytoSort.length; i++){
			for(int j = i-1; j>=0; j--){
				if( arraytoSort[j+1] < arraytoSort[j] ){
					temp = arraytoSort[j+1];
					arraytoSort[j+1] = arraytoSort[j];
					arraytoSort[j] = temp;
				}	
			}	
		}
	}
	// To show
	public void show(){
		for(int i = 0; i<arraytoSort.length ;i++){
		System.out.println(arraytoSort[i]);}
	}
	
	public static void main(String[] args) {
		int a[] ={5,2,4,6,1,3};
		InsertionSort i = new InsertionSort(a);
		i.sort();
		i.show();
	}
}
