#include<iostream>
using namespace std;


void printarray(int arr[],int n){

    for (int i=0;i<n;i++){
        cout<<arr[i] <<" ";

    }cout<<endl;
}

void swapaleternate(int arr[],int size){

    for (int i=0;i<size;i+=2){
        if(i+1<size){

            swap(arr[i],arr[i+1]);
        }
    }
}

int main(){

    int even [8]={1,2,3,4,5,6,7,8};
    int odd[5]={11,12,13,14,15};

    swapaleternate(even,8);
    printarray(even,8);







    return 0;
}

