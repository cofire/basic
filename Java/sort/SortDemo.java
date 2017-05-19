public class SortDemo{
	public static void  bubblesort(int [] data){
		int i,j,temp=0;
		for(i=0;i<data.length-1;i++){
			for(j=data.length-1;j>i;j--){
				if(data[j]<data[j-1]){
					temp=data[j];
					data[j]=data[j-1];
					data[j-1]=temp;
				}
			}
		}
	}

	// 插入排序
	public static void insertsort(int [] data){
		int i,j,temp=0;
		for(i=1;i<data.length;i++){
			if(data[i-1]>data[i]){
				temp=data[i];
				j=i;
				while(j>0&&data[j-1]>temp){
					data[j]=data[j-1];
					j--;
				}
				data[j]=temp;
			}
		}
	}

	//选择排序 
	public static void selectsort(int [] data){
		int i,j;
		for(i=0;i<data.length-1;i++){
			int min=i;
			for(j=i+1;j<data.length;j++){
				if(data[j]<data[min]){
					min=j;
				}
			}
			if(i!=min){
				int temp=data[i];
				data[i]=data[min];
				data[min]=temp;
			}
		}
	}

	// 归并排序
	public static void mergeSort(int [] data) {
		sort(data, 0, data.length - 1);
	}

	public static void sort(int [] data, int left, int right) {
		if (left >= right)
			return;
		int center = (left + right) / 2;
		sort(data, left, center);
		sort(data, center + 1, right);
		merge(data, left, center, right);
	}

	public static void merge(int[] data, int left, int center, int right) {
		int[] tmpArr = new int[data.length];
		int mid = center + 1;
		int third = left;
		int tmp = left;
		while (left <= center && mid <= right) {
			if (data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			} else {
				tmpArr[third++] = data[mid++];
			}
		}
		while (mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		while (left <= center) {
			tmpArr[third++] = data[left++];
		}
		while (tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
	}

	// 快排
	public static void  quicksort(int data[],int left,int right){
		int dp;
		if(left<right){
			dp=partition(data,left,right);
			quicksort(data,left,dp-1);
			quicksort(data,dp+1,right);
		}
	}

	public static int partition(int data[],int left,int right){
		int pivot=data[left];
		while(left<right){
			while(left<right&&data[right]>=pivot)
				right--;
			if(left<right)
				data[left++]=data[right];
			while (left<right&&data[left]<=pivot) {
				left++;
			}		
			if (left<right) {
				data[right--]=data[left];
			}
		}
		data[left]=pivot;
		return left;
	}

	public static void swap(int[] data, int i, int j) {
		if (i == j) {
			return;
		}
		data[i] = data[i] + data[j];
		data[j] = data[i] - data[j];
		data[i] = data[i] - data[j];
	}

	// 堆排序
	public static void heapSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			createMaxdHeap(data, data.length - 1 - i);
			swap(data, 0, data.length - 1 - i);
			//print(data);
		}
	}

	public static void createMaxdHeap(int[] data, int lastIndex) {
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			int k = i;
			while (2 * k + 1 <= lastIndex) {
				
				int biggerIndex = 2 * k + 1;
				if (biggerIndex < lastIndex) {
					if (data[biggerIndex] < data[biggerIndex + 1]) {
						biggerIndex++;
					}
				}
				if (data[k] < data[biggerIndex]) {
					swap(data, k, biggerIndex);
					k = biggerIndex;
				} else {
					break;
				}
			}
		}
	}


	// 打印数组
	public static void print(int [] data){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}

	public static void main(String[] args) {
		// dataType[] arrayRefVar = new dataType[arraySize];
		int [] array1={2,1,4,5,7,0,6,3,9,8};
		print(array1);
		System.out.println();
		bubblesort(array1);
		print(array1);
		System.out.println();

		int [] array2={2,1,4,5,7,0,6,3,9,8};
		print(array2);
		System.out.println();
		insertsort(array2);
		print(array2);
		System.out.println();

		int [] array3={2,1,4,5,7,0,6,3,9,8};
		print(array3);
		System.out.println();
		selectsort(array3);
		print(array3);
		System.out.println();

		int [] array4={2,1,4,5,7,0,6,3,9,8};
		print(array4);
		System.out.println();
		quicksort(array4,0,array4.length-1);
		print(array4);
		System.out.println();

		int [] array5={2,1,4,5,7,0,6,3,9,8};
		print(array5);
		System.out.println();
		mergeSort(array5);
		print(array5);
		System.out.println();

		int [] array6={2,1,4,5,7,0,6,3,9,8};
		print(array6);
		System.out.println();
		heapSort(array6);
		print(array6);
		System.out.println();
	}
}