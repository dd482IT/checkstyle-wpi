/*
MissingJavadocType
scope = (default)public
excludeScope = (default)null
skipAnnotations = SomeAnnotation, InputMissingJavadocTypeQualifiedAnnotation5.SomeAnnotation, \
    com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype.\
    InputMissingJavadocTypeQualifiedAnnotation5.SomeAnnotation
tokens = INTERFACE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

public class InputMissingJavadocTypeQualifiedAnnotation5 {
    public @interface SomeAnnotation { }

    // ok
    public interface A { }

    // ok
    public interface B { }

    public interface C { }
}
