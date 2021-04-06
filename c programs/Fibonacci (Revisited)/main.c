#include <stdio.h>
#include <stdlib.h>

int fib(int a){
int comb=0;
if (a==1){
        comb=1 ;
}else if (a>1){
comb=fib(a-1)+fib(a-2);

}
return (comb);
}



int main()
{
    int n;
    printf("\nenter the wanted index\n");
    scanf("%d",&n);
    printf("Fibonacci of %d = %d\n",n,fib(n));
    return 0;
}
 // the iterative version is faster than the recursive version  in execution because the recursive do some redundant loops
