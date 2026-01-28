#include<iostream>

using namespace std;
void printarray(int arr[],int size){

    for(int i=0;i<size;i++){

        cout<<arr[i]<<" ";

    }
    // cout<<endl;
}

//preesent=true
// absent=false

bool linearsearch(int arr[],int size,int target){
    for (int i=0;i<size;i++){

        if (arr[i]==target){
            return true;
        }
        
    }
    return false;
}
int main(){
    int arr[5]={1,2,3,4,5};
    int size=5;
   int target=4;

   bool ans=linearsearch(arr,size,target);

   if(ans==1){
    cout<<"target found"<<endl;

   }
   else{
    cout<<"not found"<<endl;
   }

    // printarray(arr,size);

}