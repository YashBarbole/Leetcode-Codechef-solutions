//recursive code BS
#include<bits/stdc++.h>
using namespace std;

int bs(vector<int>&arr,int l,int h,int k){
    int m= (l+h)/2;
    if(l>h){
        return -1;
    }
    if(arr[m]==k){
        return m;
    }
    else if(arr[m]<k){
        bs(arr,m+1,h,k);
    }
    else{
          bs(arr,l,m-1,k);
        
    }
}

int search(vector<int>&arr, int k){
    return bs(arr,0,arr.size()-1,k);
}

int main(){
    vector<int>arr={1,23,3,4,5,6};
    int ans=search(arr,3);
    cout<<ans<<endl;
}