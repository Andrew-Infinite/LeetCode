class Solution {
public:
    void swap(int* a, int* b)
    {
        int t = *a;
        *a = *b;
        *b = t;
    }
    void quickSort(vector<int>&arr, int low, int high)
    {
        if (low < high) {
            /* pi is partitioning index, arr[p] is now
            at right place */
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    int partition(vector<int>& nums, int low, int high)
    {
        int pivot = nums[high]; // pivot
        int i
            = (low
               - 1); // Index of smaller element and indicates
                     // the right position of pivot found so far

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (nums[j] < pivot) {
                i++; // increment index of smaller element
                swap(&nums[i], &nums[j]);
            }
        }
        swap(&nums[i + 1], &nums[high]);
        return (i + 1);
    }
    vector<int> sortArray(vector<int>& nums) {
        quickSort(nums,0,nums.size()-1);
        return nums;
    }
};