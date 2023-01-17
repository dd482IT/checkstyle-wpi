/*
AnnotationUseStyle
elementStyle = ignore
closingParens = ignore
trailingArrayComma = ALWAYS


*/

//non-compiled with eclipse: The value for annotation attribute must be a constant expression
package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;

public class InputAnnotationUseStyleNoTrailingComma
{
  // 2 violations

  enum P {
      L,
      Y;
  }

}

@interface Test2 {
  String[] value();
  String[] more() default {};
}
