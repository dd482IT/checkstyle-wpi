/*
AnnotationLocation
allowSamelineMultipleAnnotations = (default)false
allowSamelineSingleParameterlessAnnotation = false
allowSamelineParameterizedAnnotation = (default)false
tokens = CLASS_DEF, INTERFACE_DEF, ENUM_DEF, METHOD_DEF, CTOR_DEF, \
         VARIABLE_DEF, ANNOTATION_DEF, ANNOTATION_FIELD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class InputAnnotationLocationDeprecatedAndCustom {
    @Deprecated // ok
    public class Annotation
    {
        @Deprecated // <--method, separate line
        public void test(String s) { // ok
            // <--variable, separate line
            Integer i;
            for (char c : s.toCharArray()) { // ok
            }
        }
    }

    public class Test {
        public void foo1() {
            try {
                // some code
            }
            catch (Exception ex) {

            }
        }

        public void foo2() {
            for (int i = 0; i < 10; i++) {

            }
        }

        public void foo3() {
            MathOperation c = (int a, int b) -> a + b;
        }

        public void foo4(int a, int b) {}

        public void foo5(@SuppressWarnings("unchecked") int a) {}
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    @Target(ElementType.TYPE_USE)
    public @interface MyAnnotation {}
}
