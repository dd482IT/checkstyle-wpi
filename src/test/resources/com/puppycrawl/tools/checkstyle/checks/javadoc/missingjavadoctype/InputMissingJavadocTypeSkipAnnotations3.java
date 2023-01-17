/*
MissingJavadocType
scope = (default)public
excludeScope = (default)null
skipAnnotations = Generated3, ThisIsOk3
tokens = (default)INTERFACE_DEF, CLASS_DEF, ENUM_DEF, ANNOTATION_DEF, RECORD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

class InputMissingJavadocTypeSkipAnnotations3 { // ok
}

class InputJavadocTypeSkipAnnotationsFQN3 { // ok
}

class InputJavadocTypeAllowedAnnotationByDefault3 { // ok
}

/**
 * Annotation for unit tests.
 */
@interface ThisIsOk3 {} // ok
/**
 * Annotation for unit tests.
 */
@interface Generated3 { // ok
    String[] value();
}
