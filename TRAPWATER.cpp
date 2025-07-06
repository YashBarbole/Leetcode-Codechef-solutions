#include<bits/stdc++.h>  
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        int n=height.size();
        int leftmax=0;
         int rightmax=0;
          int total=0;
        int l=0;
        int r=n-1;

        while(l<r){
            if(height[l]<=height[r]){
                  if(leftmax>height[l]){
                total+=leftmax-height[l];
                 }
                    else{
                leftmax=height[l];
               
            }
             l++;
            }
          //yashdid
         
            else{
                if(rightmax>=height[r]){
                    total+=rightmax-height[r];
                }
                else{
                    rightmax=height[r];
                   
                }
                 r--;
            }


        }
        return total;
        
    }
};

int main(){
    vector<int> height={1,0,2,0,4,2};
    Solution sol;
    int res=sol.trap(height);

    cout<<"the total water trapped is"<<res<<endl;
    return 0;
    

    
}