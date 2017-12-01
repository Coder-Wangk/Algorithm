public class BubbleSort{
	
	/*
	 * 冒泡排序
	 * 类型：交换排序
	 * 稳定
	 * 最优时间复杂度：O(n)
	 * 最坏时间复杂度：O(n^2)
	 * 平均时间复杂度：O(n^2)
	 * 空间复杂度： O(1)
	 *
	 */
	public static void bubbleSort(int[] array){
		int end = array.length - 1;
		int temp;
		boolean tag = true;
		for (int i = 0; i < end && tag; i++) {
			tag = false;
			//将较大的数依次冒泡到序列尾部
			for (int j = 0; j < end - i; j++) {
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					tag = true;  
				}
			}
		}
	}

	public static void main(String[] args){
		int[] array = {1,5,3,77,9,97,446,63,77,452,37,467,43,554,756,74,734,64,65,37,25};
		bubbleSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}