#include<iostream>

using namespace std;

void printarray(int arr[][4],int row,int col){
    for(int i=0;i<row;i++){

        for (int j=0;j<col;j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}

int main(){
// create a 2d array
    //int arr[3][3];
   

    //intialize

    int arr[3][4]={

        {1,2,3,4},
        {5,6,7,8},
        {9,10,1,11}
    };

    int row=3;
    int col=4;

    printarray(arr,row,col);

        

   

//     int brr[]={1,2,3,4};
// //give atleast column because we use it in formula
//     int crr[][4]={
//          {1,2,3,4},
//         {5,6,7,8},
//         {9,10,1,11}

//     };


    return 0;

    
    
    
       
    
    
    }

