package preliminary;

public class BubbleSelection {
	private int[] arraytoSort;
	// ͨ�����캯�� ��ʼ������Ԫ�����飨private ��Ա��
	BubbleSelection(int [] arraytoSort){
		this.arraytoSort = arraytoSort;
	}
	//ð������
	public void sort(){
		int temp;
		for(int i = 1;i<arraytoSort.length; i++){
			for(int j = 0;j<arraytoSort.length-i ;j++){
				if(arraytoSort[j] > arraytoSort[j+1]){
					temp = arraytoSort[j+1] ;
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
		int a[] ={5,-1,2,4,6,1,3};
		BubbleSelection i = new BubbleSelection(a);
		i.sort();
		i.show();
	}
}
