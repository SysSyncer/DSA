#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
  char path[] = "/home/user/documents/report.txt";
  char delimiters[] = "/";

  char *token = strtok(path, delimiters);
  while (token != NULL) {
    printf("%s\n", token);
    token = strtok(NULL, delimiters);
  }

  // Output:
  // home
  // user
  // documents
  // report.txt

  return EXIT_SUCCESS;
}
