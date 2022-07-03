package Searching;

class FirstAndLastPositions{

    /***
     * Method for finding first  position of an element.
     * @param arr
     * @param target
     * @return
     */
    public static int firstPosition(int[] arr, int target){
        //Edge Case
        if(arr.length==0) return -1;

        int i=0, j=arr.length-1;
        int mid=0, pos=-1;

        while(i<=j){
            mid=i+(j-i)/2;

            if(arr[mid]>target){
                j=mid-1;
            }

            else if(arr[mid]<target){
                i=mid+1;
            }

            else{
                pos=mid;
                j=mid-1;
            }
        }
        return pos;
    }

    /**
     * Method for finding last position of an element.
     * @param arr
     * @param target
     * @return
     */

    public static int lastPosition(int[] arr, int target){
        //Edge Case
        if(arr.length==0) return -1;

        int i=0, j=arr.length-1;
        int mid=0, pos=-1;

        while(i<=j){
            mid=i+(j-i)/2;

            if(arr[mid]>target){
                j=mid-1;
            }

            else if(arr[mid]<target){
                i=mid+1;
            }

            else{
                pos=mid;
                i=mid+1;
            }
        }
        return pos;
    }

    public int[] firstAndLastPositions(int[] arr, int target){
        return new int[] {firstPosition(arr, target), lastPosition(arr, target)};
    }
}
