package preliminary;

public class LinearSearch {
	private int[] arraytoSort;
	private int key;
	// ͨ�����캯�� ��ʼ������Ԫ�����飨private ��Ա��
	LinearSearch(int[] arraytoSort, int key){
		this.arraytoSort = arraytoSort;
		this.key = key;
	}
	//���search���˷���index
	public void search(){
		int index=0;
		int i = 0;
		for(i=0; i< arraytoSort.length; i++){
			if( arraytoSort[i] == key ){
			   index = i;
			   break;
			}
		}
		if(i<arraytoSort.length){
			System.out.print(index);
		}
		else{
			System.out.print("NIL");
		}
		
	}
	public static void main(String[] args) {
		int []a= {1,2,-1,3,4,5,6};
		LinearSearch e = new LinearSearch(a, 7);
		e.search();
	}

}
