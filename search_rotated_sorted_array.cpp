#include<iostream>
using namespace std;
#include <bits/stdc++.h> 

class Solution {
public:
    int search(vector<int>& arr, int k) {
        int low = 0, high = arr.size() - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == k) return mid;
            
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < k && k <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
};

int main() {
    Solution sol;
    int n, k;

    cout << "Enter the array size: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter the array elements (rotated sorted): ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Enter the value to search: ";
    cin >> k;

    int result = sol.search(arr, k);

    if (result != -1) {
        cout << " Element found at index: " << result << endl;
    } else {
        cout << " Element not found." << endl;
    }

    return 0;
}

