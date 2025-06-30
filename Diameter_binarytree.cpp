#include <iostream>
#include <algorithm>
using namespace std;

// TreeNode structure
struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int x) {
        val = x;
        left = NULL;
        right = NULL;
    }
};

class Solution {
public:
    int maxDiameter = 0;

    int getHeight(TreeNode* root) {
        if (root == NULL) return 0;

        int leftHt = getHeight(root->left);
        int rightHt = getHeight(root->right);

        maxDiameter = max(maxDiameter, leftHt + rightHt);

        return max(leftHt, rightHt) + 1;
    }

    int diameterOfBinaryTree(TreeNode* root) {
        getHeight(root);
        return maxDiameter;
    }
};

int main() {
    // Manually creating the tree:
    //       1
    //      / \
    //     2   3
    //    / \
    //   4   5

    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);

    Solution obj;
    int result = obj.diameterOfBinaryTree(root);

    cout << "Diameter of the Binary Tree: " << result << endl;

    return 0;
}
