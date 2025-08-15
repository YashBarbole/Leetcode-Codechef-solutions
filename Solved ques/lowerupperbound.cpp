#include<bits/stdc++.h>
using namespace std;

int lowerb(vector<int>a , int n, int x){
    int l=0,h=n-1;
    int ans=n;
    while(l<=h){
        int m=(l+h)/2;
        if(a[m]>=x){
            ans=m;
            h=m-1;
        }
            else{
                l=m+1;
                
            }
    }
    return ans;
}
 

int main(){
    vector<int> a={2,3,4,5,6,1,2,34,5,6};
    int n=a.size();
    int sol=lowerb(a,n,6);
    cout<<sol<<endl;
}