#include <stdio.h>

int main() {
	char a[100]; //문자열 저장할 배열
	scanf("%s", a); //문자열을 입력받음

	printf("%d", strlen(a)); //문자열의 길이를 출력

	return 0;
}