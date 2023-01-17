/*
MissingJavadocType
scope = (default)public
excludeScope = (default)null
skipAnnotations = SomeAnnotation
tokens = INTERFACE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

public class InputMissingJavadocTypeQualifiedAnnotationWithParameters {
    public @interface SomeAnnotation {
        String value() default "";
        int quantity() default 1;
        boolean isOk() default false;
    }

    // ok
    public interface A { }

    // ok
    public interface B { }

    public interface C { }

    // violation below 'Missing a Javadoc comment.'
    public interface D { }

    // violation below 'Missing a Javadoc comment.'
    public interface E { }

    // violation below 'Missing a Javadoc comment.'
    public interface F { }

    // violation below 'Missing a Javadoc comment.'
    public interface G { }
}
