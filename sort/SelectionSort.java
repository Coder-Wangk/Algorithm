public class SelectionSort{
	
	/*
	 * 直接选择排序
	 * 类型：选择排序
	 * 不稳定
	 * 最优时间复杂度：O(n^2)
	 * 最坏时间复杂度：O(n^2)
	 * 平均时间复杂度：O(n^2)
	 * 空间复杂度： O(1)
	 *
	 */
	public static void selectSort(int[] array){
		int temp = 0, maxIndex;
		int end = array.length - 1;
		//遍历，找最小数依次交换到序列前部
		for(int i = 0; i < end ; i++){
			//设置最小值下标
			maxIndex = i;
			//在有序序列后面，遍历寻找最小数，记录下标
			for(int j = i + 1; j <= end; j++){
				if(array[j] < array[maxIndex]){
					maxIndex = j;
				}
			}
			if(maxIndex != i){
				temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
			}
		}
	}

	public static void main(String[] args){
		int[] array = {1,5,3,77,9,97,446,63,77,452,37,467,43,554,756,74,734,64,65,37,25};
		selectSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}