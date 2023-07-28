class Solution {
  double findMedianSortedArrays(List<int> nums1, List<int> nums2) {
    nums1.addAll(nums2);
    
    quickSortHelper(0, nums1.length - 1, nums1);
    

   if (nums1.length == 1) {
      
      return nums1[0].toDouble();
    } else if (nums1.length % 2 != 0) {
      int temp = (nums1.length) ~/ 2;
      return nums1[temp ].toDouble();
    }   else {
      int temp = (nums1.length) ~/ 2;
      return (nums1[temp] + nums1[temp - 1]) / 2;
    }
  }

  List<int> quickSortHelper(int low, int high, List<int> arr) {
    if (low < high) {
      int pivot = arr[high];
      int i = low - 1;
      for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
          i++;
          swapHelper(i, j, arr);
        }
      }
      i++;
      swapHelper(i, high, arr);
      quickSortHelper(low, i - 1, arr);
      quickSortHelper(i + 1, high, arr);
    }
    return arr;
  }

  void swapHelper(int i, int j, List<int> arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

void main() {
  Solution solution = new Solution();
  print(solution.findMedianSortedArrays([1, 3], [2]));
  print(solution.findMedianSortedArrays([1, 2], [3, 4]));
  print(solution.findMedianSortedArrays([0, 0], [0, 0]));
  print(solution.findMedianSortedArrays([1,3], [2]));
  print(solution.findMedianSortedArrays([], [1]));
}
