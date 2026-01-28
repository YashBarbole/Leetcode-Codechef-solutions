#include <iostream>
#include <vector>
using namespace std;

// Function to find the pivot index in the rotated sorted array
int findPivotIndex(vector<int>& arr) {
    int n = arr.size();
    int s = 0;
    int e = n - 1;
    int mid = s + (e - s) / 2;

    while (s <= e) {
        // Corner case for single element
        if (s == e) {
            return s;
        }

        // Check if mid is the pivot
        if (mid + 1 < n && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid - 1 >= 0 && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        // Adjust search space
        if (arr[s] > arr[mid]) {
            e = mid - 1;
        } else {
            s = mid + 1;
        }

        mid = s + (e - s) / 2;
    }
    return -1;
}

// Binary search function
int binarySearch(vector<int>& arr, int s, int e, int target) {
    int mid = s + (e - s) / 2;
    while (s <= e) {
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            s = mid + 1;
        } else {
            e = mid - 1;
        }
        mid = s + (e - s) / 2;
    }
    return -1;
}

// Main search function
int search(vector<int>& nums, int target) {
    int pivotIndex = findPivotIndex(nums);
    cout << "Pivot Index is: " << pivotIndex << endl;
    int n = nums.size();
    int ans = -1;

    // Search in the appropriate half
    if (target >= nums[0] && target <= nums[pivotIndex]) {
        ans = binarySearch(nums, 0, pivotIndex, target);
    } else {
        ans = binarySearch(nums, pivotIndex + 1, n - 1, target);
    }
    return ans;
}

int main() {
    vector<int> nums = {12, 14, 16, 2, 4, 6, 8, 10};
    int target = 6;

    int result = search(nums, target);
    if (result != -1) {
        cout << "Element found at index: " << result << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}
