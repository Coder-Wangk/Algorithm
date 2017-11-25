public class InsertSort{
	
	/*
	 * 直接插入排序
	 * 类型：插入排序
	 * 稳定
	 * 时间复杂度： O(n^2)
	 * 空间复杂度： O(1)
	 *
	 */
	public static void insertSort(int[] array){
		int end = array.length - 1;
		int temp = 0;
		//以第0个数为有序序列
		for(int i = 1; i <= end; i++){
			//将后边的数一次按大小插入前面的有序序列中，构成新的有序序列
			for(int j = i-1; j >= 0; j--){
				//交换
				if(array[j] > array[j + 1]){
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				//若不小于序列中最后一个数，直接开始下一次插入
				}else{
					break;
				}
			}
		}
	}

	public static void main(String[] args){
		int[] array = {1,5,3,77,9,97,446,63,77,452,37,467,43,554,756,74,734,64,65,37,25};
		insertSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}