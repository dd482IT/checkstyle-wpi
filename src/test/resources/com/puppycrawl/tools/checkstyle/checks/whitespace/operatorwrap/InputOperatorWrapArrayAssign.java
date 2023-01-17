/*
OperatorWrap
option = (default)nl
tokens = ASSIGN


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.operatorwrap;

import java.lang.annotation.Repeatable;
import java.util.Arrays;

public class InputOperatorWrapArrayAssign {
    public String[] array = { // ok
        "foo",
        "bar"
    };
    public String[] array2 = // violation ''=' should be on a new line.'
    {
        "foo",
        "bar"
    };
}

class Second {}

class Third {}

@interface Annotation1 {
    String[] example();
    String value() default "";
    String other() default "";
    String[] arr() default "";
}

@interface Annotation2 {
    String[] example();
}

@interface Nested {
    Annotation1[] nestedAnn();
}
