public class SelectSort{
	static int data[]={2,1,4,5,7,6,3,9,8};
	public static void selectsort(){
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
	public static void main(String[] args){
		print();
		System.out.println();
		selectsort();
		print();
	}
	static void print(){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
}