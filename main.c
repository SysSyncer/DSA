#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
  char str[] = "Hello World | This is a Trap";
  printf("%s\n", strchr(str, 'a'));  // a Trap
  printf("%s\n", strrchr(str, 'a')); // ap

  return EXIT_SUCCESS;
}
