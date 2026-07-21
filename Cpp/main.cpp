#include "iostream"
#include <cstddef>
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

vector<int> findRepeatingMissingNumbers(vector<int> arr) {
  long n = arr.size();
  long s = 0, s2 = 0;
  long sn = (n * (n + 1)) / 2, s2n = (n * (n + 1) * (2 * n + 1)) / 6;
  for (long it : arr) {
    s += it;
    s2 += it * it;
  }
  long x_minus_y = s - sn;
  long x_plus_y = (s2 - s2n) / x_minus_y;
  long x = (x_plus_y + x_minus_y) / 2; // repeating number
  long y = x - x_minus_y;              // missing number
  return vector<int>{(int)x, (int)y};
}

int main() {
  vector<int> arr = {1, 3, 2, 2, 4};
  vector<int> ans = findRepeatingMissingNumbers(arr);
  cout << "[" << ans[0] << "," << ans[1] << "]" << endl;
  return 0;
}
