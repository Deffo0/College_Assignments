#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int indexF_arr[256],i1,i2,i,s=0,d;
    char s1[256],s2[256];
    printf("enter the line which you want to search in it:\n");
    fgets(s1,256,stdin);
    printf("enter the word which you want to search for:\n");
    scanf("%s",s2);

   for (i1=0;i1<strlen(s1);i1++){

        for (i=i1,i2=0;s1[i]==s2[i2]&&i2<strlen(s2);i++,i2++){

        }
        if(i2==strlen(s2)){
            indexF_arr[s]=i1;
            s++;
        }
    }


    for (d=0;d<s;d++){
        printf("Occurrence at index %d\n",indexF_arr[d]);
    }
    printf("Total number of occurrences = %d\n",s);
    return 0;

}
