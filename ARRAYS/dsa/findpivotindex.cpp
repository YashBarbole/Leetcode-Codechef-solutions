#include <iostream>
#include <vector>

class Solution {
public:
    int pivotIndex(std::vector<int>& nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int rsum = 0;
        int lsum = 0;

        for (int i = 0; i < nums.size(); ++i) {
            lsum = sum - nums[i] - rsum;
            if (lsum == rsum) {
                return i;
            } else {
                rsum += nums[i];
            }
        }
        return -1;
    }
};

int main() {
    Solution solution;
    std::vector<int> nums = {1, 7, 3, 6, 5, 6};
    int pivot_index = solution.pivotIndex(nums);
    std::cout << "Pivot Index: " << pivot_index << std::endl;
    return 0;
}
