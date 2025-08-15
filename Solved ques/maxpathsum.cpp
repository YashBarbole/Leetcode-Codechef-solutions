#include <iostream>
#include <climits>
#include <algorithm>
using namespace std;

// Binary Tree Node Structure
struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int x) {
        val = x;
        left = right = NULL;
    }
};

class Solution {
public:
    // Recursive function to compute max path sum
    int maxPath(TreeNode* node, int& maxi) {
        if (node == NULL) return 0;

        // Recursively find max sum from left and right
        int left = max(0, maxPath(node->left, maxi));  // ignore negative paths
        int right = max(0, maxPath(node->right, maxi));

        // Current node path sum (left + right + node)
        int currPath = left + right + node->val;

        // Update global maximum if current is greater
        maxi = max(maxi, currPath);

        // Return the maximum one-side path for parent
        return node->val + max(left, right);
    }

    // Main function to call
    int maxPathSum(TreeNode* root) {
        int maxi = INT_MIN;
        maxPath(root, maxi);
        return maxi;
    }
};

int main() {
    // Create tree:
    //       -10
    //       /  \
    //      9    20
    //          /  \
    //         15   7

    TreeNode* root = new TreeNode(-10);
    root->left = new TreeNode(9);
    root->right = new TreeNode(20);
    root->right->left = new TreeNode(15);
    root->right->right = new TreeNode(7);

    Solution sol;
    int result = sol.maxPathSum(root);
    cout << "Maximum Path Sum: " << result << endl;

    return 0;
}
