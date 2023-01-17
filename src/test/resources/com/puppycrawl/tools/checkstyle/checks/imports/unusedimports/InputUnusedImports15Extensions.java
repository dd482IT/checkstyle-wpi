/*
No config


*/

// someexamples of 1.5 extensions
package com.puppycrawl.tools.checkstyle.checks.imports.unusedimports;

@interface MyAnnotation1 { // ok
    String name();
    int version();
}

public class InputUnusedImports15Extensions
{

}

enum Enum1
{
    A, B, C;
    Enum1() {}
    public String toString() {
        return ""; //some custom implementation
    }
}

interface TestRequireThisEnum
{
    enum DAY_OF_WEEK
    {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
}
