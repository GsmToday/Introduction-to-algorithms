//����: ����S��n��������ɣ�����һ������x
//������ж�S���Ƿ����������͵���x��Ԫ�ء�
//Ҫ��: ʱ�临�Ӷ�O(nlogn)
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
