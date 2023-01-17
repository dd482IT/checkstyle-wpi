package com.puppycrawl.tools.checkstyle.grammar.antlr4;

import static java.lang.annotation.ElementType.TYPE_USE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class InputAntlr4AstRegressionAnnotationOnArrays {

    private String array1[];
    private int array2[][];

    private InputAntlr4AstRegressionAnnotationOnArrays() {
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
