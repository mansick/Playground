#include <stdio.h>
int main() {
  int n,r,a;
  scanf("%d",&n);
  a=n%10;
  while(n!=0){
  r=n%10;
    n=n/10;
  }
  printf("%d",a+r);
	//Type your code
	return 0;
}