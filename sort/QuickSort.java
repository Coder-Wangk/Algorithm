public class QuickSort{
	/*
	 * 快速排序
	 * 类型：交换排序
	 * 平均时间复杂度：O(nlogn)
	 * 平均控件复杂度：O(nlogn)
	 */
	public static void quickSort(int[] array, int start, int end){
		
		//递归结束条件
		if(start >= end){
			return;
		}
		//取第一个数设为key值，之后将数组中比它小的数放在它左边，将比它大的数放在它右边
		int key = array[start];
		
		//设置左右游标
		int l = start,r = end;
		
		while(l < r){
			
			//  先从右边开始比较，如果该值不小于key，右游标前移
			while(l < r && array[r] >= key){
				r--;;
			}
			
			if(l < r){
				//找到比key小的值，赋值给左游标处的值
				array[l] = array[r];
				//左游标后移
				l++;
			}
			//  再从左边开始比较，如果该值不大于key，左游标后移
			while(l < r && array[l] <= key){
				l++;
			}

			if(l < r){
				//找到比key大的值，赋值给右游标处的值
				array[l] = array[r];
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
