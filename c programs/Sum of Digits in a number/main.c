#include <stdio.h>
#include <stdlib.h>



int sumOfDigits(long int n){
    int res;
    if(n==0){
        res=0;
    }else {
    res=n%10;
    res=res+sumOfDigits(n/10);
}
return (res);
}

int main()
{
    long int n;
    printf("\nenter the number:\n");
    scanf("%ld",&n);
   printf("Sum of digits of %ld = %d\n" ,n,sumOfDigits(n));

    return 0;
}
