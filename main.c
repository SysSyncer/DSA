#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
  char source[] = "This is a string";
  size_t length = strlen(source);

  char destination[length];
  char substrcpy[11];

  strcpy(destination, source);
  strncpy(substrcpy, source, 10);

  printf("SOURCE: %s\nDESTINATION: %s\n", source, destination);
  printf("\n%s\n", substrcpy);

  return EXIT_SUCCESS;
}
