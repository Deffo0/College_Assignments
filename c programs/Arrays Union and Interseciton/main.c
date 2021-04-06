#include <stdio.h>
#include <stdlib.h>

int main()
{
int n1,n2,i,j,h,flag=1,b=0,c=0,k=0,n=0,array1[20],array2[20],arr1[20],arr2[20],Union[40],Intersection[20];
printf("enter the size and the elements of the first array\n");
scanf("%d",&n1);
for(i=0;i<n1;i=i+1){
    scanf("%d",&array1[i]);
}
printf("enter the size and the elements of the second array\n");
scanf("%d",&n2);
for(j=0;j<n2;j=j+1){
    scanf("%d",&array2[j]);
}
for(i=0;i<n1;i=i+1){
    for(h=0;h<c;h=h+1){
        if(arr1[h]==array1[i])
            break;
        }
        if(h==c){
            arr1[c]=array1[i];
            c=c+1;
        }
    }
for(j=0;j<n2;j=j+1){
    for(h=0;h<b;h=h+1){
        if(arr2[h]==array2[j])
            break;
        }
        if(h==b){
            arr2[b]=array2[j];
            b=b+1;
        }
}
for(i=0;i<c;i++){
  for(j=0;j<b;j++){
  if (arr1[i]==arr2[j]){
    Intersection[k]=arr2[j];
    k=k+1;
}}}
for(i=0;i<c;i++){
    Union[n]=arr1[i];
     n=n+1;}
 for(j=0;j<b;j++){
        flag=1;
  for(i=0;i<c;i++){
  if (arr2[j]==arr1[i]){
      flag=0;
   }}
 if(flag==1){
    Union[n]=arr2[j];
    n=n+1;
 }}
printf("Array1:");
for(i=0;i<c;i=i+1){
printf(" %d",arr1[i]);
if(i<(c-1)){
  printf(",");
}else {printf("\n");}}

printf("Array2:");
for(j=0;j<b;j=j+1){
printf(" %d",arr2[j]);
if(j<(b-1)){
  printf(",");
}else {printf("\n");}}

printf("Union:");
for(j=0;j<n;j=j+1){
printf(" %d",Union[j]);
if(j<(n-1)){
  printf(",");
}else {printf("\n");}
}

printf("Intersection:");
for(i=0;i<k;i=i+1){
printf(" %d",Intersection[i]);
if(i<(k-1)){
  printf(",");
}else {printf("\n");}
}


    return 0;
  }
