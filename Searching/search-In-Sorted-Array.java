package Searching;

class SearchInARotatedArray {


    public int searchUsingLinerSearch(int[] array, int target){
        //Edge Case
        if(array.length==0) return -1;

        for(int i=0; i<array.length; i++){
            if(array[i]==target) return i;
        }

        return -1;
    }

    /**
     * Intution:
     * Points to be remembered "ARRAY IS SORTED", just carefully play with in ranges.
     * Low will be at 0, High will be at arr.length-1;
     * When we calculate the mid(mid=low+high /2), we can observe that either side of  array is sorted.
     * Then we can check if leftside of array is sorted (arr[low] < arr[mid]).
     *     -> In that if we can find that out target lies in arr[low] to arra[mid], then we will slide to left for finding that element.
     *     -> Else we can shift the low to mid+1(I.e to another side of array)
     * Similarly check if that out target lies in arr[mid] to arr[high], then we will slide to right for finding that element.
     *      -> Else we can shift the high to mid-1(I.e to another side of array)
     */

    /***
     * Efficient Solution -> O(log2(N)) using Binary search algorithm
     * @param array
     * @param target
     * @return
     */
    public int searchInSortedRotatedArray1(int[] array, int target){
        //Edge Case
        if(array.length==0) return -1;

        int low=0, high=array.length-1;
        int mid=0;

        while(low <= high){
            mid=(low+high)/2;

            //If element found at mid, then return.
            if(array[mid]==target) return mid;

            //Left Side
            if(array[low] <= array[mid]){
                if(array[low] <= target && target < array[mid]){
                    //Slide Left
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            //Right Side
            else{
                if(array[mid] < target && target <= array[high]){
                    //Slide to Right
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public int searchInSortedRotatedArrayWithDuplicates(int[] array, int target){
        //Edge Case
        if(array.length==0) return -1;
        
        int low=0, high=array.length-1;
        int mid=0;

        while(low <= high){

            //Skipping Duplicates

            while(low<high && array[low] == array[low+1]){
                ++low;
            }

            while(low<high && array[high]== array[high-1]){
                --high;
            }


            mid=(low+high)/2;

            //If element found at mid, then return.
            if(array[mid]==target) return mid;

                //Left Side
                if(array[low] <= array[mid]){
                    if(array[low] <= target && target < array[mid]){
                        //Slide Left
                        high = mid-1;
                    }
                    else{
                        low = mid+1;
                    }
                }

                //Right Side
                else{
                    if(array[mid] < target && target <= array[high]){
                        //Slide to Right
                        low = mid+1;
                    }
                    else{
                        high = mid-1;
                    }
                }
            }
        return -1;

    }
}
