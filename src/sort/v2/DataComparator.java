package com.sd.sort.v2;
import java.util.Date;

public class DataComparator implements Comparator{
  public DataComparator(){}
  public int compare(Object o1, Object o2){
    return ((Date)o1).compareTo((Date)o2);
  }
}
