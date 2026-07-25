#include "iostream"
#include <algorithm>
#include <unordered_map>
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

// long long merge(vector<int> arr, int low, int mid, int high) {
//   long long inverseCount = 0;
//   int left = low;
//   int right = mid + 1;
//   vector<int> temp;

//   while (left <= mid && right <= high) {
//     if (arr[left] <= arr[right]) {
//       temp.push_back(arr[left]);
//       left++;
//     } else {
//       temp.push_back(arr[right]);
//       inverseCount += (mid - low + 1);
//       right++;
//     }
//   }

//   while (left <= mid) {
//     temp.push_back(arr[left]);
//     left++;
//   }
//   while (right <= high) {
//     temp.push_back(arr[right]);
//     right++;
//   }

//   for (int i = low; i < high; i++) {
//     arr[i] = temp[i - low];
//   }

//   return inverseCount;
// }

// long long mergeSortHelper(vector<int> arr, int low, int high) {
//   long long inverseCount = 0;
//   if (low >= high)
//     return inverseCount;
//   int mid = (low + high) / 2;
//   inverseCount += mergeSortHelper(arr, low, mid);
//   inverseCount += mergeSortHelper(arr, mid + 1, high);
//   inverseCount += merge(arr, low, mid, high);
//   return inverseCount;
// }

// long long mergeSort(vector<int> arr) {
//   int low = 0;
//   int high = arr.size() - 1;
//   return mergeSortHelper(arr, low, high);
// }

// long long numberOfInversions(vector<int> arr) { return mergeSort(arr); }

// Linear Search
int linearSearch(vector<int> arr, int target) {
  int n = arr.size();
  int index = -1;
  for (int i = 0; i < n; i++) {
    if (arr[i] == target)
      return i;
  }
  return -1;
}

// Largest Element
int largestElement(vector<int> arr) {
  int n = arr.size();
  int max = arr[0];
  for (int num : arr) {
    if (num > max)
      max = num;
  }
  return max;
}

// Second Largest Element T (2 * n)
int secondLargestElement(vector<int> arr) {
  int n = arr.size();
  int firstLargest = INT_MIN;
  int secondLargest = INT_MIN;
  for (int num : arr) {
    if (num >= firstLargest) {
      secondLargest = firstLargest;
      firstLargest = num;
    } else if (num > secondLargest) {
      secondLargest = num;
    }
  }
  if (secondLargest == firstLargest || secondLargest == INT_MIN)
    return -1;
  return secondLargest;
}

// Maximum Consecutive Ones
int maximumConsecutiveOnes(vector<int> arr) {
  int n = arr.size();
  int count = 0;
  int maxCount = 0;
  for (int i = 0; i < n; i++) {
    if (arr[i] == 1) {
      count++;
      if (count > maxCount)
        maxCount = count;
    } else
      count = 0;
  }
  return maxCount;
}

// Left Rotate Array by One
void leftRotate(vector<int> &arr) {
  int n = arr.size();
  int last = arr[0];
  for (int i = 1; i < n; i++) {
    arr[i - 1] = arr[i];
  }
  arr[n - 1] = last;
}

// Left Rotate Array By K Places
void leftRotate(vector<int> &arr, int k) {
  vector<int> last;
  int n = arr.size();
  k = k % n;
  for (int i = 0; i < k; i++)
    last.push_back(arr[i]);
  for (int i = k; i < n; i++)
    arr[i - k] = arr[i];
  for (int i = n - k; i < n; i++)
    arr[i] = last[i - (n - k)];
}

// Move Zeroes to the End
void moveZeroes(vector<int> &arr) {
  int n = arr.size();
  int k = 0;
  for (int num : arr) {
    if (num != 0) {
      arr[k++] = num;
    }
  }
  for (int i = k; i < n; i++)
    arr[i] = 0;
}

