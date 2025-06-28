#include <iostream>
#include <algorithm>
using namespace std;

// Definition of a binary tree node
struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int data) {
        val = data;
        left = NULL;
        right = NULL;
    }
};

// Function to calculate maximum depth
int maxDepth(TreeNode* root) {
    if (root == NULL) return 0;

    int left = maxDepth(root->left);
    int right = maxDepth(root->right);

    return max(left, right) + 1;
}

int main() {
    // Creating the tree:
    //       1
    //      / \
    //     2   3
    //    /
    //   4

    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);

    cout << "Max depth of the binary tree: " << maxDepth(root) << endl;

    return 0;
}
