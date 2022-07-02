package Searching;

public class SearchingAlgorithms {

    /***
     * Linear search algorithm
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
     * Binary Search Algorithm
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
     * Jump Search Algorithm
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

}
