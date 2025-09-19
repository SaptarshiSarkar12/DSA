package arrays.search_algorithms.binary_search.questions;

/**
 * Question 8: Search in Rotated array
 * <p>
 *     <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/description/">Question</a>
 * </p>
 */
public class SearchInRotated {
    public static void main(String[] args) {
        /*
        Rotated array means some elements in sequential order are put after the last element of the array.
        Approach 1:
            1. Find the pivot in the array: Pivot is from where the next numbers are in asc.
             It means that pivot is also the largest number in the array. So, arr = [...asc.."Pivot"...asc...]
            2. Search in first half => simple BS(o, pivot)
            3. If not found, search in second half => BS(pivot+1, end)

            Case1: (mid > mid+1) => mid is pivot
            Case2: (mid < mid-1) => mid-1 is pivot
            Case3: (s >= mid) => the entire right part of mid will be smaller than the start element. In this case, all
                                elements from mid will be smaller than start. Hence, we can ignore all these elements
                                as we're looking for peak i.e. largest element. So, "end = mid - 1".
            Case4: (s < mid) => "s = mid + 1" as if mid was pivot, it would have been returned in case 1/2. Hence, proved
                                that bigger numbers lie ahead. So, ignore mid.
         */
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
//        System.out.println(findPivotWithDuplicates(arr));
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        // if you didn't find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        
        // if pivot is found, you have found 2 asc sorted arrays.
        // Case1: pivot == target => answer
        // Case2: target > start => search space = (s, pivot-1) as 2nd half of the array contains elements less than start
        // Case3: target < start => We know that all elements from (s, pivot) are greater than target. So, search space = (pivot+1, end)
        if (target == nums[pivot]) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    public int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // this will not work for duplicate values
    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at middle, start and end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot?
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
