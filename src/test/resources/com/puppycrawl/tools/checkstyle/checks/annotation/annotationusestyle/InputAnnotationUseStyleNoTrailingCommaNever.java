/*
AnnotationUseStyle
elementStyle = ignore
closingParens = ignore
trailingArrayComma = NEVER


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;

@SuppressWarnings({}) // ok
public class InputAnnotationUseStyleNoTrailingCommaNever
{
  @SuppressWarnings({"common"}) // ok
  public void foo() {

      /** Suppress warnings */
      @SuppressWarnings({"common","foo"}) // ok
      Object o = new Object() {

          @SuppressWarnings(value={"common"}) // ok
          public String toString() {

              @SuppressWarnings(value={"leo","herbie"}) // ok
              final String pooches = "leo.herbie";

              return pooches;
          }
      };
  }

  // ok

  // ok
  enum P {

      // ok
      L, // annotation in enum

      // ok
      Y;
  }

}

@interface Test5 {
  String[] value();
  String[] more() default {};
}

@interface Pooches5 {

  Class<?>[] tokens();
  int[] other();
}
