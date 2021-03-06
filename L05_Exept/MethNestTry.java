class MethNestTry {
  static void nesttry(int a) {
    try { // nested try block
      /* If one command line arg is used,then an divide-by-zero exception will be generated by the following code. */
      if(a==1) a = a/(a-a); // division by zero

      /* If two command line args are used then generate an out-of-bounds exception. */     
      if(a==2) {
        int c[] = { 1 };
        c[42] = 99; // generate an out-of-bounds exception
      }
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out-of-bounds: " + e);
    }
  }

  public static void main(String args[]) {
    try {
      int a = args.length;
      /* If no command line args are present, the following statement will generate a divide-by-zero exception. */
      int b = 42 / a;
      System.out.println("a = " + a);
      nesttry(a);
    } catch(ArithmeticException e) {
      System.out.println("Divide by 0: " + e);
    }
  }
}
/*
>>> java MethNestTry 
Divide by 0: java.lang.ArithmeticException: / by zero
>>> java MethNestTry 1
a = 1
Divide by 0: java.lang.ArithmeticException: / by zero
>>> java MethNestTry 2 3
a = 2
Array index out-of-bounds: java.lang.ArrayIndexOutOfBoundsException: 42
>>> java MethNestTry 2 3 4
a = 3
*/

