#include <stdio.h>
#include<math.h>
int main() {
  int n,p,c=0,u,s=0,a;
  scanf("%d",&p);
  u=p;
  while(u!=0){
  u=u/10;
    c++;
  }
  n=p;
  while(n>0){
  a=n%10;
  s=s+pow(a,c);
   n=n/10;
  }
  if(s==p)
  printf("Armstrong Number");
  else
  printf("Not an Armstrong Number");
	return 0;
}