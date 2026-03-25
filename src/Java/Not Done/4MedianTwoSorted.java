//two pointers, partially done, issues with small arrays and deciding which pointer is correct

class MedianTwoSorted {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        double middle = nums1.length + nums2.length;

        int results = 1;

        if(middle % 1 != 0){
            results = 2;
        }

        int pointer1 = 0;
        int pointer2 = 0;
        double returnValue = 0;

        for(int i = 2; i < middle; i++){
            if(nums1[pointer1] > nums2[pointer2]){
                pointer2++;
            }
            else if(nums2[pointer2] > nums1[pointer1]){
                pointer1++;
            }
            else{
                pointer1++;//might need more complex logic here
            }
        }
        

        return 0.0;
    }


}
