/*
AnnotationOnSameLine
tokens = (default)CLASS_DEF, INTERFACE_DEF, ENUM_DEF, METHOD_DEF, CTOR_DEF, \
         VARIABLE_DEF, RECORD_DEF, COMPACT_CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationonsameline;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Target;
import java.util.List;
import java.util.ArrayList;

public class InputAnnotationOnSameLineCheck2 {

    // violation
    private List<String> names = new ArrayList<>();

    private List<String> names2 = new ArrayList<>();       // ok

    @SuppressWarnings("deprecation")        // violation
    Integer x;

    @SuppressWarnings("deprecation")        // violation
    // violation
    Integer x2;

    @SuppressWarnings("deprecation") Integer x3;     // ok

}

@Target({CONSTRUCTOR, FIELD, METHOD, PARAMETER, TYPE, TYPE_PARAMETER, TYPE_USE}) @interface Ann {}

@Target({CONSTRUCTOR, FIELD, METHOD, PARAMETER, TYPE, TYPE_PARAMETER, TYPE_USE}) @interface Ann2 {}

@interface Ann3 {}

@interface Ann4 {}
