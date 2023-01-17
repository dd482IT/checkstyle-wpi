package com.puppycrawl.tools.checkstyle.checks.indentation.indentation; //indent:0 exp:0

@interface SimpleType { //indent:0 exp:0
    Class<?> value(); //indent:4 exp:4
} //indent:0 exp:0

@interface PrecedingSimpleType { //indent:0 exp:0
    Class<?> value(); //indent:4 exp:4
} //indent:0 exp:0

 //indent:0 exp:0
 //indent:0 exp:0
public class //indent:0 exp:0
    InputIndentationAnnotationClosingParenthesisEndsInSameIndentationAsOpening { //indent:4 exp:4
} //indent:0 exp:0

 //indent:0 exp:0
 //indent:0 exp:0
class MultipleInputIndentationAnnotationClosingParenthesisJustLineAfterOpening { //indent:0 exp:0
} //indent:0 exp:0

 //indent:0 exp:0
class InputIndentationAnnotationClosingParenthesisJustLineAfter { //indent:0 exp:0
} //indent:0 exp:0

 //indent:16 exp:0 warn
 //indent:16 exp:0 warn
class InputIndentationAnnotationClosingParenthesisHasBadIndentation { //indent:0 exp:0

 //indent:8 exp:4 warn
 //indent:8 exp:4 warn
    Boolean booleanField; //indent:4 exp:4

 //indent:8 exp:4 warn
    Boolean anotherBooleanField; //indent:4 exp:4
} //indent:0 exp:0
