#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin>>T;
        while(T--){
            int N;
            cin>>N;
            vector<int >a(N);
            for(int i=0;i<N;i++){
                cin>>a[i];
            }
            
            unordered_map<int,int> freq;
            
            for(int x:a){
                freq[x]++;
            }
            
            int maxFreq=0;
            for( const auto& entry:freq){
                if(entry.second>maxFreq){
                    maxFreq=entry.second;
                }
            }
            cout<<N-maxFreq<<endl;
            
        }
        return 0;
        
        

}
