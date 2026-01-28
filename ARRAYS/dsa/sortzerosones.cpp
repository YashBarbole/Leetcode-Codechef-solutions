#include<iostream>
using namespace std;

void sortzerone(int arr[],int n){
    int zerocount=0;
    int onecount=0;

    for(int i=0;i<n;i++){
        //step1 counting

        if(arr[i]==0){

            zerocount++;
        }
        if(arr[i]==1){

            onecount++;
        }
    }
    //place zero first
    int i;
   for(int i=0;i<zerocount;i++){
    arr[i]=0;
   }
   for(int j=i;j<n;j++){

    arr[j]=1;
   }
}

int main(){

    int arr[]={0,1,1,1,0,0,1};
    int n =7;

    sortzerone(arr,n);

    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}
