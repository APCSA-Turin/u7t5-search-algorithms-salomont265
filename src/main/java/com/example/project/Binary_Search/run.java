package com.example.project.Binary_Search;

public class run {
    public static void main(String[] args) {
        int[] elements = {5};
        int target = 5;
        int expectedIndex = 0; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        System.out.println(actualIndex);
    }
}
