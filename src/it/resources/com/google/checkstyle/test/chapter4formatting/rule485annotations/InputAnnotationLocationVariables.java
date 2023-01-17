package com.google.checkstyle.test.chapter4formatting.rule485annotations;

// ok - in variables config
class InputAnnotationLocationVariables
{

    public int a;

    public int b;

    public int c;

    public int d;

        // ok - in variables config
    public InputAnnotationLocationVariables() {}

    void foo1() {}

       // ok - in variables config
    void foo2() {}

        // ok - in variables config
      // ok - in variables configwarn
          // ok - in variables config
    class InnerClass
    {
        public int a;

        public int b;

        public int c;

        public int d;

        public InnerClass()
        {
            // OOOO Auto-generated constructor stub
        }
            // ok - in variables config
        void foo1() {}

            // ok - in variables config
        void foo2() {}
    }

       //warn
    InnerClass anon = new InnerClass()
    {
        public int a;

        public int b;

        public int c;

        public int d;

           void foo1() {} // ok - in variables config

          // ok - in variables config
        void foo2() {}

        void foo42() {}
    };

}

 // ok - in variables config
class FooVariables {}

@interface MyAnnotationVariables1 {}

@interface MyAnnotationVariables2 {}

@interface MyAnnotationVariables3 {}

@interface MyAnnotationVariables4 {}

@interface MyAnnotationWithParamVariables {

    String value();}
