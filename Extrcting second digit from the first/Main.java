#include <stdio.h>
int main() {
  int n,r;
  scanf("%d",&n);
  while(n>10){
  r=n%10;
  n=n/10;
  }
  printf("%d",r);
	//Type your code
	return 0;
}