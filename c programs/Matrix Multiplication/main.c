#include <stdio.h>
void read_array(int n,int m,int arr[][m]){
    int i,j;
for (i=0;i<n;i++){
        for(j=0;j<m;j++){
            scanf("%d",&arr[i][j]);
    }
    }
}

void write_array(int n, int m, int arr[][m]){
    int i,j;
for (i=0;i<n;i++){
        for(j=0;j<m;j++){
                printf("%d ",arr[i][j]);
        }
        printf("\n");
                }
                                             }


int main()
{
 int n,x,m,i,j,k,l,sum=0;
 printf("enter n,x and m:\n");
    scanf("%d %d %d",&n,&x,&m);
    int a1[n][x],a2[x][m],a3[n][m];
 printf("enter elements of the first array\n") ;
    read_array(n,x,a1);
 printf("enter elements of the second array\n");
    read_array(x,m,a2);

    for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                    sum=0;
                for(l=0;l<x;l++){
                    sum+=a1[i][l]*a2[l][j];
                }
            a3[i][j]=sum;
            }
    }

    write_array(n,m,a3);








    return 0;
}
