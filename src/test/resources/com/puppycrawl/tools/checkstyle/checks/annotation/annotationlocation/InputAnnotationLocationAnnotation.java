/*
AnnotationLocation
allowSamelineMultipleAnnotations = (default)false
allowSamelineSingleParameterlessAnnotation = (default)true
allowSamelineParameterizedAnnotation = (default)false
tokens = ANNOTATION_DEF, ANNOTATION_FIELD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationlocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

  // violation '.* incorrect .* level 2, .* should be 0.'
// violation below 'Annotation 'AnnotationAnnotation' should be alone on line.'
@interface InputAnnotationLocationAnnotation {

      // violation '.* incorrect .* level 6, .* should be 4.'
    String value(); // violation '.* should be alone on line.'

}

@Repeatable(AnnotationAnnotations.class)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@interface AnnotationAnnotation  {

    String value() default "";

}

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@interface AnnotationAnnotations {

    AnnotationAnnotation[] value();

}
