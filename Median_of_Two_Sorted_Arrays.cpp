//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

//The overall run time complexity should be O(log (m+n)).

#include <vector>
#include <algorithm> // For std::max, std::min
#include <limits>    // For std::numeric_limits<int>::MIN/MAX

class Solution {
public:
    double findMedianSortedArrays(std::vector<int>& nums1, std::vector<int>& nums2) {
        // Ensure nums1 is the smaller array for binary search optimization
        if (nums1.size() > nums2.size()) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.size();
        int n = nums2.size();

        int low = 0;
        int high = m; // Binary search for partition point in nums1

        // half_len is the number of elements in the left partition of the combined array.
        // For an odd total length, this will be the index of the median.
        // For an even total length, this will be the index of the left of the two medians.
        int half_len = (m + n + 1) / 2; 

        while (low <= high) {
            int i = low + (high - low) / 2; // Partition point for nums1 (number of elements from nums1)
            int j = half_len - i;           // Partition point for nums2 (number of elements from nums2)

            // Get elements around the partitions
            // maxLeft1: max element in the left part of nums1
            // minRight1: min element in the right part of nums1
            int maxLeft1 = (i == 0) ? std::numeric_limits<int>::min() : nums1[i - 1];
            int minRight1 = (i == m) ? std::numeric_limits<int>::max() : nums1[i];

            // maxLeft2: max element in the left part of nums2
            // minRight2: min element in the right part of nums2
            int maxLeft2 = (j == 0) ? std::numeric_limits<int>::min() : nums2[j - 1];
            int minRight2 = (j == n) ? std::numeric_limits<int>::max() : nums2[j];

            // Check if the partition is correct
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Perfect partition found!
                if ((m + n) % 2 == 1) { // Total length is odd
                    return static_cast<double>(std::max(maxLeft1, maxLeft2));
                } else { // Total length is even
                    return static_cast<double>(std::max(maxLeft1, maxLeft2) + std::min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                // i is too large, need to move partition in nums1 to the left
                high = i - 1;
            } else { // maxLeft2 > minRight1
                // i is too small, need to move partition in nums1 to the right
                low = i + 1;
            }
        }
        
        // This line should theoretically not be reached if inputs are valid as per constraints,
        // but some compilers might require a return statement.
        return 0.0; 
    }
};
