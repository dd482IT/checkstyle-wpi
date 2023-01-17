/*
AnnotationUseStyle
elementStyle = ignore
closingParens = ignore
trailingArrayComma = ALWAYS


*/

//non-compiled with eclipse: The value for annotation attribute must be a constant expression
package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;

public class InputAnnotationUseStyleWithTrailingComma
{
    // ok
    /**

    */
    enum P {
        L,
        Y;
    }

}

@interface Test {
    String[] value();
    String[] more() default {};
}
