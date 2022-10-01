package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximum<E extends Comparable> {
	  private E a, b, c;

	  public FindMaximum(E a, E b, E c) {
	    this.a = a;
	    this.b = b;
	    this.c = c;
	  }
	  public E testMaximum(String option) {
	    E max = FindMaximum.testMaximum(a, b, c, option);
	    return max;
	  }
	  public static void main(String[] args) {
		  FindMaximum<Integer> intIns = new FindMaximum<>(10, 2, 3);
	    intIns.testMaximum("Decending"); 
	    FindMaximum<Float> floatIns = new FindMaximum<>(100.50f, 300.67f, 500.32f);
	    floatIns.testMaximum("Assending");
	    FindMaximum<String> stringIns = new FindMaximum<>("Apple", "Peach", "Banana");
	    stringIns.testMaximum("Decending");	    
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
	      case "Assending":
	        System.out.println("before sorting: " + arrList);
	        Collections.sort(arrList);
	        System.out.println("after sorting (Assending): " + arrList);
	        break;

	      case "Decending":
	        System.out.println("before sorting: " + arrList);
	        Collections.sort(arrList, Collections.reverseOrder());
	        System.out.println("after sorting (Decending): " + arrList);
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
	    
	    System.out.print(" is: " + max + "\n\n");
	  }
	}
		