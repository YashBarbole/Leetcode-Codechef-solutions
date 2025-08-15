#include<bits/stdc++.h>
using namespace std;

void sort012(vector<int>&arr,int n){
    int L=0,M=0,H=n-1;

    while(M<=H){
        if(arr[M]==0){
            swap(arr[L],arr[M]);
            L++;
            M++;

        }
        else if(arr[M]==1){
                M++;
            
        }
        else{
            swap(arr[M],arr[H]);
            H--;

        }
     
    }
}

int main(){
    vector<int> arr={0,1,2,0,1,2,0,1,2};
    int n=arr.size();
    sort012(arr,n);

    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    

}