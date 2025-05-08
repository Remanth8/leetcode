#include <stdlib.h>

int** res;
int* colSizes;
int resSize;

void dfs(int* a, int n, int t, int* temp, int len, int start) {
    if (t == 0) {
        res[resSize] = malloc(len * sizeof(int));
        for (int i = 0; i < len; i++)
            res[resSize][i] = temp[i];
        colSizes[resSize++] = len;
        return;
    }
    for (int i = start; i < n; i++) {
        if (a[i] <= t) {
            temp[len] = a[i];
            dfs(a, n, t - a[i], temp, len + 1, i);  // allow reuse
        }
    }
}

int** combinationSum(int* candidates, int candidatesSize, int target, int* returnSize, int** returnColumnSizes) {
    res = malloc(1000 * sizeof(int*));
    colSizes = malloc(1000 * sizeof(int));
    int temp[1000];
    resSize = 0;
    dfs(candidates, candidatesSize, target, temp, 0, 0);
    *returnSize = resSize;
    *returnColumnSizes = colSizes;
    return res;
}
