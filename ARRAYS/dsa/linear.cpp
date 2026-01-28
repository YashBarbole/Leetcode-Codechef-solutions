#include<iostream>
using namespace std;

int main(){


int arr[5]={2,3,6,8,10};
int target =110;

int n=5;
bool flag=0;


for (int i=0;i<n;i++){
    if(arr[i]==target){

      
        flag=1;
        break;
    }

}
if(flag==1){
    cout<<"target found"<<endl;

}
else{
    cout<<"not found"<<endl;
}
return 0;
    
}