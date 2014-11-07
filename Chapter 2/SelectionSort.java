/**
 * Selection Sort
 * Chapter 2 in Introduction to Algorithms
 * by GSM 2014-11-6
 */
package preliminary;

public class SelectionSort {
	private int[] arraytoSort;
	// 通过构造函数 初始化待排元素数组（private 成员）
	SelectionSort(int [] arraytoSort){
		this.arraytoSort = arraytoSort;
	}
	//插入排序
	public void sort(){
		
		for(int i = 0; i<arraytoSort.length; i++){
			//找到min的index
			int min = i;
			int temp;
			//为了防止数组出界，j= i+1
			for(int j = i+1; j<arraytoSort.length ;j++){
				if(arraytoSort[j] <arraytoSort[min]){
					min = j;
					}
			}
			//swap the min with the ith element
			temp = arraytoSort[min];
			arraytoSort[min] = arraytoSort[i];
			arraytoSort[i] = temp;

		}
	}
	// To show
	public void show(){
		for(int i = 0; i<arraytoSort.length ;i++){
		System.out.println(arraytoSort[i]);}
	}
	
	public static void main(String[] args) {
		int a[] ={1,-1,2,4,6,3};
		SelectionSort i = new SelectionSort(a);
		i.sort();
		i.show();
	}
}