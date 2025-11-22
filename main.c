#include <stddef.h>
#include <stdio.h>
#include <string.h>

char *strrev(char *str) {
  int first = 0;
  size_t length = strlen(str);
  int last = length - 1;
  while (first < last) {
    char temp = str[first];
    str[first] = str[last];
    str[last] = temp;
    first++;
    last--;
  }
  return str;
}

int main() {
  char str[] = "Hello";
  size_t length = sizeof(str) / sizeof(str[0]);
  strrev(str);
  printf("%s\n", strrev(str));
  return 0;
}
