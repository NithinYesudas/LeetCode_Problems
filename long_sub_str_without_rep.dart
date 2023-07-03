class Solution {
  int lengthOfLongestSubstring(String s) {
    int count = 0;
    int left = -1;

    for (int i = 0; i < s.length; i++) {
      int temp = 1;
      for (int j = i - 1; j > left; j--) {
        
        

        if (s[i] == s[j]) {
          print("breaking");
          left = j;
          break;
        }
        temp++;
      }
      if (count < temp) {
        count = temp;
      }
    }

    return count;
  }
}

void main() {
  Solution sol = Solution();
  print(sol.lengthOfLongestSubstring("bbbbb"));
}
