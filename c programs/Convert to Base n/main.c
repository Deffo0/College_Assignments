#include <stdio.h>
#include <stdlib.h>
 void conv(int n,int base){
     int res;

    if(base==10){
    res=n;
    printf("%d",res);
    return ;
    }
     if(n<0){
        n=-1*n;
        printf("-");
          res=n%base;
    conv(n/base,base);
      if(res>=10){
 printf("%c",res+55);  //using ascii code
      }else{
 printf("%d",res);
 }

 }else if(n>0){
     res=n%base;
    conv(n/base,base);
      if(res>=10){
 printf("%c",res+55);  //using ascii code
      }else{
 printf("%d",res);
 }
 }
 }



int main()
{
    int n,base;
    printf("enter the number and the base:\n");
   scanf("%d %d",&n,&base);
    conv(n,base);
    return 0;
}
