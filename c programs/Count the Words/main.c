#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main()
{
    int i,j,k;
    char str[256];
    setbuf(stdout, 0);
    printf("enter the line:\n");
    fgets(str,256,stdin);
    for(i=0;i<strlen(str);i++){
        for (j=i;isalnum(str[j]);j++){

            if(!isalnum(str[j+1])){
               k++ ;
            }
        }
        i=j;


    }
   printf("%d words\n",k);
    return 0;
}
