package com.bini.babu;

public class ObjectAndString {

	public static void main(String[] args) {
      long x = 100;
      Long l = Long.valueOf(x);
      String s = l.toString();
      Long y = Long.valueOf(s);
	}

}
