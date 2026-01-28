#include<iostream>
using namespace std;



char getMaxOccCharacter(string s){
    int arr[26]={0};
    //craete an array of count of characters

    for (int i=0;i<s.length();i++){
        char ch=s[i];
        //lowercase
        int number=0;
        if (ch>='a'&& ch<='z'){
            int number=ch-'a';
        }

            else{
                number=ch-'A';

            }
            arr[number]++;
        }
        int maxi=-1; 
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(maxi<arr[i]){
                ans=i;
                maxi=arr[i];
            }
            maxi=max(maxi,arr[i]);
        }
        char finalAns='a'+ans;
        return finalAns;
    };











int main(){

    string s;
    cin>>s;
cout<<getMaxOccCharacter(s)<<endl;

    return 0;
};
