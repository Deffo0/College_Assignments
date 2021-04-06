#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,m,i,j,sum=0,temp,k=0;
    printf("enter n and m:\n");
    scanf("%d %d",&n,&m);
    int arr[n][m],sa[n];


    printf("enter the elements:\n");

    for (i=0;i<n;i++){
            sum=0;
        for(j=0;j<m;j++){
            scanf("%d",&arr[i][j]);
            sum=sum+arr[i][j];
        }

        sa[i]=sum;
    }
    int max=sa[0];
    for (i=1;i<n;i++){
    if(sa[i]>max){
        max=sa[i];
        k=i;
    }
    }
    for(j=0;j<m;j++){
    temp=arr[0][j];
    arr[0][j]=arr[k][j];
    arr[k][j]=temp;
    }

    for (i=0;i<n;i++){
        for(j=0;j<m;j++){
                printf("%d ",arr[i][j]);
    }printf("\n");
    }
    return 0;
}
