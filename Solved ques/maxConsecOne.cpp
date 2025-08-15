using namespace std;
#include<bits/stdc++.h>  
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int cnt =0;
        int maxi=0;

        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                cnt++;
                maxi=max(maxi,cnt);
            }
            else{
                cnt=0;
            }

        }
        return maxi;
        
    }
};
int main(){
    Solution sol;
    vector<int>nums={1,1,1,0,0,1,1,1,1};
    int res=sol.findMaxConsecutiveOnes(nums);

    cout<<"max ones are"<< res<<endl;

}