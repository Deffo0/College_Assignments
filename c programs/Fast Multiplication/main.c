#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x,y,z;
    printf("enter x&y\n");
    scanf("%d %d",&x,&y);
    if (y<0||y>11||x<-1000||x>1000){
        printf("ERROR");
    }else {
        z=x*(1<<y);
        printf("%i",z);
    }
    return z;
}
