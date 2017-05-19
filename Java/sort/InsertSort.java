public class InsertSort{
	static int data[]={3,1,4,5,9,6,8,2,7};
	public static void insertsort(){
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
	public static void main(String[] args){
		print();
		System.out.println();
		insertsort();
		print();
		System.out.println();
	}
	public static void print(){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
}