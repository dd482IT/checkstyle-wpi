/*
AnnotationLocation
allowSamelineMultipleAnnotations = (default)false
allowSamelineSingleParameterlessAnnotation = (default)true
allowSamelineParameterizedAnnotation = (default)false
tokens = (default)CLASS_DEF, INTERFACE_DEF, PACKAGE_DEF, ENUM_CONSTANT_DEF, \
         ENUM_DEF, METHOD_DEF, CTOR_DEF, VARIABLE_DEF, RECORD_DEF, COMPACT_CTOR_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

/* Config: default */


// ok
// ok
class InputAnnotationLocationCorrect
{

    // ok
    // ok
    public int a;

    // ok
    public int b;

    // ok
    // ok
    public int c;

    // ok
    public int d;

    // ok
    // ok
    public InputAnnotationLocationCorrect()
    {
        //comment
    }
    // ok
    // ok
    void foo1() {}

    // ok
    // ok
    void foo2() {}

    // ok
    // ok
    // ok
    // ok
    class InnerClass
    {
        // ok
        // ok
        public int a;

        // ok
        public int b;

        // ok
        // ok
        public int c;

        // ok
        public int d;

        // ok
        public InnerClass()
        {
            // comment
        }
        // ok
        void foo1(int a) {} // ok

        // ok
        // ok
        void foo2() {}
    }

    // ok
    // ok
    InnerClass anon = new InnerClass()
    {
        // ok
        // ok
        public int a;

        public int b;

        public int c;

        public int d;

        void foo1() {}

        void foo2() {}
    };

}

class _Foo {}

@interface MyAnnotation5 {}

@interface MyAnnotation6 {}
