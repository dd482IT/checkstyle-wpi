/*
MissingJavadocType
scope = (default)public
excludeScope = (default)null
skipAnnotations = Ann1, AnnClass.Ann3
tokens = INTERFACE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

@interface Ann1 { }
@interface Ann2 { }
@interface Ann3 { }

class AnnClass {
    public @interface Ann1 { }
    public @interface Ann2 { }
    public @interface Ann3 { }
}

public class InputMissingJavadocTypeMultipleQualifiedAnnotation {
    // ok
    public interface A { }

    // violation 'Missing a Javadoc comment.'
    public interface B { }

    // ok
    public interface C { }

    // violation 'Missing a Javadoc comment.'
    public interface D { }

    // ok
    public interface E { }
}
