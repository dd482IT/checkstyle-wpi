/*
AnnotationUseStyle
elementStyle = (default)compact_no_array
closingParens = ignore
trailingArrayComma = ignore


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;

@interface InputAnnotationUseStyle {
    //expanded // ok
    DOGS[] pooches();
}


@interface Another32 {
    String[] value();
}
