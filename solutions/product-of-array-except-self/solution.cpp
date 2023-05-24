#include <vector>
using namespace std;

// Prefix and Suffix arrays can be used to find the product of the list excluding any number.
    // Ex. nums = [1, 2, 3, 4], the prefix product array is [1, 2, 6, 24] and the suffix product
    // array is [24, 24, 12, 4]. For any num[i], the product of the list elements to the left of nums[i]
    // is prefix[i - 1], the product of the list elemenets to the right of nums[i] is suffix[i + 1].
    // Mulltiplying these together gives the product of the list nums not including nums[i].
// To minimize space to O(1), instead of storing the prefix array, it's values are stored in the
    // output array (shifted right because for any i the relevant prefix value is prefix[i - 1]).
    // The suffix array total is stored in an integer and applied directly to the output array
    // (shifted left because for any i the relevant suffix value is suffix[i + 1]).
vector<int> productExceptSelf(vector<int>& nums) { // O(n)
    vector<int> products(nums.size(), 1);
    // Calculate prefix product array, shifted right
    for (int i = 1; i < nums.size(); i++) products[i] = products[i - 1] * nums[i - 1];
    // Calculate suffix product array, shifted left, then multiply by prefix array
    int suffixProductSoFar = 1;
    for (int i = nums.size() - 2; i >= 0; i--) {
        suffixProductSoFar *= nums[i + 1];
        products[i] *= suffixProductSoFar;
    }
    return products;
}