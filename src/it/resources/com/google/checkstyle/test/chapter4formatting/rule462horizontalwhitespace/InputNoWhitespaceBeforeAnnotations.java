package com.google.checkstyle.test.chapter4formatting.rule462horizontalwhitespace;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface NonNull {

}

public class InputNoWhitespaceBeforeAnnotations {

    public void foo(final char[] param) {} // ok

    int[][] fiel1; // ok until #8205
    int[][] field2; // ok
    //@NonNull int @NonNull ... field3; // non-compilable
    //@NonNull int @NonNull... field4; // non-compilable


    public void foo1(final char[] param) { // ok
    }

    public void foo2(final char [] param) { // ok
    }

    public void foo3(final char[] param) { // ok until #8205
    }

    public void foo4(final char[] param) { // ok
    }

    void test1(String... param) { // ok until #8205
    }

    void test2(String ... param) { // ok until #8205
    }

    void test3(String ... param) { // ok until #8205
    }

    void test4(String ... param) { // ok
    }
}
