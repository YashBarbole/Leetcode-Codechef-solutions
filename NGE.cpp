#include<bits/stdc++.h>  
using namespace std;


class Solution {
    public:

vector<int>NGE( vector<int> arr){
    int n=arr.size();
  vector<int> nge(n) ;
  stack<int>s;
  for(int i=n-1;i>=0;i--){
    while(!s.empty()&&s.top()<=arr[i]){
        s.pop();
    }
    if(s.empty()){
        nge[i] = -1;
    }
    else{
        nge[i]=s.top();
    }

    s.push(arr[i]);
  }
return nge;
}

};

int main() {
  vector<int> arr = {4, 5, 2, 10, 8};
  

    Solution obj;
    vector<int> res = obj.NGE(arr);

    for (int x : res) {
        cout << x << " ";
    }

    return 0;
}

