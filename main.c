#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
  char source[] = "This is source.";
  char destination[50] = "This is destination.";
  char substrcat[50] = "This is substr.";

  strcat(destination, source);
  strncat(substrcat, source, 4);

  printf("%s\n", destination);
  printf("%s\n", substrcat);
  // Output: This is destination. This is source

  return EXIT_SUCCESS;
}
