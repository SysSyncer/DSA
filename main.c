#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {
  int idx = 1;
  while (idx < argc && argv[idx] != (void *)0) {
    printf("%s\t", argv[idx++]);
  }
  printf("\n");
  return EXIT_SUCCESS;
}
