#include<iostream>
using namespace std;
int main() 
{
    int n;
    cout<<"enter the no of rows"<<endl;
    cin>>n;

    int i=1;

    while (i<=n)
    {
        int j=1;
        int r=i;

        while (j<=i)
        {
            cout<<r;
            r++;
            j++;
        }
        cout<<endl;
        i++;
    }
}