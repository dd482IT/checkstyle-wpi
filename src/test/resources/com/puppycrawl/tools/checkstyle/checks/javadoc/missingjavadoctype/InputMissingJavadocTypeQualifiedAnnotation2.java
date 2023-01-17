/*
MissingJavadocType
scope = (default)public
excludeScope = (default)null
skipAnnotations = SomeAnnotation
tokens = INTERFACE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

public class InputMissingJavadocTypeQualifiedAnnotation2 {
    public @interface SomeAnnotation { }

    // ok
    public interface A { }

    // violation below 'Missing a Javadoc comment.'
    public interface B { }

    public interface C { }
}
