#include "iostream"
#include <vector>
using namespace std;

// vector<int> majority_element(vector<int> &v) {
//   vector<int> ans;
//   int count_one = 0, count_two = 0;
//   int element_one = -1, element_two = -1;
//   for (auto it : v) {
//     if (count_one == 0 && element_two != it) {
//       element_one = it;
//       count_one++;
//     } else if (count_two == 0 && element_one != it) {
//       element_two = it;
//       count_two++;
//     } else if (it == element_one)
//       count_one++;
//     else if (it == element_two)
//       count_two++;
//     else {
//       count_one--;
//       count_two--;
//     }
//   }
//   int t_count_one = 0, t_count_two = 0;
//   for (auto it : v) {
//     if (element_one == it)
//       t_count_one++;
//     else if (element_two == it)
//       t_count_two++;
//   }
//   if (count_one > (int)v.size() / 3)
//     ans.push_back(element_one);
//   if (count_two > (int)v.size() / 3)
//     ans.push_back(element_two);
//   return ans;
// }

// vector<int> findRepeatingMissingNumbers(vector<int> arr) {
//   long n = arr.size();
//   long s = 0, s2 = 0;
//   long sn = (n * (n + 1)) / 2, s2n = (n * (n + 1) * (2 * n + 1)) / 6;
//   for (long it : arr) {
//     s += it;
//     s2 += it * it;
//   }
//   long x_minus_y = s - sn;
//   long x_plus_y = (s2 - s2n) / x_minus_y;
//   long x = (x_plus_y + x_minus_y) / 2; // repeating number
//   long y = x - x_minus_y;              // missing number
//   return vector<int>{(int)x, (int)y};
// }

// Optimal Approach - 2 | Bit Manipulation Method
// vector<int> findRepeatingMissingNumbers(vector<int> arr) {
//   int n = arr.size();
//   int xr = 0;
//   for (int i = 0; i < n; i++) {
//     xr = xr ^ arr[i];
//     xr = xr ^ (i + 1);
//   }
//   int diff_bit = xr & ~(xr - 1);
//   int x = 0, y = 0;
//   for (int i = 0; i < n; i++) {
//     if (arr[i] & diff_bit)
//       x = x ^ arr[i];
//     else
//       y = y ^ arr[i];
//     if ((i + 1) & diff_bit)
//       x = x ^ (i + 1);
//     else
//       y = y ^ (i + 1);
//   }

//   int count = 0;
//   for (int num : arr) {
//     if (num == x)
//       count++;
//   }
//   if (count == 2)
//     return vector<int>{x, y};
//   return vector<int>{y, x};
// }

long long merge(vector<int> arr, int low, int mid, int high) {
  long long inverseCount = 0;
  int left = low;
  int right = mid + 1;
  vector<int> temp;

  while (left <= mid && right <= high) {
    if (arr[left] <= arr[right]) {
      temp.push_back(arr[left]);
      left++;
    } else {
      temp.push_back(arr[right]);
      inverseCount += (mid - low + 1);
      right++;
    }
  }

  while (left <= mid) {
    temp.push_back(arr[left]);
    left++;
  }
  while (right <= high) {
    temp.push_back(arr[right]);
    right++;
  }

  for (int i = low; i < high; i++) {
    arr[i] = temp[i - low];
  }

  return inverseCount;
}

long long mergeSortHelper(vector<int> arr, int low, int high) {
  long long inverseCount = 0;
  if (low >= high)
    return inverseCount;
  int mid = (low + high) / 2;
  inverseCount += mergeSortHelper(arr, low, mid);
  inverseCount += mergeSortHelper(arr, mid + 1, high);
  inverseCount += merge(arr, low, mid, high);
  return inverseCount;
}

long long mergeSort(vector<int> arr) {
  int low = 0;
  int high = arr.size() - 1;
  return mergeSortHelper(arr, low, high);
}

long long numberOfInversions(vector<int> arr) { return mergeSort(arr); }

int main() {
  vector<int> arr = {9, 5, 4, 2};
  cout << numberOfInversions(arr) << endl;
}
