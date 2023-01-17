package com.google.checkstyle.test.chapter4formatting.rule487modifiers;

strictfp abstract class InputModifierOrder //warn
{
    transient private String dontSaveMe; //warn

    volatile public int whatImReading; //warn

    public volatile boolean sModifierOrderVar = false; // ok

    /**
     * Illegal order of modifiers for methods. Make sure that the
     * first and last modifier from the JLS sequence is used.
     */
    strictfp private void doStuff() //warn
    {
    }

    /** Single annotation without other modifiers */
    void someMethod()
    {
    }

    /** Illegal order of annotation - must come first */
    private void someMethod2() //warn
    {
    }

    /** Annotation in middle of other modifiers otherwise in correct order */
    private strictfp void someMethod3() //warn
    {
    }

    /** Correct order */
    private strictfp void someMethod4()
    {
    }

    /** Annotation in middle of other modifiers otherwise in correct order */
    public static strictfp void someMethod5() //warn
    {
    }

    public static final synchronized strictfp void fooMethod() {}; //ok

    strictfp protected final static synchronized void fooMethod1() {}; //warn

    synchronized strictfp private final static void fooMethod2() {}; //warn

    static synchronized final strictfp protected void fooMethod3() {}; //warn

    strictfp static final synchronized private void fooMethod4() {}; //warn

    synchronized final strictfp static public void fooMethod5() {}; //warn

    static synchronized strictfp private final void fooMethod6() {}; //warn

    final strictfp synchronized static protected void fooMethod7() {}; //warn

    abstract protected void fooMet(); //warn

    abstract public void fooMet1(); //warn

    /** holder for redundant 'public' modifier check. */
    public static interface InputRedundantPublicModifier
    {
        public void a();

        void b();

        abstract void c();

        public float PI_PUBLIC = (float) 3.14;

        final float PI_FINAL = (float) 3.14;

        /** all OK */
        float PI_OK = (float) 3.14;
    }
    final private void method() // warn
    {
    }
}

final class RedundantFinalClass
{
    public final void finalMethod()
    {
    }


    public void method()
    {
    }

    protected static synchronized native void fooMethod(); // warn

    static protected synchronized native void fooMethod1(); // warn

    protected synchronized native void fooMethod2(); // ok

    native synchronized protected static void fooMethod3(); // warn

    native protected static synchronized void fooMethod4(); // warn

    public static synchronized native void fooMethod5(); // warn

    synchronized static native public void fooMethod6(); // warn

    static synchronized private native void fooMethod7(); // warn
}

/** Holder for redundant modifiers of inner implementation */
interface InnerImplementation
{
    InnerImplementation inner =
        new InnerImplementation()
        {
            /** compiler requires 'public' modifier */
            public void method()
            {
            }
        };

    void method();
}

class WithInner
{
    /**
     * Inner class
     * @author max
     *
     */
    class Inner
    {
        transient private String dontSaveMe; //warn

        volatile public int whatImReading; //warn

        protected synchronized native void fooMethod(); // ok

        protected synchronized native void fooMethod1(); // warn

        synchronized protected native void fooMethod2(); // warn

        native synchronized protected void fooMethod3(); // warn

        native protected synchronized void fooMethod4(); // warn

        public synchronized native void fooMethod5(); // warn

        synchronized native public void fooMethod6(); // warn

        synchronized private native void fooMethod7(); // warn

        /**
         * Anonymous class
         */
        InnerImplementation foo = new InnerImplementation() {


            public void method() {
                // OOOO Auto-generated method stub

            }

            transient private String dontSaveMe; //warn

            volatile public int whatImReading; //warn

            protected synchronized native void fooMethod(); // warn

            protected synchronized native void fooMethod1(); // warn

            synchronized protected native void fooMethod2(); // warn

            native synchronized protected void fooMethod3(); // warn

            protected synchronized native void fooMethod4(); // ok

            public synchronized native void fooMethod5(); // warn

            synchronized native public void fooMethod6(); // warn

            synchronized private native void fooMethod7(); // warn
        };
    }

    /**
     * Inner abstract class
     * @author max
     *
     */
    abstract class AbsInner
    {
        transient private String dontSaveMe; //warn

        volatile public int whatImReading; //warn

        public final synchronized strictfp void fooMethod() {}; //ok

        strictfp protected final synchronized void fooMethod1() {}; //warn

        synchronized strictfp private final void fooMethod2() {}; //warn

        synchronized final strictfp protected void fooMethod3() {}; //warn

        strictfp final synchronized private void fooMethod4() {}; //warn

        synchronized final strictfp public void fooMethod5() {}; //warn

        synchronized strictfp private final void fooMethod6() {}; //warn

        final strictfp synchronized protected void fooMethod7() {}; //warn

        abstract protected void fooMet(); //warn

        abstract public void fooMet1(); //warn
    }
}

/** Holder for redundant modifiers of annotation fields/variables */
@interface Annotation
{
    public String s1 = "";
    final String s2 = "";
    static String s3 = "";
    String s4 = "";
    public String blah();
    abstract String blah2();
}

@interface MyAnnotation2 {
}

@interface MyAnnotation4 {
}

/** Illegal order of modifiers for interface methods */
interface InputModifierOrderInterface
{
    default strictfp void a() { }  //ok

    strictfp default void b() { }  //warn
}
