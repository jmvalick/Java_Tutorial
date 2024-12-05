package org.example;

import java.util.*;

public class ArrayDemo {
    public static void main(String a[]){

        // list
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);

        System.out.println(nums.indexOf(2));
        System.out.println(nums.get(2));
        System.out.println("\n");

         for(Object n:nums){
             int num = (Integer)n;
             System.out.println(num);
         }
        System.out.println("\n");

        // set
        Set<Integer> nums2 = new HashSet<Integer>();  // TreeSet sorts, HashSet unique values
        nums2.add(6);
        nums2.add(5);
        nums2.add(8);
        nums2.add(2);
        nums2.add(6);

        for(int n:nums2){
            System.out.println(n);
        }
        System.out.println("\n");

        Iterator<Integer> values = nums2.iterator();
        while (values.hasNext())
            System.out.println(values.next());
        System.out.println("\n");

        // hash map
        Map<String, Integer> students = new HashMap<>();

        students.put("Ben", 23);
        students.put("John", 56);
        students.put("Joe", 76);
        students.put("Frank", 22);
        students.put("Ben", 32); // replaces existing Ben value
        System.out.println("\n");

        System.out.println(students);
        System.out.println(students.get("Ben"));
        System.out.println("\n");

        System.out.println(students.keySet());
        for(String key: students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
        System.out.println("\n");


        // Comparator
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums, com);

        System.out.println(nums);


    }
}
