package com.puppycrawl.tools.checkstyle.checks.indentation.indentation; //indent:0 exp:0

/**                                                                           //indent:0 exp:0
 * This test-input is intended to be checked using following configuration:   //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 * arrayInitIndent = 4                                                        //indent:1 exp:1
 * basicOffset = 4                                                            //indent:1 exp:1
 * braceAdjustment = 0                                                        //indent:1 exp:1
 * caseIndent = 4                                                             //indent:1 exp:1
 * forceStrictCondition = false                                               //indent:1 exp:1
 * lineWrappingIndentation = 4                                                //indent:1 exp:1
 * tabWidth = 4                                                               //indent:1 exp:1
 * throwsIndent = 4                                                           //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 *                                                                            //indent:1 exp:1
 */                                                                           //indent:1 exp:1
 //indent:4 exp:4
//indent:0 exp:0
public class InputIndentationDifficultAnnotations { //indent:0 exp:0

 //indent:8 exp:8
    //indent:4 exp:4
    String foo = "foo"; //indent:4 exp:4

 //indent:8 exp:8
    //indent:4 exp:4
    void foo() { //indent:4 exp:4

    } //indent:4 exp:4
} //indent:0 exp:0

 //indent:0 exp:4,23,25 warn
class IncorrectClass { //indent:0 exp:0

 //indent:8 exp:8
    String foo = "foo"; //indent:4 exp:4

 //indent:8 exp:8
    void foo() { //indent:4 exp:4

    } //indent:4 exp:4
} //indent:0 exp:0

@interface DifficultAnnotation { //indent:0 exp:0

    MyType[] value(); //indent:4 exp:4

} //indent:0 exp:0

@interface MyType { //indent:0 exp:0

    Class<?> value(); //indent:4 exp:4

    String name(); //indent:4 exp:4
} //indent:0 exp:0

@interface SimpleAnnotation {} //indent:0 exp:0
