#include <stdbool.h>

// Helper function to check symmetry
bool isMirror(struct TreeNode* left, struct TreeNode* right) {
    if (left == NULL && right == NULL) return true;
    if (left == NULL || right == NULL) return false;
    if (left->val != right->val) return false;
    
    return isMirror(left->left, right->right) && isMirror(left->right, right->left);
}

// Main function to check if the tree is symmetric
bool isSymmetric(struct TreeNode* root) {
    if (root == NULL) return true;
    return isMirror(root->left, root->right);
}