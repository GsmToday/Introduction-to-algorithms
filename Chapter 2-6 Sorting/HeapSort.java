package preliminary;
import gsm.*;
public class HeapSort {
	public void buildheap(int array[]){
		int length = array.length;
		int heapsize = length;
		int nonleaf = length / 2 - 1;
		for(int i = nonleaf; i>=0;i--){
			heapify(array,i,heapsize);
		}
	}
	
	public void heapify(int array[], int i,int heapsize){
		int smallest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<heapsize){
			if(array[i]>array[left]){
				smallest = left;
			}
			else smallest = i;
		}
		if(right<heapsize){
			if(array[smallest]>array[right]){
				smallest = right;
			}
		}
		if(smallest != i){
			int temp;
			temp = array[i];
			array[i] = array[smallest];
			array[smallest] = temp;
			heapify(array,smallest,heapsize);
		}
	}
	
	public void heapsort(int array[]){
		int heapsize = array.length;
		buildheap(array);
		
		for(int i=0;i<array.length-1;i++){
			// swap the first and the last
			int temp;
			temp = array[0];
			array[0] = array[heapsize-1];
			array[heapsize-1] = temp;
			// heapify the array
			heapsize = heapsize - 1;
			heapify(array,0,heapsize);
			
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[] ={5,2,4,6,3};
		int array[] ={40,7,1,3,6,5,2};
		HeapSort sort = new HeapSort();
		//sort.buildheap(array);
		sort.heapsort(array);
		//sort.heapify(array, 0,5);
		Gsm gsm = new Gsm();
		gsm.printArray(array);
	}

}
