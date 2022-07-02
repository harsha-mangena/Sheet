package Searching;

public class SearchingAlgorithms {

    /***
     * Linear search algorithm -> O(N)
     * @param array
     * @param key
     * @return
     */
    
    public boolean linearSearchInArray(int[] array, int key){
        //Edge Case
        if(array.length == 0) return false;

        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return true;
            }
        }

        return false;
    }

    /**
     * Binary Search Algorithm - O(log2(N))
     * @param array
     * @param key
     * @return
     */
    public boolean binarySearchInArray(int[] array, int key){
        //Edge Case
        if(array.length == 0) return false;

        int i=0, j=array.length-1;
        int mid=0;

        while(i <= j){
            mid = (i+j)/2;
            if(array[mid]==key){
                return true;
            }

            else if(array[mid]>key){
                j=mid-1;
            }

            else if(array[mid]<key){
                i=mid+1;
            }
        }

        return false;
    }

    /**
     * Jump Search Algorithm -> O(N**0.5)
     * @param array
     * @param key
     * @return
     */

    public boolean jumpSearchInArray(int[] array, int key){
        //Edge Case
        if(array.length==0) return false;

        int jumpSize = (int) Math.sqrt(array.length);
        int start = 0;
        int end = jumpSize;
        int size = array.length;

        while((end<size) && (array[end]<=key)){
            start=end;
            end += jumpSize;

            if(end > size-1){
                end = size; 
            }
        }

        for(int i=start; i<end; i++){
            if(array[i]==key){
                return true;
            }
        }
        return false;
    }

    /**
     * Ternary Search Algorithm -> O(log(3) N)
     * @param array
     * @param key
     * @return
     */

    public int ternarySearchInArray(int[] array, int key){
        //Edge Case
        if(array.length==0) return -1;

        int l=0, r=array.length-1;
        int mid1=0, mid2=0;

        while(r >= l){
            mid1 = l+(r-l)/3;
            mid2 = r-(r-l)/3;

            if(array[mid1]==key) return mid1;

            if(array[mid2]==key) return mid2;

            //Checking in between ranges.
            if(array[mid1] > key){
                r=mid1-1;
            }

            else if(array[mid2] < key){
                l=mid2+1;
            }

            else{
                l=mid1+1;
                r=mid2-1;
            }
        }
        return -1;
    }

    /**
     * Interpolation Search Algorithm -> O(log(log(N)))
     * @param array
     * @param key
     * @return 
     * Formuale : pos = lo + (x - arr[lo]) *(hi - lo)/(arr[hi] - arr[lo])
     */

    public int interpolationSearchInArray(int[] array, int key){
        //Edge case
        if(array.length==0) return -1;

        int l=0, r=array.length-1;
        int pos=0;

        while(r >= l){
            pos = l + (((r - l) / (array[r] - array[l]))
                  * (key - array[l]));

            if(array[pos]==key) return pos;

            else if(array[pos] > key){
                r=pos-1;
            }

            else{
                l=pos+1;
            }
        }
        
        return -1;
    }
}
