#include "iostream"
#include <vector>
using namespace std;

vector<int> majority_element(vector<int> &v) {
  vector<int> ans;
  int count_one = 0, count_two = 0;
  int element_one = -1, element_two = -1;
  for (auto it : v) {
    if (count_one == 0 && element_two != it) {
      element_one = it;
      count_one++;
    } else if (count_two == 0 && element_one != it) {
      element_two = it;
      count_two++;
    } else if (it == element_one)
      count_one++;
    else if (it == element_two)
      count_two++;
    else {
      count_one--;
      count_two--;
    }
  }
  int t_count_one = 0, t_count_two = 0;
  for (auto it : v) {
    if (element_one == it)
      t_count_one++;
    else if (element_two == it)
      t_count_two++;
  }
  if (count_one > (int)v.size() / 3)
    ans.push_back(element_one);
  if (count_two > (int)v.size() / 3)
    ans.push_back(element_two);
  return ans;
}

int main() {
  vector<int> v = {};
  for (auto it : majority_element(v)) {
    cout << it << " ";
  }
  cout << "\n";
  return 0;
}
