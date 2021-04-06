#include <stdio.h>
#include <stdlib.h>
void scan_arr(int i,int s,long int arr[][100000],int x){
if (x<s){

    scanf("%ld",&arr[i][x]);
    scan_arr(i,s,arr,x+1);
}
}



void scan(int t,int i,long int arr[][100000],int sArr[]){
    int x=0;

if (i<t){
        printf("enter the size of the array\n");
    scanf("%d",&sArr[i]);
        printf("enter the array:\n");
    scan_arr(i,sArr[i],arr,x);

    scan(t,i+1,arr,sArr);

}

}
 long int sum_arr(int i,int s,long int arr[][100000],int x){
 long int sum;
 if(x<s){
        sum=arr[i][x];
    sum=sum+sum_arr(i,s,arr,x+1);
 }
 return (sum);
 }



int sbin(long int n){
int sum;
if(n==0){
        sum=0;
    }else {
    sum=n%2;
    sum=sum+sbin(n/2);

}
return (sum);
}





void sbs(int t,int i,long int arr[][100000],int sArr[]){
    int x=0;

if (i<t){

  printf("%d\n",sbin(sum_arr(i,sArr[i],arr,x)));

    sbs(t,i+1,arr,sArr);

}
}




int main()
{
    int t,i=0;
    printf("\nenter num of tests:\n");
    scanf("%d",&t);
    long int arr[t][100000];
        int sArr[t];
    scan(t,i,arr,sArr);
    i=0;
    sbs(t,i,arr,sArr);





    return 0;
}
