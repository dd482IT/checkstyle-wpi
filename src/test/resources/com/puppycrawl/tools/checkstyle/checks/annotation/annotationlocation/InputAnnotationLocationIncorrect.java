/*
AnnotationLocation
allowSamelineMultipleAnnotations = (default)false
allowSamelineSingleParameterlessAnnotation = (default)true
allowSamelineParameterizedAnnotation = (default)false
tokens = (default)CLASS_DEF, INTERFACE_DEF, PACKAGE_DEF, ENUM_CONSTANT_DEF, \
         ENUM_DEF, METHOD_DEF, CTOR_DEF, VARIABLE_DEF, RECORD_DEF, COMPACT_CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

// violation below 'Annotation 'MyAnn' should be alone on line.'
class InputAnnotationLocationIncorrect
{

    // violation '.* should be alone on line.'
    public int a;

    public int b; // violation '.* should be alone on line.'

    // ok
    public int c;

    // ok
    public int d;

    // ok
    public InputAnnotationLocationIncorrect() {}

    void foo1() {} // 2 violations

    // ok
       // violation '.* incorrect .* level 7, .* should be 4.'
    void foo2() {}

    // ok
        // violation '.* incorrect .* level 8, .* should be 4.'
      // violation '.* incorrect .* level 6, .* should be 4.'
          // violation '.* incorrect .* level 10, .* should be 4.'
    class InnerClass
    {
        public int a;

        public int b; // violation '.* should be alone on line.'

        // ok
        public int c;

        // ok
        public int d;

        // ok
        public InnerClass() // violation '.* should be alone on line.'
        {
            // comment
        }
            // violation '.* incorrect .* level 12, .* should be 8.'
        void foo1() {}

            // violation '.* incorrect .* level 12, .* should be 8.'
        void foo2() {}
    }

       // violation '.* incorrect .* level 7, .* should be 4.'
    InnerClass anon = new InnerClass()
    {
        public int a; // violation '.*should be alone on line.'

        public int b; // violation '.* should be alone on line.'

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
        void foo42() {} // violation '.* should be alone on line.'
    };

}

// violation '.* incorrect .* level 0, .* should be 3.'
class Foo {
    public void method1(Object param1) {
        try {
        }
        catch (Exception e) {
        }
        return;
    }
}

@interface MyAnnotation1 {

        String value();}

@interface MyAnn_21 {}

@interface MyAnnotation3 {}

@interface MyAnnotation4 {}

@interface MyAnn {

    String value();}
