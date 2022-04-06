package com.company;

import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {

//        int[] numbers = {4, 2, 8, 5, 3, 9};
//
////        for (int i = 0; i < numbers.length; i++) { // bubble sort - sorts numbers by comparing numbers
////            for (int j = 0; j < numbers.length-1; j++) {
////                // create a  temporary variable to hold the current value
////                // at index j
////
////                if (numbers[j]> numbers[j+1]){
////                    int temp = numbers[j];
////
////                    // swap the numbers with each other
////                    numbers[j] = numbers[j+1];
////                    numbers[j+1] = temp;
////                }
////            }
////        }
////        System.out.println(Arrays.toString(numbers));
//        // BUBBLE SORT
//        // has two loops
//        // Time complexity for bubble sort is: 0(n^2);
//
//
//        // INSERTATION SORT - sorts numbers by comparing the values at the indexes with the previous elements
//        // to sort the elements.
//        // We place the value at the index at the index where there are no lesser values than that element.
//
////        for (int i = 1; i < numbers.length; i++) {
////            int valueToSort = numbers[i];
////            int j;
////            // The loop below is to store the numbers at the point where there are no
////            // less numbers than that value
////
////            for (int j = i; j > 0 && numbers[j-1] > valueToSort; j--) {
////                numbers[j] = numbers[j-1];
////            }
////            numbers[j] = valueToSort;
////        }
////
////        System.out.println(Arrays.toString(numbers));
//
//
////        SELECTION SORT
//        //Find the minimum element and swap that minimum element with the current element
//        // repeat the whole process un till the array is fully sorted
//
////        for (int i = 0; i < numbers.length; i++) {
////            int index = i; // current index of the number
////            for (int j = i + 1; j<numbers.length; j++) {
////                if (numbers[j] < numbers[index]){
////                    index = j; // swap if number at position j is less than the number at position index
////                }
////            }
////                  int smallerNumber = numbers[index];
////            numbers[index] = numbers[i];
////            numbers[i] = smallerNumber;
////
////        }
////        System.out.println(Arrays.toString(numbers));
//
//
//        // MERGE SORT
//        // Divide the array into subarrays of about half size in each iteration/repetition
//        // until each subarray has only one element
//        // merge each subarray repeatedly to create sorted arrays. This is going to repeat itself
//        // until we have only one sorted array. This is the sorted array.
//
//        int[]values = {3, 8, 3, 5, 9};
//        mergeSort(0, values.length);
//
//    }
//
//
//    public static void mergeSort(int start, int end, int[] numbers) {
//
//        int mid = (start + end) / 2;
//        if (start < end) {
//            // sort the left half
//            mergeSort(start, mid, numbers);
//            // sort the right half
//            mergeSort(mid + 1, end, numbers);
//            // merge
//            merge(start, mid, end, numbers);
//        }
//
//    }
//
//    public static void merge(int start, int mid, int end, int[] numbers) {
//        // initializing a temp array and index
//        int[] tempArray = new int[numbers.length];
//
//        int tempArrayIndex = start; // temporary index
//
//        // initialize tha start indwx and mid index to be used as counters
//        int startIndex = start;
//        int midIndex = mid + 1;
//
//        // iterate until the smaller array reaches the end
//
//        while (startIndex <= mid && midIndex <= end) {
//            if (numbers[startIndex] < numbers[midIndex]) {
//                // The ++ increases the value of the index by one
//                // and is being used to keep the while loop from giving us an infinite loop
//                tempArray[tempArrayIndex++] = numbers[startIndex++];
//            } else {
//                tempArray[tempArrayIndex++] = numbers[midIndex++];
//            }
//        }
//
//        // copy the remaining elements into the array
//
//        while (startIndex <= mid) {
//            tempArray[tempArrayIndex++] = numbers[startIndex++];
//
//        }
//        while (startIndex <= end) {
//            tempArray[tempArrayIndex++] = numbers[midIndex++];
//        }
//
//        // copy the value of our temporary array into the actual after we are done sorting it
//
//        if (end + 1 - start >= 0) {
//            // java method that can be used to copy an array
//            System.arraycopy(tempArray, start, numbers, start, end + 1 - start);
//        }
//
//

    }
}

