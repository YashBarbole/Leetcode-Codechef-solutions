// count zeros and ones
#include<iostream>
using namespace std;

void countzeroone(int arr[],int size){
    int zerocount=0;
    int onecount=0;

    for (int i=0;i<size;i++){

        if(arr[i]==0){

            zerocount++;

        }
        if(arr[i]==1){
            onecount++;
        }
    }
    cout<<"zerocount:"<< zerocount<<endl;
     cout<<"onecount:"<< onecount<<endl;
}

int main(){

    int arr[]={0,0,0,1,0,0,1,1,1,0};
//     zeros=6 ones=4

int size=10;

countzeroone(arr,size);

}

