package com.puppycrawl.tools.checkstyle.grammar.antlr4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;


  // violation
@interface InputAntlr4AstRegressionAnnotationLocation { // violation

      // violation
    String value(); // violation

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
