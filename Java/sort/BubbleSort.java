public class BubbleSort{
	static int data[]={2,1,4,5,7,6,3,9,8};
	public static void  bubblesort(){
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
	public static void main(String[] args){
		print();
		System.out.println();
		bubblesort();
		System.out.println();
		print();
	}
	static void print(){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
}