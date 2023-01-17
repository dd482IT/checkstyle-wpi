/*
NoWhitespaceAfter
allowLineBreaks = (default)true
tokens = ARRAY_INIT, AT, INC, DEC, UNARY_MINUS, UNARY_PLUS, BNOT, LNOT, DOT, TYPECAST, \
         ARRAY_DECLARATOR, INDEX_OP, LITERAL_SYNCHRONIZED, METHOD_REF


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.nowhitespaceafter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

@Target(ElementType.TYPE_USE)
@interface NonNull {}

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE_USE})
@interface MyAnnotation {
}
public class InputNoWhitespaceAfterArrayDeclarationsAndAnno {

    int[][] field1; // ok
    int[][] field2; // ok
    int[] array[] = new int[2][2]; // ok
    int array2[][][] = new int[3][3][3]; // ok

    public void foo(final char[] param) {} // ok

    public void m1(String ... vararg) {
    }

    public String m2()[][] {
        return null;
    }

    public void instructions() {
        // annotations
        Map.Entry e;
        String str = (String)"";
        (new Inner3()).<String>m();
        Object arr = new String[3];
        for (String a[] : m2()) {
        }
        Object arr2 = new int[3];
    }

    static class Inner3<T> {
        public void m() {
        }
    }

}
