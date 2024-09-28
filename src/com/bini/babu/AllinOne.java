package com.bini.babu;

public class AllinOne {

	public static void main(String[] args) {
     int x = 100;
     String y = Integer.toString(x);
     Integer i = new Integer(y);
     int z = i.intValue();
     
     Integer a = new Integer(x);
     String b = a.toString();
     int c = Integer.parseInt(b);
	}

}
