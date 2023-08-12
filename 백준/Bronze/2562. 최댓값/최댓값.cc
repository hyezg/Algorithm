#include <stdio.h>

int main() {
	int max = 0, i, n;
	int a[9];
	
	for( i = 0; i < 9; i++ ) {
		scanf("%d", &a[i]);
		
		if( max < a[i]) { 
			max = a[i];
			n = i;
		}
	}
	printf("%d \n%d", max, n+1);
	
	return 0;
}

