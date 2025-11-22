#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
  char source[] = "This is a string";
  char destination[strlen(source)];
  strcpy(destination, source);
  printf("SOURCE: %s\nDESTINATION: %s\n", source, destination);
  return EXIT_SUCCESS;
}
