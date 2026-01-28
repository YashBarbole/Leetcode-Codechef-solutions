//bruteforce: sorting and arr[n-2]
//but what if the  largest and second largest are same so check both and check if samethen compare with the 3rd last element
// worst case- { 1,7,7,7,7,7,7,7} trverse the whole array is worst and tc-O(N)
// NlogN+N is total tc for bruteforce 


// better soln= first pass and find largest element 
//keep second largest as -1 and keep comparing and compare like big than all but small than the largest
//TC-O(n) + O(n) runs for 2 passes  TC==== O(2N)


// OPTIMAL APPROACH 
// largest = arr[0] sec largest= -1 assume doesnt have negative number if contains then take INT_MIN
// traverse array  when the next is largest then the previous is small ofcourse do update both if equal dont do anything
// now see yash, if element is largest keep in largest then conitnue and if elemnet is not largest then check with second and keep i n second largest 

#include <iostream>
#include <vector>
#include <climits>
using namespace std;

vector<int> getSecondOrderElements(const vector<int>& arr) {
    if (arr.size() < 2) {
        return {-1, -1}; // Invalid case
    }
    
    int largest = arr[0];
    int secondLargest = INT_MIN;
    int smallest = arr[0];
    int secondSmallest = INT_MAX;
    
    // Single pass to find both second largest and second smallest
    for (int i = 1; i < arr.size(); i++) {
        // Update largest and second largest
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } 
        else if (arr[i] < largest && arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
        
        // Update smallest and second smallest
        if (arr[i] < smallest) {
            secondSmallest = smallest;
            smallest = arr[i];
        }
        else if (arr[i] > smallest && arr[i] < secondSmallest) {
            secondSmallest = arr[i];
        }
    }
    
    return {secondLargest, secondSmallest};
}

int main() {
    int n;
    cout << "Enter the size of the array: ";
    cin >> n;

    if (n < 2) {
        cout << "Array must have at least two elements to find second largest and second smallest!" << endl;
        return 0;
    }

    vector<int> arr(n);
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    vector<int> result = getSecondOrderElements(arr);

    if (result[0] == -1) {
        cout << "Invalid array size!" << endl;
        return 0;
    }

    cout << "Second Largest Element: " << result[0] << endl;
    cout << "Second Smallest Element: " << result[1] << endl;

    return 0;
}
