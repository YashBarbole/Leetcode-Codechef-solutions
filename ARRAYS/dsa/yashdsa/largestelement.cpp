
//brute force for largest element
//sorting  Tc-o(nlogn)
//sc-O(1)

//optimal soln
//using largest variable compare each element here TC-O(N)

#include <bits/stdc++.h>
using namespace std;
int largestElement(vector<int> &arr, int n){
    int largest =arr[0];
    for (int i=0;i<n;i++){
        if(arr[i]>arr[0])
        {
            largest=arr[i];
        }
    }
    return largest;

}

int main(){
    // vector  <int> arr={3,1,4,1,5,9};
    // int n=arr.size();

    // int largest=largestElement(arr,n);
    // cout<<"element is :"<<largest<<endl;
    // return 0;

    //user inputs
     int n;
    cout << "Enter the size of the array: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int largest = largestElement(arr, n);
    cout << "The largest element is: " << largest << endl;

    return 0;

}

