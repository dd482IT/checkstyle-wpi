/*
AnnotationLocation
allowSamelineMultipleAnnotations = (default)false
allowSamelineSingleParameterlessAnnotation = (default)true
allowSamelineParameterizedAnnotation = (default)false
tokens = CLASS_DEF, INTERFACE_DEF, ENUM_DEF, METHOD_DEF, CTOR_DEF, VARIABLE_DEF, \
         ANNOTATION_DEF, ANNOTATION_FIELD_DEF, ENUM_CONSTANT_DEF, PACKAGE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

// violation below 'Annotation 'MyAnn3' should be alone on line.'
class InputAnnotationLocationIncorrect3
{

    // violation '.* should be alone on line.'
    public int a;

    public int b; // violation '.* should be alone on line.'

    // ok
    public int c;

    // ok
    public int d;

    public InputAnnotationLocationIncorrect3() {}

    void foo1() {} // 2 violations

    // ok
       // violation '.* incorrect .* level 7, .* should be 4.'
    void foo2() {}

    // ok
        // violation '.* incorrect .* level 8, .* should be 4.'
      // violation '.* incorrect .* level 6, .* should be 4.'
          // violation '.* incorrect .* level 10, .* should be 4.'
    class InnerClass3
    {
        public int a;

        public int b; // violation '.* should be alone on line.'

        // ok
        public int c;

        // ok
        public int d;

        // ok
        public InnerClass3() // violation '.* should be alone on line.'
        {
            // comment
        }
        // ok
            // violation '.* incorrect .* level 12, .* should be 8.'
        void foo1() {}

        // ok
            // violation '.*'MyAnn_23' have incorrect indentation level 12,.*should be 8.'
        void foo2() {}
    }

    // ok
       // violation '.*'MyAnn_23' have incorrect indentation level 7,.*should be 4.'
    InnerClass3 anon = new InnerClass3()
    {
        // violation below 'Annotation 'MyAnnotation_13' should be alone on line.'
        public int a;

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

// violation 'Annotation 'MyAnn_23' have incorrect indentation level 0, .* should be 3.'
class Foo3 {
    public void method1(Object param1) {
        try {
        }
        catch (Exception e) {
        }
        return;
    }
}

@interface MyAnnotation_13 {

        String value();}

@interface MyAnn_23 {}

@interface MyAnnotation_33 {}

@interface MyAnnotation_43 {}

@interface MyAnn3 {

    String value();}
