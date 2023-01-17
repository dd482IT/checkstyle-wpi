/*
AnnotationUseStyle
elementStyle = ignore
closingParens = ignore
trailingArrayComma = ALWAYS


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;

@SuppressWarnings({}) // violation 'Annotation array values must contain trailing comma'
public class InputAnnotationUseStyleNoTrailingComma
{
  @SuppressWarnings({"common"}) // violation 'Annotation array values must contain trailing comma'
  public void foo() {

      /** Suppress warnings */
      // violation below 'Annotation array values must contain trailing comma'
      @SuppressWarnings({"common","foo"})
      Object o = new Object() {

          // violation below 'Annotation array values must contain trailing comma'
          @SuppressWarnings(value ={"common"})
          public String toString() {

              // violation below 'Annotation array values must contain trailing comma'
              @SuppressWarnings( value={"leo","herbie"})
              final String pooches = "leo.herbie";

              return pooches;
          }
      };
  }

  // 2 violations

  // 2 violations
  enum P {

      // 2 violations
      L, // annotation in enum

      // 2 violations
      Y;
  }

}

@interface Test2 {
  String[] value();
  String[] more() default {};
}

@interface Pooches2 {

  Class<?>[] tokens();
  int[] other();
}
