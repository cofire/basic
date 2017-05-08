#include <stdio.h>
//冒泡排序
void bubble(int a[],int n){
	for(int i=0;i<n;i++){
		for(int j=n-1;j>i;j--){
			if(a[j]<a[j-1]){
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
}

//插入排序
void insert(int a[],int n){
	for(int i=1;i<n;i++){
		int temp=a[i];
		int j=i-1;
		while(j>=0&&temp<a[j]){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
	}
}

//选择排序
void select(int a[],int n){
	for(int i=0;i<n;i++){
		int k=i;
		for(int j=i;j<n;j++){
			if(a[j]<a[k]){
				k=j;
			}
		}
		if(k!=i){
			int temp=a[i];
			a[i]=a[k];
			a[k]=temp;
		}
	}
}

// 快排
void quick(int a[],int s,int t){
	int i=s,j=t;
	if(s<t){
		int temp=a[s];
		while(i!=j){
			while(j>i&&a[j]>temp)
				j--;
			if(i<j){
				a[i]=a[j];
				i++;
			}
			while(i<j&&a[i]<temp)
				i++;
			if(i<j){
				a[j]=a[i];
				j--;
			}
			a[i]=temp;
			quick(a,s,i-1);
			quick(a,i+1,t);
		}
	}
}

// 希尔排序
void shell(int a[],int n){
	int d=n/2;
	while(d>0){
		for(int i=d;i<n;i++){
			int j=i-d;
			while(j>=0&&a[j]>a[j+d]){
				int temp=a[j];
				a[j]=a[j+d];
				a[j+d]=temp;
				j=j+d;
			}
		}
		d=d/2;
	}
}

// 打印数组
void print(int a[],int n){
	for(int i=0;i<n;i++){
		printf("%3d", a[i]);
	}
	printf("\n");
}

//数据测试
void test(){
	int a1[10]={2,4,1,7,8,6,0,5,3,9};
	bubble(a1,10);
	print(a1,10);
	int a2[10]={2,4,1,7,8,6,0,5,3,9};
	insert(a2,10);
	print(a2,10);
	int a3[10]={2,4,1,7,8,6,0,5,3,9};
	select(a3,10);
	print(a3,10);
	int a4[10]={2,4,1,7,8,6,0,5,3,9};
	quick(a4,0,9);
	print(a4,10);
	int a5[10]={2,4,1,7,8,6,0,5,3,9};
	shell(a5,10);
	print(a5,10);
}

main(){
	test();
}