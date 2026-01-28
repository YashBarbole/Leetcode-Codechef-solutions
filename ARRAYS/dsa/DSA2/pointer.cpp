#include<iostream>
using namespace std;

int main(){
   int arr[10]={2,4,5};

   cout<<"address of first memory blcock is"<<&arr[0]<<endl;
   cout<<"address of first memory blcock is"<<arr<<endl;

   cout<<arr[0]<<endl;

   cout<<"4th :"<<*arr<<endl;
   cout<<"5th :"<<*arr+1<<endl;
   cout<<"6th :"<<*(arr+1)<<endl;
   


}
