public class HeapSort {
	public static void main(String[] args) {
		int[] data5 = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print(data5);
		heapSort(data5);
		print(data5);
	}

	public static void swap(int[] data, int i, int j) {
		if (i == j) {
			return;
		}
		data[i] = data[i] + data[j];
		data[j] = data[i] - data[j];
		data[i] = data[i] - data[j];
	}

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

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}

}