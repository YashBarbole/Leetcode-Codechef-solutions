//first  bruteforce 
//store d elemetns in temp 
//d=3 then temp=123

//ex d=3 and arrrays is 1234
//outputshoidl be 4123 here we see
// i=3 d=3 i-d=0 so 4 is on 0th index and then add temp
//shifting from 3rd index put on i-d place

 //putting 
 //n-d that is 4-3=1 index1
 // oth index from temp will go to n-dth index for sure
 //then n-dth index++
 //a[i]=temp[i-(n-d)]
 #include<iostream>
 #include<bits/stdc++.h>
 using namespace std;
 
 void leftRotate(int arr[], int n, int d) {
     d = d % n;  // Handle if d > n
 
     // Store first d elements
     int temp[d];
     for (int i = 0; i < d; i++) {
         temp[i] = arr[i];
     }
 
     // Shift the rest elements
     for (int i = d; i < n; i++) {
         arr[i - d] = arr[i];
     }
 
     // Place stored elements at the end
     for (int i = 0; i < d; i++) {
         arr[n - d + i] = temp[i];
     }
 }
 
 int main() {
     int n;
     cin >> n;
 
     int arr[n];
     for (int i = 0; i < n; i++) {
         cin >> arr[i];
     }
 
     int d;
     cin >> d;
 
     leftRotate(arr, n, d);
 
     for (int i = 0; i < n; i++) {
         cout << arr[i] << " ";
     }
     cout << endl;
 
     return 0;
 }
// best soln is below

 //O(1)
 // optimal soln
 // first d reverser
 // next n-d revese
 //final reverse all
 // soln we get
 

