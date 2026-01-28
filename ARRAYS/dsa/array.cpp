#include<iostream>
using namespace std;

int main(){
//     int arr[101];
//     char ch[102];
//     bool flasgs[223];


//     cout<<"array created"<<endl;
// return 0;
 
//  

// int arr[5];
// int n=5;

// for(int i=0;i<n;i++){
//     cout<<"enter value"<<i<<" ";
//     cin>>arr[i];
//     cout<<endl;

// }
// cout<<"printing array"<<endl;
// for(int i=0;i<n;i++){

//     cout<<arr[i]<<" ";
// }
// return 0;

int arr[3];

int n=3;
for(int i =0;i<n;i++){
    cin>>arr[i];
}//print input
cout<<"printing inputs"<< endl;

for(int i=0;i<n;i++){
    cout<< arr[i]<<" ";
}
cout<<endl;

//doublecout<<"doubles"<<endl;

for(int i=0;i<n;i++){
    arr[i]=2*arr[i];
}//print

cout<<"print doubles"<<endl;
for(int i=0;i<n;i++)
{
    cout<<arr[i]<<" ";
}
}

