#include <stdio.h>
#include <stdlib.h>


int check0(int a[], int n){
    int i, g = 1;
    for (i = 0; i < n; i++){
        if (a[i] != 0){
            g = 0;
        }}
return g ;}


void print_array(int a[], int n) {
    int i,g;
    g=check0(a,n);
    if(g==1){
 printf("%d", 0);
}else{
     if (a[n-1]==0){
         i=n-2;
     }else{
         i=n-1;
     }
        for( ; i>= 0;i--){

            printf("%d", a[i]);
            }
    } }



void scan_array(int a[], int n) {
    for(int i = 0; i < n; i++) {
        scanf("%1d", &a[i]);
    }
}

void rev(int arr[], int s){
    int i,temp;
    for(i=0;i<(s/2);i++){
        temp=arr[i];
        arr[i]=arr[s-i-1];
        arr[s-i-1]=temp;
    }
}


void multiply(int a[], int n, int b[], int m, int r[], int t) {
    int o=0, i, j;

    rev(a, n);
    rev(b, m);

    for (i = 0; i < t; i++){
        r[i] = 0;
    }

    for (i = 0; i < m; i++){
        for (j = 0; j < n; j++){
            r[i+j] += b[i] * a[j];
        }
    }
    for (i = 0; i < t; i++){
         o=r[i]/10;
         r[i] = (r[i])%10;
        r[i+1]+=o;
    }
}

// don't change any thing in the main
int main() {

    int n;
    scanf("%d", &n);
    int x[n];
    scan_array(x, n);

    int m;
    scanf("%d", &m);
    int y[m];
    scan_array(y, m);

    int t = n + m;
    int ans[t];

    multiply(x, n, y, m, ans, t);
    print_array(ans, t);

    return 0;
}


