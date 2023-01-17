/*
com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck
format = (default)^[a-z][a-zA-Z0-9]*$
applyToPublic = (default)true
applyToProtected = (default)true
applyToPackage = (default)true
applyToPrivate = (default)true


*/

package com.puppycrawl.tools.checkstyle.grammar.java8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


public class InputAnnotations12 {
    public void m1(String ... vararg) {}
    public void m2(int ... vararg) {}
    public void m3(String[][] ... vararg) {}
    public void m4(int[] ... vararg) {}
    public void m5(String[][][][] ... vararg) {}

    @Target(ElementType.TYPE_USE)
    @interface MyAnnotation1 {}
}
