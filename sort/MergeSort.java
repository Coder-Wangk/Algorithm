public class MergeSort{
	/*
	 * 归并排序
	 * 稳定
	 * 最优时间复杂度：O(nlogn)
	 * 最坏时间复杂度：O(nlogn)
	 * 平均时间复杂度：O(nlogn)
	 * 空间复杂度： O(1)
	 *
	 */
	public static void mergeSort(int[] array, int start, int end, int[] temp){
		if(start < end){
			int mid = (start + end) / 2;
			//左边继续归并排序
			mergeSort(array, start, mid, temp);
			//右边继续归并排序
			mergeSort(array, mid + 1, end, temp);
			//合并左右两边
			mergeArray(array, start, mid, end, temp);
		}
	}


	/*
	 * 数组合并
	 */
	public static void mergeArray(int[] array, int first, int mid, int last, int[] temp){
		int i = first, j = mid + 1, k = 0;
		int m = mid, n = last;
		//合并两个有序数组到临时数组，依次先取较小的放入
		while(i <= m && j <= n){
			if(array[i] <= array[j]){
				temp[k++] = array[i++];
			}else{
				temp[k++] = array[j++];
			}
		}
		//如果两个数组长度不等，将较长数组中剩下的数放入合并后的数组中
		while(i <= m){
			temp[k++] = array[i++];
		}
		while(j <= n){
			temp[k++] = array[j++];
		}
		//将合并后的数组复制到原数组
		for(i = 0; i< k; i++){
			array[first + i] = temp[i];
		}
	}

	public static void main(String[] args){
		int[] array = {1,5,3,77,9,97,446,63,77,452,37,467,43,554,756,74,734,64,65,37,25};
		int[] temp = new int[array.length];
		mergeSort(array, 0, array.length -1, temp);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
