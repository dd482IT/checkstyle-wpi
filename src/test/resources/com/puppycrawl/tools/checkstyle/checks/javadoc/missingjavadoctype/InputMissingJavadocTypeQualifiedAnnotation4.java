/*
MissingJavadocType
scope = (default)public
excludeScope = (default)null
skipAnnotations = com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype.\
    InputMissingJavadocTypeQualifiedAnnotation4.SomeAnnotation
tokens = INTERFACE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

public class InputMissingJavadocTypeQualifiedAnnotation4 {
    public @interface SomeAnnotation { }

    // violation 'Missing a Javadoc comment.'
    public interface A { }

    // violation below 'Missing a Javadoc comment.'
    public interface B { }

    public interface C { }
}
