#include <stdio.h>
int main() {
  int n,c=0;
  scanf("%d",&n);
  for(int i=0; c<n; i++){
  	 if(i%2==1){
     c++;
     printf("%d\n",i);
     }
  }
	return 0;
}