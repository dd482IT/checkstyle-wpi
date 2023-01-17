/*
AnnotationUseStyle
elementStyle = ignore
closingParens = ignore
trailingArrayComma = ALWAYS


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;
//this file compiles in eclipse 3.4 but not with Sun's JDK 1.6.0.11

public class InputAnnotationUseStyleWithTrailingComma
{
    @SuppressWarnings({"common",}) // ok
    public void foo() {


        @SuppressWarnings({"common","foo",}) // ok
        Object o = new Object() {

            @SuppressWarnings(value={"common",}) // ok
            public String toString() {

                @SuppressWarnings(value={"leo","herbie",}) // ok
                final String pooches = "leo.herbie";

                return pooches;
            }
        };
    }

    // ok
    /**

    */
    enum P {

        // ok
        L,

        /**

        */
        Y;
    }

}

@interface Test {
    String[] value();
    String[] more() default {};
}

@interface Pooches {

    Class<?>[] tokens();
    int[] other();
}
