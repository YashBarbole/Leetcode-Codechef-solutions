//start and check with previous element
#include <bits/stdc++.h>
using namespace std;
 int isSorted(int n, vector<int> a){
    for (int i=1;i<n;i++){
        if(a[i]>=a[i-1]){
        }
        else{
            return false;
        }
    }
    return true;
 }

 int  main(){
    int n;
    cout<<"enter elements";
    cin>>n;

    vector<int> a(n);
    cout<<"elements of array";

    for(int i=0;i<n;i++){
        cin>>a[i];
    }

    if(isSorted(n,a)){
        cout<<"ok done"<<endl;

    }
    else {
        cout<<"notok"<<endl;
    }
    return 0;
 }