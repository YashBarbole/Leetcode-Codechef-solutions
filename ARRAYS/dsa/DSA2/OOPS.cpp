#include<iostream>
using namespace std;

class Student{

    private:
    string name;
    int age;
    int height;

    public:
    int getAge(){
        return this->age;
    }
};

int main(){

    Student first;
    cout<<"all good"<<endl;

    return 0;

}