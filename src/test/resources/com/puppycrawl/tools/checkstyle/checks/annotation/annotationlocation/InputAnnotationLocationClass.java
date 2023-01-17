/*
AnnotationLocation
allowSamelineMultipleAnnotations = (default)false
allowSamelineSingleParameterlessAnnotation = (default)true
allowSamelineParameterizedAnnotation = (default)false
tokens = CLASS_DEF, CTOR_DEF, VARIABLE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

  // violation '.* incorrect .* level 2, .* should be 0.'
// violation below 'Annotation 'ClassAnnotation' should be alone on line.'
class InputAnnotationLocationClass {

      // violation '.* incorrect .* level 6, .* should be 4.'
    Object field; // violation '.* should be alone on line.'

      // violation '.* incorrect .* level 6, .* should be 4.'
    // violation below 'Annotation 'ClassAnnotation' should be alone on line.'
    InputAnnotationLocationClass() {
    }

}

@Repeatable(ClassAnnotations.class)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.TYPE})
@interface ClassAnnotation {

    String value() default "";

}

@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.TYPE})
@interface ClassAnnotations {

    ClassAnnotation[] value();

}
