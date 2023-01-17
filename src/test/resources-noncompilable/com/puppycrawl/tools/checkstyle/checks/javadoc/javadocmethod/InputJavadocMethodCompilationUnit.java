/*
JavadocMethod
validateThrows = true


*/
//non-compiled with javac: Compilable with Java14
package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocmethod;

@Deprecated 
public record InputJavadocMethodCompilationUnit() {

    public void doThing() { // ok
        // No error unless an annotation is present
        record Test(String hello, int world) {}

        class TestClass {}

        @Deprecated
        record Test2(String hello, int world) {}

        @Deprecated
        class TestClass2 {}
    }

    @Deprecated 
    public static record AnnotatedRecordWithVisibilityModifier1(String string){}

    @Deprecated 
    protected record AnnotatedRecordWithVisibilityModifier2(Integer integer){}

    @Deprecated 
    private record AnnotatedRecordWithVisibilityModifier3(String x, int y){}

    @Deprecated 
    public static class AnnotatedClassWithVisibilityModifier1 {}

    @Deprecated 
    protected class AnnotatedClassWithVisibilityModifier2 {}

    @Deprecated 
    private class AnnotatedClassWithVisibilityModifier3 {}

}

@interface ProblemCauser {
}
