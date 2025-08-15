#include<bits/stdc++.h>
using namespace std;

long long maxSubArray(vector <int> & arr,int n){
    long long sum=0,maxi=LONG_MIN;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum>maxi) maxi=sum;
        if(sum<0) sum=0;
        

    }
    return maxi;
}

int main(){
    vector<int> arr={1,2,-3,4,5,6};
    int n=arr.size();
    long long ans=maxSubArray(arr,n);
    cout<<ans<<endl;

}