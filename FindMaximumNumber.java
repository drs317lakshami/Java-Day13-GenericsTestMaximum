package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximumNumber {

	  public static void main(String[] args) {

		  FindMaximumNumber maxNum = new FindMaximumNumber();

	    //Test case 1:
	    System.out.println(" Test case 1 max number= " + maxNum.findMax(10, 2, 3));

	    //Test case 1: 
	    System.out.println(" Test case 2 max number=  " + maxNum.findMax(10, 20, 3));

	    //Test case 1: 
	    System.out.println(" Test case 3 max number=  " + maxNum.findMax(10, 20, 30));
	  }
 
	  public int findMax(Integer a, Integer b, Integer c) {
	    Integer max = Integer.MIN_VALUE;

	    if (a.compareTo(b) > 0) {
	      if (a.compareTo(c) > 0) max = a;
	      else max = c;

	    } else if (b.compareTo(c) > 0) max = b;
	    else max = c;

	    return max;
	  }
	}