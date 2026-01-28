#include<iostream>
#include<vector>
using namespace std;

// Pivot function
int getPivot(int arr[], int n) {
    int s = 0;
    int e = n - 1;
    int mid = s + (e - s) / 2;

    while (s < e) {
        if (arr[mid] >= arr[0]) {
            s = mid + 1;
        } else {
            e = mid;
        }
        mid = s + (e - s) / 2;
    }
    return s;
}

// Binary Search function
int binarySearch(int arr[], int s, int e, int target) {
    int start = s;
    int end = e;
    int mid = start + (end - start) / 2;

    while (start <= end) {
        int element = arr[mid];

        if (element == target) {
            return mid;
        } else if (target < element) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        mid = start + (end - start) / 2;
    }
    return -1;
}

// Main function to find position of target in a rotated sorted array
int findPosition(vector<int>& arr, int n, int k) {
    int pivot = getPivot(arr.data(), n);

    // If the target lies between pivot and end, apply binary search on that part
    if (k >= arr[pivot] && k <= arr[n - 1]) {
        return binarySearch(arr.data(), pivot, n - 1, k);
    } else {
        // Otherwise, apply binary search on the first part
        return binarySearch(arr.data(), 0, pivot - 1, k);
    }
}

// Example usage
int main() {
    vector<int> arr = {7, 8, 1, 2, 3, 4, 5, 6};
    int n = arr.size();
    int target = 4;
    
    int position = findPosition(arr, n, target);
    
    if (position != -1) {
        cout << "Target found at index: " << position << endl;
    } else {
        cout << "Target not found." << endl;
    }

    return 0;
}
