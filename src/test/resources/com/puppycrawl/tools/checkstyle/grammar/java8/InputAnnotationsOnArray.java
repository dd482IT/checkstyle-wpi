/*
com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck
format = (default)^[a-z][a-zA-Z0-9]*$
applyToPublic = (default)true
applyToProtected = (default)true
applyToPackage = (default)true
applyToPrivate = (default)true


*/

package com.puppycrawl.tools.checkstyle.grammar.java8;

import static java.lang.annotation.ElementType.TYPE_USE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public final class InputAnnotationsOnArray { // ok

    private String array1[];
    private int array2[][];

    private InputAnnotationsOnArray() {
    }

    public static <T> T[] checkNotNullContents(T[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        return array;
    }

    public static <T> T[][] checkNotNullContents2(T[][] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        return array;
    }

    public static <T> T[] checkNotNullContents3(T array[]) {
        if (array == null) {
            throw new NullPointerException();
        }

        return array;
    }

    public <T> T checkNotNullContents4(T[] array)[] {
        if (array == null) {
            throw new NullPointerException();
        }
        String tmp1[];
        Object[] tmp2 = new Integer[3];
        int[] tmp3 = new int[3];
        Object tmp4 = new String[3][2];
        Object tmp5 = new int[3][2];

        return array;
    }
}

@Retention(RetentionPolicy.CLASS)
@Target({ TYPE_USE })
@interface Nullable {
}
