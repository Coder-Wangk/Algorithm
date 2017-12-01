public class QuickSort{
	/*
	 * 快速排序
	 * 类型：交换排序
	 * 不稳定
	 * 最优时间复杂度：O(nlogn)
	 * 最坏时间复杂度：O(n^2)
	 * 平均空间复杂度：O(nlogn)
	 * param: 
	 *   start 列表起始index
	 *   end   列表结束index
	 * 
	 */
	public static void quickSort(int[] array, int start, int end){
		
		//递归结束条件
		if(start >= end){
			return;
		}
		//取第一个数设为key值，之后将列表中比它小的数放在它左边，将比它大的数放在它右边
		int key = array[start];
		
		//设置左右游标
		int l = start,r = end;
		
		while(l < r){
			
			//  先从右边开始比较，如果该值大于等于key，右游标前移
			while(l < r && array[r] >= key){
				r--;;
			}
			
			if(l < r){
				//找到比key小的值，赋值给左游标处的值
				array[l] = array[r];
				//左游标后移
				l++;
			}
			//  再从左边开始比较，如果该值小于key，左游标后移
			while(l < r && array[l] < key){
				l++;
			}

			if(l < r){
				//找到比key大的值，赋值给右游标处的值
				array[r] = array[l];
				//右游标前移
				r--;
			}

		}
		// 一次排序结束，将key放到中间
		array[l] = key;
		//对key左边的序列快排
		quickSort(array, start, l);
		//对key右边的序列快排
		quickSort(array, l+1, end);
	
	}

	public static void main(String[] args){
		int[] array = {1,5,3,77,9,97,446,63,77,452,37,467,43,554,756,74,734,64,65,37,25};
		quickSort(array, 0, array.length -1);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

}
