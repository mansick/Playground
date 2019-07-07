#include <stdio.h>
int main() {
   int n,f,m,s=0,a;
  scanf("%d",&f);
  n=f;
  while(n>0){
    a=n%10;
    m=1;
  	for(int i=1;i<=a;i++){
  		m=m*i;
  		}
    s=s+m;
    n=n/10;
  }
  if(s==f)
        printf("Yes");
        else
        printf("No");
	//Type your code
	return 0;
}