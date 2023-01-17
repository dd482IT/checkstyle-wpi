/*
MissingJavadocType
scope = PRIVATE
excludeScope = (default)null
skipAnnotations = Override
tokens = (default)INTERFACE_DEF, CLASS_DEF, ENUM_DEF, ANNOTATION_DEF, RECORD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.missingjavadoctype;

// violation
class InputMissingJavadocTypeSkipAnnotations4 { // ok
}

// violation
class InputJavadocTypeSkipAnnotationsFQN4 { // ok
}

// violation
class InputJavadocTypeAllowedAnnotationByDefault4 { // ok
}

/**
 * Annotation for unit tests.
 */
@interface ThisIsOk4 {} // ok
/**
 * Annotation for unit tests.
 */
@interface Generated4 { // ok
    String[] value();
}
