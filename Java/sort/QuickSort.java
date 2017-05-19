public class QuickSort{
	static int data[]={2,1,4,5,7,6,3,9,8};
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
	public static void main(String[] args){
		print();
		System.out.println();
		quicksort(data,0,data.length-1);
		System.out.println();
		print();
	}
	static void print(){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
}
