#include <stdio.h>
#include <stdlib.h>

int max(int *array, int length) {
  int mx = -1;
  for (int i = 0; i < length; i++) {
    if (array[i] > mx)
      mx = array[i];
  }
  return mx;
}

int *build_hash(int *array, int length) {
  int *hash = (int *)calloc(max(array, length) + 1, sizeof(int));
  for (int i = 0; i < length; i++) {
    hash[array[i]]++;
  }
  return hash;
}

int *highest_frequent_number(int *array, int length) {
  int number = -1;
  int frequency = 0;

  int hash_length = max(array, length) + 1;
  int *hash = build_hash(array, length);

  for (int i = 0; i < hash_length; i++) {

    if (hash[i] == 0)
      continue;

    if (hash[i] > frequency || hash[i] == frequency && i < number) {
      frequency = hash[i];
      number = i;
    }
  }
  int *result = (int *)malloc(sizeof(int) * 2);
  result[0] = number;
  result[1] = frequency;
  return result;
}

int *second_highest_frequent_number(int *array, int length) {
  int first_number = -1;
  int second_number = -1;
  int first_high_frequency = 0;
  int second_high_frequency = 0;

  int hash_length = max(array, length) + 1;
  int *hash = build_hash(array, length);

  for (int i = 0; i < hash_length; i++) {

    if (hash[i] == 0)
      continue;

    if (hash[i] > first_high_frequency) {
      second_number = i;
      second_high_frequency = first_high_frequency;
      first_number = i;
      first_high_frequency = hash[i];
    } else if (hash[i] > second_high_frequency &&
               hash[i] < first_high_frequency) {
      second_number = i;
      second_high_frequency = hash[i];
    }
  }

  int *result = (int *)malloc(sizeof(int) * 2);
  result[0] = second_number;
  result[1] = second_high_frequency;
  return result;
}

int sum_of_high_and_low_frequency(int *array, int length) {
  int hash_length = max(array, length) + 1;
  int *hash = build_hash(array, length);

  int first_high_frequency = hash[0];
  int second_high_frequency = hash[0];

  for (int i = 0; i < hash_length; i++) {
    if (hash[i] > first_high_frequency)
      first_high_frequency = hash[i];
    if (hash[i] < second_high_frequency)
      second_high_frequency = hash[i];
  }

  return first_high_frequency + second_high_frequency;
}

int main() {
  int array[6] = {1, 1, 1, 1, 3, 2};
  int *result = (int *)malloc(sizeof(int) * 2);
  int length = sizeof(array) / sizeof(array[0]);

  result = highest_frequent_number(array, length);
  printf("Number: %d\nFrequency: %d\n", result[0], result[1]);

  result = second_highest_frequent_number(array, length);
  printf("Number: %d\nFrequency: %d\n", result[0], result[1]);

  printf("Highest Frequency + Lowest Frequency = %d\n",
         sum_of_high_and_low_frequency(array, length));
  return 0;
}
