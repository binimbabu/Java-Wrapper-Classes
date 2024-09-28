
Wrapper Classes



Wrapper Classes converts primitive types to object types. Collections only handles with object types not with primitive types. Wrapper Classes include Byte, Short, Integer, Long, Float, Double, Character and Boolean. Meanwhile primitive types include byte, short, int, long, flat, double, char, Boolean. Objects of wrapper class represents the primitive data type. Converting primitive types to object types are called boxing. Converting object types to primitive types are called unboxing. Additionally there is primitive to string conversion, string to primitive conversion, object to string conversion and string to object conversion.



package com.bini.babu;

public class PrimtiveAndObject {

	public static void main(String[] args) {
          int x = 100;
          Integer i = Integer.valueOf(x);
          int y = i.intValue()
	}

}


The primitive type (i.e int x is of type int , where int is primitive type) to be converted to Object type (i.e to Integer type), which can be done by 'Integer i = Integer.valueOf(x);' (this converts x of type int to Integer).
Converting Integer type back to int type can be done by ' int y = i.intValue();'



package com.bini.babu;

public class PrimitiveAndString {

	public static void main(String[] args) {
     byte b =100;
     String x = Byte.toString(b);
      byte y = Byte.parseByte(x);
	}

}


In the above code byte primitive type created a variable 'b' and assign value 100. To convert Wrapper class Byte to string we use the line of code 'String x = Byte.toString(b);' and assigning to a variable 'x' of type String.
To convert string to primitive (here byte) we use wrapperclass (i.e since byte we use parseByte()), hence we give the command ' byte y = Byte.parseByte(x);' .





package com.bini.babu;

public class ObjectAndString {

	public static void main(String[] args) {
      long x = 100;
      Long l = Long.valueOf(x);
      String s = l.toString();
      Long y = Long.valueOf(s);
	}

}



In the above code we created a primitive type (of type here long) variable 'x' and assigned value 100 (i.e long x = 100). Converting primitive type (i.e long) to object of type Long we use the command 'Long l = Long.valueOf(x)'. To convert variable 'l' to string we use the command ' String s = l.toString();' . Converting back from String to wrapper type Long we use the command '  Long y = Long.valueOf(s);' .




package com.bini.babu;

public class WrapperTypeConstructor {

	public static void main(String[] args) {
       long x = 100;
       Long l = new Long(x);
		String s = "20";
		Long y = new Long(s);
	}

}


In the above code 'Long l = new Long(x);' will create an object of type primitive type (here long' . Similarly 'Long y = new Long(s);' will create an object of a string. Hence, wrapper classes has 2 types of constructors they are constructor that accepts primitive types (
(i.e
long x = 100;
 Long l = new Long(x); 
and that accepts string(i.e 
String s = "20";
Long y = new Long(s);)






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


In the above code 'x' of primitive type is initialized to 100, converting 'x' to string we have the command 'String y = Integer.toString(x); ' . Creating a constructor from string 'Integer i = new Integer(y); ' . Converting 'i' to primitive type int we have the command 'int z = i.intValue();'. 

Creating a constructor accepting primitive type (i.e  Integer a = new Integer(x); ) in the above code. Then converting to string (  String b = a.toString(); ). Atlast converting to primitive type int (   int c = Integer.parseInt(b); ).


