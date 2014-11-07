/**
 * Merge Sort
 * Chapter 2 in Introduction to Algorithms
 * by GSM 2014-11-7
 */
package preliminary;

public class MergeSort {
	private int[] arraytoSort;
	// 通过构造函数 初始化待排元素数组（private 成员）
	MergeSort(int [] arraytoSort){
		this.arraytoSort = arraytoSort;
	}
	//赋值函数, 赋值数组末尾设置哨兵
	public int[] assignlist(int startnum, int endnum){
		int assigned[] = new int[endnum - startnum + 2];
		int k=0;
		for(int i = startnum; i<=endnum; i++){
			assigned[k] = arraytoSort[i];
			k++;
		}
		assigned[k] = Integer.MAX_VALUE;//哨兵
		return assigned;
	}
	//merge 两个已经排好序的数组
	public void merge( int p, int q, int r ){

		int[] right = assignlist(p,q); //p,q 是第一个已经排好序的数组的起始位置
		int[] left = assignlist(q+1,r); //q+1,r 是第二个已经排好序的数组的起始位置
		int i = 0;
		int j = 0;
		
		for(int k = p; k<=r; k++){
			if(right[i] <= left[j]){
				
				arraytoSort[k] = right[i];
				//System.out.print(arraytoSort[k]);
				i++;
				//continue;
			}
			else if(right[i] > left[j]){
				arraytoSort[k] = left[j];
				j++;
				//continue;
			}
		}
	}
	// p 数组头部标记
	// r 数组尾部标记
	public void sort( int start, int end){
		if( start < end ){
			int mid; 
			mid= (start + end)/2;
			sort( start, mid);
			sort( mid+1, end);
			merge( start, mid, end);
		}
	}
	// To show
	public void show(){
		for(int i = 0; i<arraytoSort.length ;i++){
		System.out.println(arraytoSort[i]);
		}
	}
	
	public static void main(String[] args) {
		int a[] ={2,4,3,5,1,6,-1,100};
		MergeSort i = new MergeSort(a);
		//i.merge(0, 1, 3);
		i.sort(0, 7);
		i.show();
	}
}