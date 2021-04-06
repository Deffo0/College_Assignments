#include <stdio.h>
#include <stdlib.h>
void star_seq(int n,int c){
if (c<n){
    printf("*");
    star_seq(n,c+1);
}else if(c==n){
printf("*\n");

}
}



void aster_up(int n,int c){
int res,i;

 if (c<=n){
res=c;
i=1;
star_seq(res,i);
aster_up(n,c+1);
}
}

void aster_down(int n,int c){
int res,i;
if(c!=0){
res=c;
i=1;
star_seq(res,i);
aster_down(n,c-1);

}
}


int main()
{
    int n,c=1;
    printf("\nenter n:\n");
    scanf("%d",&n);
    aster_up(n,c);
    c=n-1;
    aster_down(n,c);

    return 0;
}
