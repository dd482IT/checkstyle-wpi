/*
AnnotationOnSameLine
tokens = CLASS_DEF, INTERFACE_DEF, ENUM_DEF, METHOD_DEF, CTOR_DEF, \
         VARIABLE_DEF, PARAMETER_DEF, ANNOTATION_DEF, TYPECAST, LITERAL_THROWS, \
         IMPLEMENTS_CLAUSE, TYPE_ARGUMENT, LITERAL_NEW, DOT, ANNOTATION_FIELD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationonsameline;

public class InputAnnotationOnSameLineCheck3 {

    int x;     // ok

    int y;

    // violation
    // violation
    @java.lang.Deprecated   // violation
    public int getX() {
        return (int) x;
    }

    // violation
    public int field;

    public
    int field2; // ok
}

class SomeClass2 {

    @interface Annotation {}
}

@interface Annotation3 {}
@interface Annotation4 {}