// Remove Duplicates From Sorted Array
int removeDuplicates(vector<int> &arr) {
  int n = arr.size();
  int k = 0;
  for (int i = 0; i < n; i++) {
    // First Element Remains as it is
    if (i == 0) {
      k++;
      continue;
    }
    // Same as the previous element - Continue
    if (arr[i - 1] == arr[i])
      continue;
    // Not same as the previous element - increment k
    else
      arr[k++] = arr[i];
  }
  return k;
}

// Find Missing Number - Range [0, n] using XOR (Exclusive OR)
int missingNumber(vector<int> &arr) {
  int n = arr.size();
  int m = 0;
  for (int i = 0; i < n; i++) {
    m = m ^ arr[i];
    m = m ^ (i + 1);
  }
  return m;
}

// Union of Two Sorted Arrays
vector<int> unionArray(vector<int> arr1, vector<int> arr2) {
  int n = arr1.size(), m = arr2.size();
  int i = 0, j = 0;
  vector<int> ans;
  while (i < n && j < m) {
    if (arr1[i] <= arr2[j]) {
      if (ans.empty() || ans.back() != arr1[i])
        ans.push_back(arr1[i]);
      i++;
    } else {
      if (ans.empty() || ans.back() != arr2[j])
        ans.push_back(arr2[j]);
      j++;
    }
  }
  while (i < n) {
    if (ans.empty() || ans.back() != arr1[i])
      ans.push_back(arr1[i]);
    i++;
  }

  while (j < m) {
    if (ans.empty() || ans.back() != arr2[j])
      ans.push_back(arr2[j]);
    j++;
  }
  return ans;
}

// Intersection Of Two Sorted Arrays
vector<int> intersectionArrays(vector<int> arr1, vector<int> arr2) {
  int n = arr1.size(), m = arr2.size();
  int i = 0, j = 0;
  vector<int> ans;
  while (i < n && j < m) {
    if ((ans.empty() || ans.back() != arr1[i]) && arr1[i] == arr2[j]) {
      ans.push_back(arr1[i]);
      i++;
      j++;
    } else if (arr1[i] < arr2[j])
      i++;
    else
      j++;
  }
  return ans;
}

// Majority Element - 1 (element > n / 2) using Boyer Moore's Voting Algorithm
int majorityElementI(vector<int> arr) {
  int n = arr.size();
  int element = arr[0];
  int count = 0;
  for (int num : arr) {
    if (count == 0) {
      element = num;
      count++;
    } else if (num == element)
      count++;
    else
      count--;
  }
  int element_count = 0;
  for (int num : arr) {
    if (num == element)
      element_count++;
  }
  return element;
}

// Leaders in an Array - Brute
vector<int> leaders(vector<int> arr) {
  int n = arr.size();
  vector<int> ans;
  int max = arr[n - 1];
  ans.push_back(arr[n - 1]);
  for (int i = n - 2; i >= 0; i--) {
    if (arr[i] > max) {
      max = arr[i];
      ans.push_back(max);
    }
  }
  reverse(ans.begin(), ans.end());
  return ans;
}

// Rearrange Array Element by Sign S(n) T(n)
vector<int> rearrangeArrayBySign(vector<int> &arr) {
  int n = arr.size();
  int evenIndex = 0;
  int oddIndex = 1;
  vector<int> ans(n);
  for (int num : arr) {
    if (num > 0) {
      ans[evenIndex] = num;
      evenIndex += 2;
    } else {
      ans[oddIndex] = num;
      oddIndex += 2;
    }
  }
  return ans;
}

// Print Matrix in Spiral Pattern
vector<int> spiralOrder(vector<vector<int>> matrix) {
  int row = matrix.size();    // 3
  int col = matrix[0].size(); // 3
  vector<int> ans;
  int left = 0, top = 0;
  int right = col - 1, bottom = row - 1;
  while (top <= bottom && left <= right) {
    // LEFT -> RIGHT (TOP)
    for (int i = left; i <= right; i++)
      ans.push_back(matrix[top][i]);
    top++;
    // TOP -> BOTTOM (RIGHT)
    if (top < bottom) {
      for (int i = top; i <= bottom; i++)
        ans.push_back(matrix[i][right]);
      right--;
      // RIGHT -> LEFT (BOTTOM)
      if (left < right) {
        for (int i = right; i >= left; i--)
          ans.push_back(matrix[bottom][i]);
        bottom--;
        // BOTTOM -> TOP (LEFT)
        if (top < bottom) {
          for (int i = bottom; i >= top; i--)
            ans.push_back(matrix[i][left]);
          left++;
        }
      }
    }
  }
  return ans;
}

