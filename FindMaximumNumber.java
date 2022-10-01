package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximumNumber<E extends Comparable> {

  private E a, b, c;

  public FindMaximumNumber(E a, E b, E c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public E testMaximum(String option) {
    E max = FindMaximumNumber.testMaximum(a, b, c, option);
    return max;
  }

  public static void main(String[] args) {
    //Test case 1
    FindMaximumNumber<Integer> intIns = new FindMaximumNumber<>(10, 2, 3);
    intIns.testMaximum("desc"); 
    //Test case 2
    FindMaximumNumber<Float> floatIns = new FindMaximumNumber<>(10f, 20f, 3f);
    floatIns.testMaximum("asc");

    //Test case 3
    FindMaximumNumber<String> stringIns = new FindMaximumNumber<>("Patric", "Chase", "Ryan");
    stringIns.testMaximum("desc");

  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  public static <E extends Comparable> E testMaximum(E a, E b, E c, String option) {
    E max; 

    ArrayList<E> arrList = new ArrayList<>(); 

    arrList.add(a);
    arrList.add(b);
    arrList.add(c);

    if (a.compareTo(b) > 0) {
      if (a.compareTo(c) > 0) max = a;
      else max = c;

    } else if (b.compareTo(c) > 0) max = b;
    else max = c;

    switch (option) {
      case "asc":
        System.out.println("before sorting: " + arrList);
        Collections.sort(arrList);
        System.out.println("after sorting (asc): " + arrList);
        break;

      case "desc":
        System.out.println("before sorting: " + arrList);
        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println("after sorting (desc): " + arrList);
        break;

      default:
        System.out.println("that option doesnt exist");
    }

    printMax(arrList, max); 

    return max;
  }

  public static <E> void printMax(ArrayList<E> list, E max) {
    System.out.print("the max among [");

    for (E l : list) System.out.print(l + " ");
    
    System.out.print("] is: " + max + "\n\n");
  }

}