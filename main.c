#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
  char str[] = "Hello World | This is a Trap";
  char *ptr = strstr(str, "Wor");
  printf("%s\n", ptr);

  // Output: World | This is a Trap
  return EXIT_SUCCESS;
}
