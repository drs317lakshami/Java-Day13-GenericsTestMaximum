package com.generics;

import java.util.ArrayList;
import java.util.Collections;
public class FindMaximumNumber<E extends Comparable> {

	  private E a, b, c;

	  public FindMaximumNumber(E a, E b, E c) {
	    this.a = a;
	    this.b = b;
	    this.c = c;

	    this.testMaximum(); 
	  }
	  public E testMaximum() {
	    E max = FindMaximumNumber.testMaximum(a, b, c);
	    System.out.println("max is " + max);
	    return max;
	  }

	  public static void main(String[] args) {
	   
	    FindMaximumNumber<Integer> intIns = new FindMaximumNumber<>(10, 2, 3); 

	    new FindMaximumNumber<Float>(10f, 20f, 3f);

	    new FindMaximumNumber<String>("Chase", "Patric", "Ryan");

	  }

	  @SuppressWarnings({"unchecked", "rawtypes"})
	  public static <E extends Comparable> E testMaximum(E a, E b, E c) {
	    E max; 
	    if (a.compareTo(b) > 0) {
	      if (a.compareTo(c) > 0) max = a;
	      else max = c;

	    } else if (b.compareTo(c) > 0) max = b;
	    else max = c;

	    return max;
	  }

	}