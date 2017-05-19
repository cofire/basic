public class ShellSort{
	static int data[]={2,1,4,5,7,6,3,9,8};
	public static void  shellsort(){
		int j=0,temp=0;
		for(int d=data.length/2;d>0;d/=2){
			for(int i=d;i<data.length;i++){
				temp=data[i];
				for(j=i;j>=d;j-=d){
					if(temp<data[j-d]){
						data[j]=data[j-d];
					}else{
						break;
					}
				}
				data[j]=temp;
			}
		}
	}
	public static void main(String[] args){
		print();
		System.out.println();
		shellsort();
		System.out.println();
		print();
	}
	static void print(){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
}