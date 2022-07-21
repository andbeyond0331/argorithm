package main.java.study.libre.forBlogPractice;


public class for4datatypeBinarySearch {

    public static void main(String[] args) {

        int[] array = { 1, 3, 4, 7, 8, 13, 17};
        int number = 8;

        System.out.println(binarySearch(array, number));
    }

    public static int binarySearch(int[] array, int target){

        int start = 0;
        int end = array.length-1;
        int mid = (start+end)/2;
        while(array[mid]!=target){
            if(target>array[mid]){
                start = mid+1;

            }else{
                end = mid-1;

            }
            mid = (start+end)/2;
        }


        return mid;
    }

}
