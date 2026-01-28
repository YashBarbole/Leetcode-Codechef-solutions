// first in caseof left rotate by 1 place we just need to put the firs telemtn to last
//store first in temp and iterate from 1 to till n-1 then arr i-1=arri
//tc O(n) O(1) extra space is O(1)


#include <bits/stdc++.h>
using namespace std;

vector<int> rotatearray(vector<int>& arr, int n) {
    int temp = arr[0];
    for (int i = 1; i < n; i++) {
        arr[i - 1] = arr[i];
    }
    arr[n - 1] = temp;
    return arr;
}

int main() {
    int n;
    cout << "Enter the size of the array: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter the array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    arr = rotatearray(arr, n);

    cout << "Array after rotating left by 1: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
