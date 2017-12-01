public class BinaryInsertionSort{
	
	/*
	 * 二分插入排序
	 * 类型：插入排序
	 * 稳定
	 * 最优时间复杂度：O(nlogn)
	 * 最坏时间复杂度：O(nlogn)
	 * 平均时间复杂度：O(n^2)
	 * 空间复杂度： O(1)
	 *
	 */
	public static void binaryInsertSort(int[] array){
		int end = array.length - 1;
		int temp, left, right, mid;
		for(int i = 1; i <= end; i++){
			left = 0;
			right = i - 1;
			//以二分法找到要插入的位置，减少了比较次数
			while(left <= right){
				mid = (left + right) / 2;
				if(array[mid] == array[i]){
					left = mid + 1;
					break;
				}else if(array[mid] < array[i]){
					left = mid + 1;
				}else{
					right = mid - 1; 
				}
			}
			if(left != i){
					//插入以及其他元素后移
					temp = array[i];
					for(int k = i; k > left; k--){
						array[k] = array[k-1];
					}
					array[left] = temp;
			}
		}
	}

	public static void main(String[] args){
		int[] array = {1,5,3,77,9,97,446,63,77,452,37,467,43,554,756,74,734,64,65,37,25};
		binaryInsertSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}