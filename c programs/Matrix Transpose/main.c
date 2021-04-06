#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i,j,n,m;
    printf("enter matrix deminsion\n");
    scanf("%d %d", &n, &m);
    int matrix[n][m],trans[m][n];
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            scanf("%d",&matrix[i][j]);
         trans[j][i]=matrix[i][j];
        }
    }
     for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            printf("%d ",trans[i][j]);
        }printf("\n");
    }printf("\n");
    return 0;
}
