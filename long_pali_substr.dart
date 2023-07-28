class Solution {
  String longestPalindrome(String s) {
    String result = "";
    for (int i = 0; i < s.length; i++) {
      for (int j = s.length ; j >= i; j--) {
        final subStr = s.substring(i, j);
        if (isPalindrome(subStr)) {
          if (result.length < subStr.length) {
            result = subStr;
          }
        }
      }
    }
    return result;
  }

  bool isPalindrome(String str) {
    for (int i = 0; i < str.length/2; i++) {
      if (str[i] != str[str.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}

void main() {
  Solution solution = Solution();
  final result = solution.longestPalindrome("a");
  print(result);
}
