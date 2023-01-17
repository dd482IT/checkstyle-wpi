/*
MissingJavadocType
scope = (default)public
excludeScope = (default)null
skipAnnotations = (default)Generated
tokens = INTERFACE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

public class InputMissingJavadocTypeQualifiedAnnotation1 {
    public @interface SomeAnnotation { }

    // violation 'Missing a Javadoc comment.'
    public interface A { }

    // violation below 'Missing a Javadoc comment.'
    public interface B { }

    public interface C { }
}
