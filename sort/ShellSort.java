public class ShellSort{
	/*
	 * 希尔排序
	 * 类型：插入排序
	 * 不稳定
	 * 最优时间复杂度：O(n)
	 * 最坏时间复杂度：O(n^2)
	 * 平均时间复杂度：O(n^1.5)
	 * 空间复杂度： O(1)
	 *
	 */
	public static void ShellSort(int[] array){
		int length = array.length;
		int temp;
		//计算增量
		for (int increment = length / 2; increment >= 1; increment /= 2) {
			//每个增量下，子序列数量
			for(int i = 0; i < increment; i++){
				//子序列插入排序
				for(int j = i + increment; j < length; j += increment){
					for(int k = j ; k > i; k -= increment){
						if(array[k] < array[k - increment]){
							temp = array[k];
							array[k] = array[k - increment];
							array[k - increment] = temp;
						}else{
							break;
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {1,5,3,77,9,97,446,63,77,452,37,467,43,554,756,74,734,64,65,37,25};
		ShellSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}