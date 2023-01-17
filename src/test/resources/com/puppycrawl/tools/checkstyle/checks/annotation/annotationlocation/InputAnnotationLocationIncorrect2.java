/*
AnnotationLocation
allowSamelineMultipleAnnotations = true
allowSamelineSingleParameterlessAnnotation = (default)true
allowSamelineParameterizedAnnotation = true
tokens = (default)CLASS_DEF, INTERFACE_DEF, PACKAGE_DEF, ENUM_CONSTANT_DEF, \
         ENUM_DEF, METHOD_DEF, CTOR_DEF, VARIABLE_DEF, RECORD_DEF, COMPACT_CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

class InputAnnotationLocationIncorrect2
{

    // ok
    public int a;

    public int b; // ok

    // ok
    public int c;

    // ok
    public int d;

    // ok
    public InputAnnotationLocationIncorrect2() {}

    void foo1() {} // ok

    // ok
       // violation '.*'MyAnn_22' have incorrect indentation level 7, .* should be 4.'
    void foo2() {}

    // ok
        // violation '.* incorrect .* level 8, .* should be 4.'
      // violation '.* incorrect .* level 6, .* should be 4.'
          // violation '.* incorrect .* level 10, .* should be 4.'
    class InnerClass
    {
        public int a;

        public int b; // ok

        // ok
        public int c;

        // ok
        public int d;

        // ok
        public InnerClass() // ok
        {
            // comment
        }
        // ok
            // violation '.* incorrect .* level 12, .* should be 8.'
        void foo1() {}

        // ok
            // violation '.* incorrect .* level 12, .* should be 8.'
        void foo2() {}
    }

    // ok
       // violation '.* incorrect .* level 7, .* should be 4.'
    InnerClass anon = new InnerClass()
    {
        public int a; // ok

        public int b; // ok

        // ok
        // ok
        public int c;

        // ok
        public int d;

        // ok
           void foo1() {} // violation '.* incorrect .* level 11, .* should be 8.'

        // ok
          // violation '.* incorrect .* level 10, .* should be 8.'
        void foo2() {}

        void foo42() {} // ok
    };

}

// violation '.*'MyAnn_22' have incorrect indentation level 0, .* should be 3.'
class Foo2 {
    public void method1(Object param1) { // ok
        try {
        }
        catch (Exception e) { // ok
        }
        return;
    }
}

@interface MyAnnotation_12 {

        String value();}

@interface MyAnn_22 {}

@interface MyAnnotation_32 {}

@interface MyAnnotation_42 {}

@interface MyAnn_2 {

    String value();}
