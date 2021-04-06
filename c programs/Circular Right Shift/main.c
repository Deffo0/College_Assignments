#include <stdio.h>
#include <stdlib.h>

int main()
{
     int n ,k, i, carry;
    scanf("%d%d", &n,&k);
    int arr[n];
    for(i=0; i<n; i++){
        carry=i+k;
        if(carry>=n){
           carry=carry%n;
        }
        scanf("%d", &arr[carry]);
    }
    for(i=0; i<n; i++){
       printf("%d", arr[i]);
       if(i!=n-1)printf(" ");
    }
    return 0;
}
