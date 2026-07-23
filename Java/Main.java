public class Main {

    // private static Integer sumAll(List<Integer> array) {
    //     Integer total = 0;
    //     for (Integer element : array) {
    //         total = total + element;
    //     }
    //     return total;
    // }

    // private static int oddCount(List<Integer> array) {
    //     int count = 0;
    //     for (int element : array) {
    //         if (element % 2 != 0) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // private static void solveTowerOfHanoi(
    //     int disk,
    //     Character fromTower,
    //     Character toTower,
    //     Character auxiliaryTower
    // ) {
    //     if (disk == 1) {
    //         System.out.printf(
    //             "Move disk %d from TOWER %c --> TOWER %c\n",
    //             disk,
    //             fromTower,
    //             toTower
    //         );
    //         return;
    //     }
    //     solveTowerOfHanoi(disk - 1, fromTower, auxiliaryTower, toTower);
    //     System.out.printf(
    //         "Move disk %d from TOWER %c --> TOWER %c\n",
    //         disk,
    //         fromTower,
    //         toTower
    //     );
    //     solveTowerOfHanoi(disk - 1, auxiliaryTower, toTower, fromTower);
    // }

    // private static boolean isSorted(List<Integer> array) {
    //     int current = 0;
    //     for (int i = 1; i < array.size(); i++) {
    //         current = array.get(i - 1);
    //         if (current > array.get(i)) return false;
    //     }
    //     return true;
    // }

    // private static List<Integer> reverse(List<Integer> array) {
    //     int begin = 0;
    //     int end = array.size() - 1;
    //     while (begin < end) {
    //         // SWAP
    //         array.set(begin, array.get(begin) + array.get(end));
    //         array.set(end, array.get(begin) - array.get(end));
    //         array.set(begin, array.get(begin) - array.get(end));
    //         begin++;
    //         end--;
    //     }
    //     return array;
    // }

    // private static List<Integer> highestFrequestElement(List<Integer> array) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int freq = 0;
    //     int elem = 0;
    //     for (int e : array) {
    //         map.put(e, map.getOrDefault(e, 0) + 1);
    //     }

    //     for (int key : map.keySet()) {
    //         if (map.get(key) > freq) {
    //             elem = key;
    //             freq = map.get(key);
    //         }
    //     }
    //     return new ArrayList<>(Arrays.asList(elem, freq));
    // }

    // private static List<Integer> secondFrequentElement(List<Integer> array) {
    //     Map<Integer, Integer> map = new HashMap<>();

    //     int fhe = 0,
    //         fhf = 0;
    //     int she = 0,
    //         shf = -1;

    //     for (int elem : array) {
    //         map.put(elem, map.getOrDefault(elem, 0) + 1);
    //     }

    //     for (int key : map.keySet()) {
    //         if (map.get(key) > fhf) {
    //             shf = fhf;
    //             she = fhe;
    //             fhf = map.get(key);
    //             fhe = key;
    //         } else if (map.get(key) == shf) {
    //             she = she < key ? she : key;
    //         }
    //     }
    //     return new ArrayList<>(Arrays.asList(she, shf));
    // }

    // private static boolean isSorted(List<Integer> array) {
    //     for (int i = 1; i < array.size(); i++) {
    //         int current = array.get(i - 1);
    //         if (current > array.get(i)) return false;
    //     }
    //     return true;
    // }

    // private static Integer sumOfHighestAndLowestElement(List<Integer> array) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int high = 0;

    //     for (int elem : array) {
    //         map.put(elem, map.getOrDefault(elem, 0) + 1);
    //     }

    //     for (int key : map.keySet()) {
    //         if (map.get(key) > high) {
    //             high = map.get(key);
    //         }
    //     }
    //     int low = high;

    //     for (int key : map.keySet()) {
    //         if (map.get(key) < high) {
    //             low = map.get(key);
    //         }
    //     }
    //     return high + low;
    // }

    // private static List<Character> reverse(List<Character> string) {
    //     int begin = 0;
    //     int end = string.size() - 1;
    //     while (begin < end) {
    //         Character temp = string.get(begin);
    //         string.set(begin, string.get(end));
    //         string.set(end, temp);
    //         begin++;
    //         end--;
    //     }
    //     return string;
    // }

    // private static List<Integer> findMissingNumbers(List<Integer> array) {
    //     List<Integer> missing = new ArrayList<>();

    //     for (int i = 1; i < array.size(); i++) {
    //         int current = array.get(i - 1);
    //         while (current + 1 != array.get(i)) {
    //             missing.add(current + 1);
    //             current++;
    //         }
    //     }
    //     return missing;
    // }

    // private static boolean isPalindrome(List<Character> text) {
    //     int begin = 0;
    //     int end = text.size() - 1;

    //     List<Character> initial = new ArrayList<>(text);

    //     while (begin < end) {
    //         Character temp = initial.get(begin);
    //         initial.set(begin, initial.get(end));
    //         initial.set(end, temp);
    //         begin++;
    //         end--;
    //     }

    //     if (initial.toString().equals(text.toString())) {
    //         return true;
    //     }
    //     return false;
    // }

    // private static String largestOddNumber(String text) {
    //     for (int j = text.length() - 1; j >= 0; j--) {
    //         int digit = text.charAt(j) - '0';
    //         if (digit % 2 == 1) {
    //             for (int i = 0; i < text.length(); i++) {
    //                 if (text.charAt(i) != '0') {
    //                     return text.substring(i, j + 1);
    //                 }
    //             }
    //         }
    //     }
    //     return "";
    // }

    // private static void sort(List<String> array) {
    //     for (int i = 0; i < array.size() - 1; i++) {
    //         for (int j = i; j < array.size(); j++) {
    //             if (array.get(i).compareTo(array.get(j)) > 0) {
    //                 String temp = array.get(i);
    //                 array.set(i, array.get(j));
    //                 array.set(j, temp);
    //             }
    //         }
    //     }
    // }

    // private static String longestCommonPrefix(List<String> array) {
    //     sort(array);
    //     String first = array.get(0);
    //     String last = array.get(array.size() - 1);

    //     for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
    //         if (first.charAt(i) != last.charAt(i)) {
    //             return first.substring(0, i);
    //         }
    //     }
    //     return "";
    // }

    // private static boolean isIsomorphic(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     int[] mt = new int[256];
    //     int[] ms = new int[256];
    //     for (int i = 0; i < s.length(); i++) {
    //         if (
    //             (ms[s.charAt(i)] != 0 && ms[s.charAt(i)] != t.charAt(i)) ||
    //             (mt[t.charAt(i)] != 0 && mt[t.charAt(i)] != s.charAt(i))
    //         ) {
    //             return false;
    //         }
    //         ms[s.charAt(i)] = t.charAt(i);
    //         mt[t.charAt(i)] = s.charAt(i);
    //     }

    //     return true;
    // }

    // private static boolean isRotated(String text, String goal) {
    //     if (text.length() != goal.length()) return false;
    //     for (int i = 1; i < text.length(); i++) {
    //         if ((text.substring(i) + text.substring(0, i)).equals(goal)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // private static boolean isAnagram(String text, String goal) {
    //     if (text.length() != goal.length()) return false;

    //     int[] ms = new int[256];
    //     int[] mt = new int[256];

    //     for (int i = 0; i < text.length(); i++) {
    //         ms[text.charAt(i)]++;
    //         mt[goal.charAt(i)]++;
    //     }

    //     for (int i = 0; i < text.length(); i++) {
    //         if (ms[text.charAt(i)] != mt[text.charAt(i)]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // private class Pair {

    //     char ch;
    //     int freq;

    //     Pair(char c, int f) {
    //         this.ch = c;
    //         this.freq = f;
    //     }
    // }

    // private List<Character> frequencySort(String s) {
    //     Pair[] freq = new Pair[26];

    //     for (int i = 0; i < 26; i++) {
    //         freq[i] = new Pair((char) ('a' + i), 0);
    //     }

    //     for (char c : s.toCharArray()) {
    //         freq[c - 'a'].freq++;
    //     }

    //     Arrays.sort(freq, (a, b) -> {
    //         if (a.freq != b.freq) return b.freq - a.freq;
    //         return a.ch - b.ch;
    //     });

    //     List<Character> result = new ArrayList<>();

    //     for (Pair p : freq) {
    //         if (p.freq != 0) {
    //             result.add(p.ch);
    //         }
    //     }
    //     return result;
    // }

    // private static int NnumbersSum(int n) {
    //     if (n < 1) {
    //         return 0;
    //     }
    //     return n + NnumbersSum(n - 1);
    // }

    // private static long factorial(int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     return n * factorial(n - 1);
    // }

    // private static int arraySum(int[] nums) {
    //     if (nums.length == 0) {
    //         return 0;
    //     }
    //     return (
    //         nums[nums.length - 1] +
    //         arraySum(Arrays.copyOfRange(nums, 0, nums.length - 1))
    //     );
    // }

    // private static void reverse(ArrayList<Character> s, int first, int last) {
    //     if (first > last) {
    //         return;
    //     }
    //     char temp = s.get(first);
    //     s.set(first, s.get(last));
    //     s.set(last, temp);
    //     reverse(s, first + 1, last - 1);
    // }

    // private static ArrayList<Character> reverseString(ArrayList<Character> s) {
    //     int first = 0;
    //     int last = s.size() - 1;

    //     reverse(s, first, last);
    //     return s;
    // }

    // private static void reverse(char[] s, int first, int last) {
    //     if (first >= last) {
    //         return;
    //     }
    //     char temp = s[first];
    //     s[first] = s[last];
    //     s[last] = temp;

    //     reverse(s, first + 1, last - 1);
    // }

    // private static boolean isPalindrome(String s) {
    //     char[] ch = s.toCharArray();
    //     int first = 0;
    //     int last = s.length() - 1;
    //     reverse(ch, first, last);

    //     if (new String(ch).equals(s)) {
    //         return true;
    //     }
    //     return false;
    // }

    // private static boolean checkDivisibility(int num, int i) {
    //     if (num == 1 || num == 0) return false;
    //     if (num == 2) return true;
    //     if (num % i == 0) return false;
    //     if (i > num / 2) return true;
    //     return checkDivisibility(num, i + 1);
    // }

    // private static boolean checkPrime(int num) {
    //     return checkDivisibility(num, 2);
    // }

    // private static void reverse(int[] nums, int first, int last) {
    //     if (first >= last) {
    //         return;
    //     }
    //     nums[first] = nums[first] + nums[last];
    //     nums[last] = nums[first] - nums[last];
    //     nums[first] = nums[first] - nums[last];
    //     reverse(nums, first + 1, last - 1);
    // }

    // private static int[] reverseArray(int[] nums) {
    //     int first = 0;
    //     int last = nums.length - 1;
    //     reverse(nums, first, last);
    //     return nums;
    // }

    // private static boolean checkSorted(ArrayList<Integer> nums, int current) {
    //     if (
    //         current + 1 < nums.size() &&
    //         nums.get(current) > nums.get(current + 1)
    //     ) return false;
    //     if (current + 1 >= nums.size()) return true;

    //     return checkSorted(nums, current + 1);
    // }

    // private static boolean isSorted(ArrayList<Integer> nums) {
    //     return checkSorted(nums, 0);
    // }

    // private static int sumDigits(int num) {
    //     if (num == 0) {
    //         return 0;
    //     }
    //     return (num % 10) + sumDigits(num / 10);
    // }

    // private static int addDigits(int num) {
    //     int result = sumDigits(num);
    //     if (result < 10) {
    //         return result;
    //     }
    //     return addDigits(result);
    // }

    // private static int fib(int n) {
    //     if (n <= 1) return n;
    //     return fib(n - 1) + fib(n - 2);
    // }

    // private static int removeDuplicate(int[] nums) {
    //     int k = 0;
    //     if (nums.length < 2) return nums.length;
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] != nums[i + 1]) {
    //             nums[k] = nums[i];
    //             nums[k + 1] = nums[i + 1];
    //             k++;
    //         }
    //     }
    //     return k + 1;
    // }

    // private static void selectionSort(int[] nums) {
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[j] < nums[i]) {
    //                 int temp = nums[i];
    //                 nums[i] = nums[j];
    //                 nums[j] = temp;
    //             }
    //         }
    //     }
    // }

    // private static void bubbleSort(int[] nums) {
    //     int count = 1;
    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         boolean isSwapped = false;
    //         for (int j = 0; j < i; j++) {
    //             if (nums[j] > nums[j + 1]) {
    //                 int temp = nums[j];
    //                 nums[j] = nums[j + 1];
    //                 nums[j + 1] = temp;
    //                 isSwapped = true;
    //             }
    //         }
    //         if (!isSwapped) {
    //             break;
    //         }
    //     }
    // }

    // private static void insertionSort(int[] nums) {
    //     for (int i = 1; i < nums.length; i++) {
    //         for (int j = 0; j < i; j++) {
    //             if (nums[j] > nums[i]) {
    //                 int temp = nums[i];
    //                 nums[i] = nums[j];
    //                 nums[j] = temp;
    //             }
    //         }
    //     }
    // }

    // private static int findMaxConsecutiveOnes(int[] nums) {
    //     int count = 0;
    //     int mxcount = 0;
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i] == 1) count++;
    //         if (nums[i] != nums[i + 1]) {
    //             if (mxcount < count) mxcount = count;
    //             count = 0;
    //         }
    //     }

    //     return mxcount;
    // }

    // private static void rotateArrayByOne(int[] nums) {
    //     int last = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         nums[i - 1] = nums[i];
    //     }
    //     nums[nums.length - 1] = last;
    // }

    // private static void rotateArray(int[] nums, int k) {
    //     List<Integer> temp = new ArrayList<>();
    //     for (int i = 0; i < k; i++) {
    //         temp.add(nums[i]);
    //     }

    //     int n = nums.length;
    //     for (int i = k; i < n; i++) {
    //         nums[i - k] = nums[i];
    //     }
    //     for (int i = n - k; i < n; i++) {
    //         nums[i] = temp.get(i - (n - k));
    //     }
    // }

    // private static void moveZeroes(int[] nums) {
    //     int n = nums.length;
    //     int k = 0;
    //     int idx = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (nums[i] == 0) {
    //             k++;
    //             continue;
    //         }
    //         nums[idx] = nums[i];
    //         idx++;
    //     }
    //     for (int i = n - k; i < n; i++) {
    //         nums[i] = 0;
    //     }
    // }

    // private static int removeDuplicates(int[] nums) {
    //     Set<Integer> container = new HashSet<>();
    //     int n = nums.length;
    //     int j = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (!container.contains(nums[i])) {
    //             nums[j] = nums[i];
    //             j++;
    //             container.add(nums[i]);
    //         }
    //     }

    //     for (int i = j; i < n; i++) {
    //         nums[i] = 0;
    //     }

    //     return container.size();
    // }

    // private static int missingNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         if (nums[i] != i) return i;
    //     }
    //     return n;
    // }

    // private static int[] unionArray(int[] num1, int[] num2) {
    //     Set<Integer> sortedSet = new TreeSet<>();

    //     for (int num : num1) sortedSet.add(num);
    //     for (int num : num2) sortedSet.add(num);

    //     int[] nums = new int[sortedSet.size()];
    //     int i = 0;
    //     for (int element : sortedSet) {
    //         nums[i] = element;
    //         i++;
    //     }
    //     return nums;
    // }

    // private static void merge(int[] nums, int low, int mid, int high) {
    //     int left = low;
    //     int right = mid + 1;

    //     List<Integer> temp = new ArrayList<>();
    //     while (left <= mid && right <= high) {
    //         if (nums[left] <= nums[right]) {
    //             temp.add(nums[left]);
    //             left++;
    //         } else {
    //             temp.add(nums[right]);
    //             right++;
    //         }
    //     }

    //     while (left <= mid) {
    //         temp.add(nums[left]);
    //         left++;
    //     }
    //     while (right <= high) {
    //         temp.add(nums[right]);
    //         right++;
    //     }

    //     for (int i = low; i <= high; i++) {
    //         nums[i] = temp.get(i - low);
    //     }
    // }

    // private static void divideAndMerge(int[] nums, int low, int high) {
    //     if (low >= high) return;
    //     int mid = (low + high) / 2;
    //     divideAndMerge(nums, low, mid);
    //     divideAndMerge(nums, mid + 1, high);
    //     merge(nums, low, mid, high);
    // }

    // private static void mergeSort(int[] nums) {
    //     int low = 0;
    //     int high = nums.length - 1;
    //     divideAndMerge(nums, low, high);
    // }

    // private static void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }

    // private static int partition(int[] nums, int low, int high) {
    //     int pivotIndex = low;
    //     int i = low + 1;
    //     int j = high;

    //     while (i < j) {
    //         while (nums[i] <= nums[pivotIndex] && i < high) i++;
    //         while (nums[j] > nums[pivotIndex] && j > low) j--;
    //         if (i < j) swap(nums, i, j);
    //     }
    //     swap(nums, pivotIndex, j);
    //     return j;
    // }

    // private static void quickSortHelper(int[] nums, int low, int high) {
    //     if (low >= high) return;
    //     int partitionIndex = partition(nums, low, high);
    //     quickSortHelper(nums, low, partitionIndex - 1);
    //     quickSortHelper(nums, partitionIndex + 1, high);
    // }

    // private static void quickSort(int[] nums) {
    //     int low = 0;
    //     int high = nums.length - 1;
    //     quickSortHelper(nums, low, high);
    // }

    // private static int findMaximumConsecutiveOnes(int[] nums) {
    //     int count = 0;
    //     int maxCount = 0;
    //     for (int num : nums) {
    //         if (num == 1) {
    //             count++;
    //             if (maxCount < count) maxCount = count;
    //         } else {
    //             count = 0;
    //         }
    //     }
    //     return maxCount;
    // }

    // private static void rotateArrayByOne(int[] nums) {
    //     int firstElement = nums[0];
    //     int n = nums.length;
    //     for (int i = 1; i < n; i++) {
    //         nums[i - 1] = nums[i];
    //     }
    //     nums[n - 1] = firstElement;
    // }

    // private static void rotateArray(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;

    //     int[] temp = new int[k];

    //     for (int i = 0; i < k; i++) temp[i] = nums[i];
    //     for (int i = k; i < n; i++) nums[i - k] = nums[i];
    //     for (int i = n - k; i < n; i++) nums[i] = temp[i - (n - k)];
    // }

    // private static void reverse(int[] nums, int low, int high) {
    //     while (low < high) {
    //         int temp = nums[low];
    //         nums[low] = nums[high];
    //         nums[high] = temp;
    //         low++;
    //         high--;
    //     }
    // }

    // private static void rotateArray(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     reverse(nums, 0, k - 1);
    //     reverse(nums, k, n - 1);
    //     reverse(nums, 0, n - 1);
    // }

    // private static void moveZeroes(int[] nums) {
    //     int j = 0;
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         if (nums[i] != 0) {
    //             nums[j] = nums[i];
    //             j++;
    //         }
    //     }
    //     for (int i = j; i < n; i++) {
    //         nums[i] = 0;
    //     }
    // }

    // private static int removeDuplicates(int[] nums) {
    //     int j = 1;
    //     int visited = nums[0];
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != visited) {
    //             nums[j] = nums[i];
    //             visited = nums[i];
    //             j++;
    //         }
    //     }

    //     return j;
    // }

    // private static int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int missing = 0;
    //     for (int i = 0; i < n; i++) missing ^= i ^ nums[i];
    //     return missing ^ n;
    // }

    // private static int[] unionArray(int[] nums1, int[] nums2) {
    //     Set<Integer> temp = new TreeSet<>();
    //     for (int num : nums1) temp.add(num);
    //     for (int num : nums2) temp.add(num);
    //     int[] union = new int[temp.size()];
    //     int i = 0;
    //     for (int num : temp) {
    //         union[i] = num;
    //         i++;
    //     }
    //     return union;
    // }

    // private static int[] missingNumbers(int[] nums) {
    //     int n = nums.length;
    //     List<Integer> temp = new ArrayList<>();
    //     for (int i = 1; i < n; i++) {
    //         int nextNumber = nums[i - 1] + 1;
    //         while (nextNumber < nums[i]) {
    //             temp.add(nextNumber);
    //             nextNumber++;
    //         }
    //     }

    //     int[] result = new int[temp.size()];
    //     int i = 0;
    //     for (int num : temp) {
    //         result[i] = num;
    //         i++;
    //     }
    //     return result;
    // }

    // private static List<Integer> unionArray(
    //     List<Integer> nums1,
    //     List<Integer> nums2
    // ) {
    //     int i, j, n, m;
    //     i = 0;
    //     j = 0;
    //     n = nums1.size();
    //     m = nums2.size();
    //     List<Integer> union = new ArrayList<>();
    //     while (i < n && j < m) {
    //         if (nums1.get(i) <= nums2.get(j)) {
    //             if (union.isEmpty() || union.getLast() != nums1.get(i)) {
    //                 union.add(nums1.get(i));
    //             }
    //             i++;
    //         } else {
    //             if (union.isEmpty() || union.getLast() != nums2.get(j)) {
    //                 union.add(nums2.get(j));
    //             }
    //             j++;
    //         }
    //     }
    //     while (i < n) {
    //         if (union.getLast() != nums1.get(i)) {
    //             union.add(nums1.get(i));
    //         }
    //         i++;
    //     }
    //     while (j < m) {
    //         if (union.getLast() != nums2.get(j)) {
    //             union.add(nums2.get(j));
    //         }
    //         j++;
    //     }

    //     return union;
    // }

    // private static List<Integer> intersectionArray(
    //     List<Integer> nums1,
    //     List<Integer> nums2
    // ) {
    //     int i = 0;
    //     int j = 0;
    //     int n = nums1.size();
    //     int m = nums2.size();
    //     List<Integer> intersect = new ArrayList<>();
    //     while (i < n && j < m) {
    //         if (nums1.get(i) < nums2.get(j)) i++;
    //         else if (nums2.get(j) < nums1.get(i)) j++;
    //         else {
    //             intersect.add(nums1.get(i));
    //             i++;
    //             j++;
    //         }
    //     }
    //     // boolean[] marked = new boolean[m];
    //     // for (int i = 0; i < n; i++) {
    //     //     for (int j = 0; j < m; j++) {
    //     //         if (nums1.get(i) < nums2.get(j)) break;
    //     //         if (!marked[j] && nums1.get(i) == nums2.get(j)) {
    //     //             intersect.add(nums1.get(i));
    //     //             marked[j] = true;
    //     //             break;
    //     //         }
    //     //     }
    //     // }
    //     return intersect;
    // }

    // private static int majorityElement(int[] nums) {
    //     int count = 0;
    //     int element = -1;
    //     for (int num : nums) {
    //         if (count == 0) {
    //             element = num;
    //             count++;
    //         } else if (num == element) {
    //             count++;
    //         } else {
    //             count--;
    //         }
    //     }
    //     return element;
    // }

    // private static List<Integer> leaders(int[] nums) {
    //     List<Integer> ll = new ArrayList<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         boolean isLeader = true;
    //         for (int j = i; j < nums.length; j++) {
    //             if (nums[i] < nums[j]) {
    //                 isLeader = false;
    //                 break;
    //             }
    //         }
    //         if (isLeader) {
    //             if (ll.isEmpty()) ll.add(nums[i]);
    //             else if (ll.getLast() != nums[i]) ll.add(nums[i]);
    //         }
    //     }
    //     return ll;
    // }

    // private static void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }

    // private static int[] rearrangeArray(int[] nums) {
    //     int posIndex = 0,
    //         negIndex = 1;
    //     int[] result = new int[nums.length];
    //     for (int num : nums) {
    //         if (num > 0) {
    //             result[posIndex] = num;
    //             posIndex += 2;
    //         } else {
    //             result[negIndex] = num;
    //             negIndex += 2;
    //         }
    //     }
    //     return result;
    // }

    // private static List<Integer> spiralOrder(int[][] matrix) {
    //     List<Integer> order = new ArrayList<>();
    //     int totalColumn = matrix[0].length - 1;
    //     int totalRow = matrix.length - 1;

    //     int top = 0,
    //         bottom = totalRow;
    //     int left = 0,
    //         right = totalColumn;

    //     while (top <= bottom && left <= right) {
    //         // LEFT --> RIGHT
    //         for (int i = left; i <= right; i++) order.add(matrix[top][i]);
    //         top++;
    //         if (top <= bottom) {
    //             // TOP --> BOTTOM
    //             for (int i = top; i <= bottom; i++) order.add(matrix[i][right]);
    //             right--;

    //             if (left <= right) {
    //                 // RIGHT --> LEFT
    //                 for (int i = right; i >= left; i--) order.add(
    //                     matrix[bottom][i]
    //                 );
    //                 bottom--;

    //                 if (top <= bottom) {
    //                     // BOTTOM --> TOP
    //                     for (int i = bottom; i >= top; i--) order.add(
    //                         matrix[i][left]
    //                     );
    //                     left++;
    //                 }
    //             }
    //         }
    //     }
    //     return order;
    // }

    // private static int[] pascalsTriangleII(int r) {
    //     int[] row = new int[r];
    //     row[0] = 1;
    //     for (int i = 1; i < r; i++) {
    //         row[i] = (row[i - 1] * (r - i)) / i;
    //     }
    //     return row;
    // }

    // private static void swap(int[][] matrix, int i, int j, int k, int l) {
    //     matrix[i][j] = matrix[i][j] + matrix[k][l];
    //     matrix[k][l] = matrix[i][j] - matrix[k][l];
    //     matrix[i][j] = matrix[i][j] - matrix[k][l];
    // }

    // private static void transposeArray(int[][] matrix) {
    //     int n = matrix.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             swap(matrix, i, j, j, i);
    //         }
    //     }
    // }

    // private static void rotateArray(int[][] matrix) {
    //     int n = matrix.length;
    //     transposeArray(matrix);
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n / 2; j++) {
    //             swap(matrix, i, j, i, n - 1 - j);
    //         }
    //     }
    // }

    // private static int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         int difference = target - nums[i];
    //         for (int j = i + 1; j < n; j++) {
    //             if (difference == nums[j]) return new int[] { i, j };
    //         }
    //     }

    //     return new int[] { -1, -1 };
    // }

    // private static List<List<Integer>> threeSum(int[] nums) {
    //     int n = nums.length;
    //     List<List<Integer>> values = new ArrayList<>();
    //     Arrays.sort(nums);
    //     for (int i = 0; i < n; i++) {
    //         if (i > 0 && nums[i - 1] == nums[i]) continue;
    //         int j = i + 1;
    //         int k = n - 1;
    //         while (j < k) {
    //             int sum = nums[i] + nums[j] + nums[k];
    //             if (sum < 0) {
    //                 j++;
    //             } else if (sum > 0) {
    //                 k--;
    //             } else {
    //                 values.add(
    //                     new ArrayList<>(
    //                         Arrays.asList(nums[i], nums[j], nums[k])
    //                     )
    //                 );
    //                 j++;
    //                 k--;
    //                 while (j < k && nums[j - 1] == nums[j]) j++;
    //                 while (j < k && nums[k + 1] == nums[k]) k--;
    //             }
    //         }
    //     }
    //     return values;
    // }

    // private static List<List<Integer>> threeSum(int[] nums, int target) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     List<List<Integer>> values = new ArrayList<>();
    //     for (int i = 0; i < n; i++) {
    //         if (i > 0 && nums[i] == nums[i - 1]) continue;
    //         int j = i + 1;
    //         int k = n - 1;
    //         while (j < k) {
    //             int sum = nums[i] + nums[j] + nums[k];
    //             if (sum < target) j++;
    //             else if (sum > target) k--;
    //             else {
    //                 values.add(Arrays.asList(nums[i], nums[j], nums[k]));
    //                 j++;
    //                 k--;
    //                 while (j < k && nums[j] == nums[j - 1]) j++;
    //                 while (j < k && nums[k] == nums[k + 1]) k--;
    //             }
    //         }
    //     }
    //     return values;
    // }

    // private static void sortZeroOneTwo(int[] nums) {
    //     int zeroCounter = 0,
    //         oneCounter = 0,
    //         twoCounter = 0;
    //     for (int num : nums) {
    //         if (num == 0) zeroCounter++;
    //         else if (num == 1) oneCounter++;
    //         else twoCounter++;
    //     }
    //     int index = 0;
    //     while (zeroCounter > 0 || oneCounter > 0 || twoCounter > 0) {
    //         while (zeroCounter > 0) {
    //             nums[index] = 0;
    //             zeroCounter--;
    //             index++;
    //         }
    //         while (oneCounter > 0) {
    //             nums[index] = 1;
    //             oneCounter--;
    //             index++;
    //         }
    //         while (twoCounter > 0) {
    //             nums[index] = 2;
    //             twoCounter--;
    //             index++;
    //         }
    //     }
    // }

    // private static List<List<Integer>> fourSum(int[] nums, int target) {
    //     int n = nums.length;
    //     Arrays.sort(nums);
    //     List<List<Integer>> values = new ArrayList<>();
    //     for (int i = 0; i < n - 3; i++) {
    //         if (i > 0 && nums[i] == nums[i - 1]) continue;
    //         for (int j = i + 1; j < n - 2; j++) {
    //             if (j > i + 1 && nums[j] == nums[j - 1]) continue;
    //             int k = j + 1;
    //             int l = n - 1;
    //             while (k < l) {
    //                 int sum = nums[i] + nums[j] + nums[k] + nums[l];
    //                 if (sum < target) k++;
    //                 else if (sum > target) l--;
    //                 else {
    //                     values.add(
    //                         Arrays.asList(nums[i], nums[j], nums[k], nums[l])
    //                     );
    //                     k++;
    //                     l--;
    //                     while (k < l && nums[k] == nums[k - 1]) k++;
    //                     while (k < l && nums[l] == nums[l + 1]) l--;
    //                 }
    //             }
    //         }
    //     }
    //     return values;
    // }

    // private static void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }

    // private static void sortZeroOneTwo(int[] nums) {
    //     int n = nums.length;
    //     int low = 0,
    //         mid = 0,
    //         high = n - 1;

    //     while (mid <= high) {
    //         if (nums[mid] == 0) {
    //             swap(nums, mid, low);
    //             mid++;
    //             low++;
    //         } else if (nums[mid] == 1) {
    //             mid++;
    //         } else if (nums[mid] == 2) {
    //             swap(nums, mid, high);
    //             high--;
    //         }
    //     }
    // }

    // private static void sortOnesAndZeros(int[] nums) {
    //     int n = nums.length;
    //     int low = 0;
    //     int high = n - 1;
    //     while (low <= high) {
    //         if (nums[low] == 1) {
    //             swap(nums, low, high);
    //             high--;
    //         } else low++;
    //     }
    // }

    // class Output {

    //     static int maximumSum = Integer.MIN_VALUE;
    //     static int[] maxSubArray;
    // }

    // private static void maxSubArray(int[] nums) {
    //     int n = nums.length;
    //     int recurringSum = 0;
    //     int start = 0;
    //     int updatedStart = 0;
    //     int end = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (recurringSum == 0) updatedStart = i;
    //         recurringSum += nums[i];
    //         if (recurringSum > Output.maximumSum) {
    //             Output.maximumSum = recurringSum;
    //             start = updatedStart;
    //             end = i;
    //         }
    //         if (recurringSum < 0) recurringSum = 0;
    //     }
    //     Output.maxSubArray = new int[end - start + 1];

    //     for (int i = start; i <= end; i++) {
    //         Output.maxSubArray[i - start] = nums[i];
    //     }
    // }

    // private static void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }

    // private static void reverse(int[] nums, int start, int end) {
    //     while (start < end) {
    //         swap(nums, start, end);
    //         start++;
    //         end--;
    //     }
    // }

    // private static void nextPermutation(int[] nums) {
    //     int n = nums.length;
    //     int index = -1;

    //     for (int i = n - 2; i >= 0; i--) {
    //         if (nums[i] < nums[i + 1]) {
    //             index = i;
    //             break;
    //         }
    //     }

    //     if (index == -1) {
    //         reverse(nums, 0, n - 1);
    //         return;
    //     }

    //     for (int i = n - 1; i > index; i--) {
    //         if (nums[i] > nums[index]) {
    //             swap(nums, i, index);
    //             break;
    //         }
    //     }
    //     reverse(nums, index + 1, n - 1);
    // }

    // private static List<Integer> majorityElement(int[] nums) {
    //     List<Integer> values = new ArrayList<>();
    //     int elementOne = 0,
    //         elementTwo = 0;
    //     int countOne = 0,
    //         countTwo = 0;
    //     int n = nums.length;
    //     for (int num : nums) {
    //         if (countOne == 0 && elementTwo != num) {
    //             elementOne = num;
    //             countOne++;
    //         } else if (countTwo == 0 && elementOne != num) {
    //             elementTwo = num;
    //             countTwo++;
    //         } else if (elementOne == num) {
    //             countOne++;
    //         } else if (elementTwo == num) {
    //             countTwo++;
    //         } else {
    //             countOne--;
    //             countTwo--;
    //         }
    //     }
    //     int testCountOne = 0,
    //         testCountTwo = 0;
    //     for (int num : nums) {
    //         if (elementOne == num) testCountOne++;
    //         else if (elementTwo == num) testCountTwo++;
    //     }
    //     if (testCountOne > n / 3) values.add(elementOne);
    //     if (testCountTwo > n / 3) values.add(elementTwo);
    //     return values;
    // }

    // private static int findMissingElement(int[] nums) {
    //     int n = nums.length;
    //     int missingElement = -1;
    //     boolean foundMissing = false;
    //     Arrays.sort(nums);
    //     if (nums[0] != 1) {
    //         missingElement = 1;
    //         return missingElement;
    //     }
    //     for (int i = 1; i < n; i++) {
    //         if (nums[i] - nums[i - 1] > 1) {
    //             missingElement = nums[i] - 1;
    //             foundMissing = true;
    //             break;
    //         }
    //     }
    //     if (!foundMissing) missingElement = nums[n - 1] + 1;
    //     return missingElement;
    // }

    // private static int findRepeatingElement(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //     for (int num : nums) {
    //         if (set.contains(num)) return num;
    //         set.add(num);
    //     }
    //     return -1;
    // }

    // [a, b] a - appearing more than once, b - missing number
    // private static int[] findMissingRepeatingNumbers(int[] nums) {
    //     int n = nums.length;
    //     int xor = 0;
    //     for (int i = 0; i < n; i++) {
    //         xor = xor ^ nums[i];
    //         xor = xor ^ (i + 1);
    //     }
    //     int differentiatingBit = 0;
    //     // while (true) {
    //     //     if ((xor & (1 << differentiatingBit)) != 0) break;
    //     //     differentiatingBit++;
    //     // }
    //     differentiatingBit = xor & ~(xor - 1);
    //     int zero = 0,
    //         one = 0;
    //     for (int num : nums) {
    //         if ((num & (1 << differentiatingBit)) != 0) one = one ^ num;
    //         else zero = zero ^ num;
    //     }
    //     for (int i = 1; i <= n; i++) {
    //         if ((i & (1 << differentiatingBit)) != 0) one = one ^ i;
    //         else zero = zero ^ i;
    //     }
    //     int count = 0;
    //     for (int num : nums) if (num == zero) count++;
    //     if (count == 0) return new int[] { one, zero };
    //     return new int[] { zero, one };
    // }

    // private static long merge(int[] nums, int low, int mid, int high) {
    //     long inverseCount = 0;
    //     int left = low;
    //     int right = mid + 1;
    //     List<Integer> temp = new ArrayList<>();
    //     while (left <= mid && right <= high) {
    //         if (nums[left] <= nums[right]) {
    //             temp.add(nums[left]);
    //             left++;
    //         } else {
    //             temp.add(nums[right]);
    //             inverseCount += mid - left + 1;
    //             right++;
    //         }
    //     }
    //     while (left <= mid) {
    //         temp.add(nums[left]);
    //         left++;
    //     }
    //     while (right <= high) {
    //         temp.add(nums[right]);
    //         right++;
    //     }
    //     for (int i = low; i <= high; i++) {
    //         nums[i] = temp.get(i - low);
    //     }
    //     return inverseCount;
    // }

    // private static long mergeSortHelper(int[] nums, int low, int high) {
    //     long inverseCount = 0;
    //     if (low >= high) return inverseCount;
    //     int mid = (low + high) / 2;
    //     inverseCount += mergeSortHelper(nums, low, mid);
    //     inverseCount += mergeSortHelper(nums, mid + 1, high);
    //     inverseCount += merge(nums, low, mid, high);
    //     return inverseCount;
    // }

    // private static long mergeSort(int[] nums) {
    //     int low = 0;
    //     int high = nums.length - 1;
    //     return mergeSortHelper(nums, low, high);
    // }

    // private static long numberOfInversions(int[] nums) {
    //     return mergeSort(nums);
    // }

    // Reverse Pair - Brute Force T(n^2) - S(1)
    private static int reversePairs(int[] nums) {
        int n = nums.length;
        int reversePairCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > 2 * nums[j]) reversePairCount++;
            }
        }
        return reversePairCount;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 6, 4, 1, 2, 7 };
        int count = reversePairs(nums);
        System.out.printf("%d\n", count);
    }
}
