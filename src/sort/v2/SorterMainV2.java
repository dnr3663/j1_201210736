package com.sd.sort.v2;

import java.util.Date;
import com.sd.turtle.WeightTurtle;

public class SorterMainV2{
  public static void main(String[] args){
    String[] B = {"John", "Adam", "Skrien", "Smith", "Jones"};
    Comparator stringComp = new StringComparator();
    Sorter.sort(B, stringComp);
    
    Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    Comparator integerComp = new IntegerComparator();
    Sorter.sort(C, integerComp);
    
    for(int i=0; i<B.length; i++)
      System.out.println("B["+i+"]="+B[i]);
    for(int i=0; i<C.length; i++)
      System.out.println("C["+i+"]="+C[i]);
  }
}

  