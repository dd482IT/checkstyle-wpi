/*
AnnotationOnSameLine
tokens = CLASS_DEF, INTERFACE_DEF, ENUM_DEF, METHOD_DEF, CTOR_DEF, \
         VARIABLE_DEF, PARAMETER_DEF, ANNOTATION_DEF, TYPECAST, LITERAL_THROWS, \
         IMPLEMENTS_CLAUSE, TYPE_ARGUMENT, LITERAL_NEW, DOT, ANNOTATION_FIELD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationonsameline;

import java.util.List;

// violation
interface TestInterface {

    // violation
    Integer getX();
}

public // violation
class InputAnnotationOnSameLineCheckOnDifferentTokens implements // violation
        TestInterface {

    // violation
    private Integer x = new // violation
            Integer(0);

    private List<// violation
            Integer> integerList;

    // violation
    enum TestEnum {
        A1, A2
    }

    // violation
    public InputAnnotationOnSameLineCheckOnDifferentTokens() {}

    // violation
    public void setX(// violation
            int x) throws // violation
                    Exception {
        this.<// violation
                Integer> getXAs();
        this.x = x;
    }

    @Override public Integer getX() {
        return (// violation
                Integer) x;
    }

    public <T> T getXAs() {
        return (T) x;
    }
}

// violation
@interface TestAnnotation {

    // violation
    int x();
}
