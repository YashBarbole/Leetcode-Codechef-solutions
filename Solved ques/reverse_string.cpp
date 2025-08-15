#include<iostream>
using namespace std;
#include <bits/stdc++.h>  // includes all standard headers (GCC only)

class Solution {
public:
    void reverseString(vector<char>& s) {
        int st=0;
        int e=s.size()-1;
        while(st<e){
            swap(s[st++],s[e--]);
        }
        
    }
};

int main(){
    Solution sol;
    string input;
    cout<<"enter a string to reverse";

    getline(cin, input); 

    //string into vector char
    vector<char> vec(input.begin(), input.end());
    
    // Call the reverse function
    sol.reverseString(vec);

    // Print the reversed string
    cout << "Reversed string: ";
    for (char c : vec) {
        cout << c;
    }
    cout << endl;

    return 0;
    
    
}