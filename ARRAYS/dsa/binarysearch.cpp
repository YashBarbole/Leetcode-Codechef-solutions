#include <iostream>
using namespace std;

int binarysearch(int arr[], int size, int key) {
    int start = 0;
    int end = size - 1;
    int mid = start + (end - start) / 2;

    while (start <= end) {
        if (arr[mid] == key) {
            return mid;
        }

        if (key > arr[mid]) { // Corrected comparison operator
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        mid = start + (end - start) / 2;
    }
    return -1;
}

int main() {
    int even[6] = {2, 3, 4, 5, 6, 7};
    int odd[5] = {1, 2, 3, 4, 5};

    int evenindex = binarysearch(even, 6, 7);
    cout << "Index of 7 is " << evenindex << endl;
    int oddindex = binarysearch(odd, 5, 4);
    cout << "Index of 4 is " << oddindex << endl;

    return 0; // Added return statement
}
