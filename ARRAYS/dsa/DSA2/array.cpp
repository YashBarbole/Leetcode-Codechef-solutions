#include <iostream>
using namespace std;

void printArray(int arr[], int size){
        cout<<"print the array"<<endl;
        for(int i=0;i<size;i++){
            cout<<arr[i]<<"";
        }
        cout<<endl<<"done"<<endl;
}
int main(){
    int arr[15]={2,7};
    
    printArray(arr,15);

}




