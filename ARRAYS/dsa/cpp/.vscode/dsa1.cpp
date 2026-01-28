 #include<iostream>
 using namespace std;

 int main(){
    char ch='1';
    int num=1;
    


    cout<<endl;


    switch ( ch)
    {
    case 1: cout<<"first"<<endl;
                break;
    case '1': switch (num)
    { case 1: cout<<"value of num is"<<num<<endl;
    break;
    
    }

                break;
    default: cout<<"it is default"<<endl;// if not matches then deafult


   
    }
    return 0;

 }