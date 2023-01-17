package com.google.checkstyle.test.chapter4formatting.rule485annotations;

//warn
class InputAnnotationLocation
{

    public int a;

    public int b;

    public int c;

    public int d;

        //warn
    public InputAnnotationLocation() {}

    void foo1() {}

       //warn
    void foo2() {}

        //warn
      //warn
          //warn
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
            //warn
        void foo1() {}

            //warn
        void foo2() {}
    }

    InnerClass anon = new InnerClass()
    {
        public int a;

        public int b;

        public int c;

        public int d;

           void foo1() {} //warn

          //warn
        void foo2() {}

        void foo42() {}
    };

}

 //warn
class Foo {}

class Bar {} //warn

@interface MyAnnotation1 {}

@interface MyAnnotation2 {}

@interface MyAnnotation3 {}

@interface MyAnnotation4 {}

@interface MyAnnotationWithParam {

    String value();}
