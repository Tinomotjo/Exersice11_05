package Exersice11_5;
import java.util.*;
/*
 Write a method called sortAndRemoveDuplicates that accepts a list of integers
 as its parameter and rearranges the list’s elements into sorted ascending order,
 as well as removing all duplicate values from the list. For example, the list
 [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become [–9, –5, 4, 7, 8, 11, 15, 27, 32]
 after a call to your method. Use a Set as part of your solution.
 */
public class Run
{
    public static void main(String[] args)
    {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(7);
        list1.add(4);
        list1.add(-9);
        list1.add(4);
        list1.add(15);
        list1.add(8);
        list1.add(27);
        list1.add(7);
        list1.add(11);
        list1.add(-5);
        list1.add(32);
        list1.add(-9);
        list1.add(-9);

        System.out.println(sortAndRemoveDuplicates(list1));

    }


    public static Set<Integer> sortAndRemoveDuplicates(LinkedList<Integer> list )
    {
        Set<Integer> list2 = new TreeSet<Integer>();
        list2.addAll(list);
        return list2;
       
    }





}