int nCr(int n, int r) {
  int v = 1;
  if (n - r < r)
    r = n - r;
  for (int i = 0; i < r; i++) {
    v = v * (n - i);
    v = v / (i + 1);
  }
  return v;
}

void printPascalTriange(vector<vector<int>> matrix) {
  for (int i = 0; i < matrix.size(); i++) {
    for (int j = 0; j <= i; j++) {
      cout << matrix[i][j] << " ";
    }
    cout << endl;
  }
}

int getpascalTriangeElement(int row, int col) { return nCr(row - 1, col - 1); }

vector<int> getPascalTrangleRow(int row) {
  vector<int> ans(row);
  int value = 1;
  for (int i = 1; i < row - 1; i++) {
    value = value * (row - i) / i;
    ans[i] = value;
  }
  ans[0] = 1;
  ans[row - 1] = 1;
  return ans;
}

vector<vector<int>> getPascalTriangle(int n) {
  vector<vector<int>> ans;
  for (int i = 0; i < n; i++) {
    ans.push_back(getPascalTrangleRow(i + 1));
  }
  return ans;
}

// T(2(n * log n))
void rotateMatrix(vector<vector<int>> &matrix) {
  int n = matrix.size() - 1;    // Row
  int m = matrix[0].size() - 1; // Column
  // Transpose T(n * log n)
  for (int i = 0; i <= n; i++) {
    for (int j = i; j <= m; j++) {
      int temp = matrix[i][j];
      matrix[i][j] = matrix[j][i];
      matrix[j][i] = temp;
    }
  }

  // Reverse Each Row (n * log n)
  for (int i = 0; i <= n; i++) {
    for (int j = 0; j < m / 2; j++) {
      int temp = matrix[i][j];
      matrix[i][j] = matrix[i][m - j];
      matrix[i][m - j] = temp;
    }
  }
}

// Helper Function
void printMatrix(vector<vector<int>> matrix) {
  int row = matrix.size();
  int col = matrix[0].size();
  for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
      cout << matrix[i][j] << " ";
    }
    cout << endl;
  }
}

// T(n) S(n)
vector<int> twoSum(vector<int> arr, int target) {
  vector<int> ans = {-1, -1};
  unordered_map<int, int> map;
  for (int i = 0; i < arr.size(); i++) {
    int difference = target - arr[i];
    if (!map.empty() && map.find(difference) != map.end()) {
      ans = {map[difference], i};
      break;
    }
    map[arr[i]] = i;
  }
  return ans;
}

vector<vector<int>> threeSum(vector<int> arr, int target) {
  vector<vector<int>> ans;
  int n = arr.size();
  sort(arr.begin(), arr.end());
  for (int i = 0; i < n - 2; i++) {
    if (i > 0 && arr[i] == arr[i - 1])
      continue;
    int j = i + 1;
    int k = n - 1;
    while (j < k) {
      int sum = arr[i] + arr[j] + arr[k];
      if (target - sum > 0)
        j++;
      else if (target - sum < 0)
        k--;
      else {
        ans.push_back({arr[i], arr[j], arr[k]});
        j++;
        k--;
        while (j < k && arr[j] == arr[j - 1])
          j++;
        while (j < k && arr[k] == arr[k + 1])
          k--;
      }
    }
  }
  return ans;
}

int main() {
  vector<int> arr = {2, -2, 0, 3, -3, 5};
  vector<vector<int>> ans = threeSum(arr, 0);
  for (vector<int> values : ans) {
    cout << "[ ";
    for (int num : values) {
      cout << num << " ";
    }
    cout << "] ";
  }
  return 0;
}
