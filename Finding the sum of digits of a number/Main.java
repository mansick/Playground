#include <stdio.h>
int main() {
  int n,a,s=0;
  scanf("%d",&n);
  while(n!=0){
  a=n%10;
    s=s+a;
    n=n/10;
  }
  printf("%d",s);
	//Type your code
	return 0;
}