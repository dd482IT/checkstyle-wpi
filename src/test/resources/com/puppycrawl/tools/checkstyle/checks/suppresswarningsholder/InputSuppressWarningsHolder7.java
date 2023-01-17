package com.puppycrawl.tools.checkstyle.checks.suppresswarningsholder;

import java.lang.annotation.*;
import java.util.List;

public class InputSuppressWarningsHolder7 {

    private List<String> testSwAnnotation;

    private List<String> testSwAnnotationVal;

    private List<String> list1;

    private List<String> list2;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface TestSwAnnotation {
    SuppressWarnings value() default @SuppressWarnings({"",});
}

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@interface TestSwAnnotationVal{

    SuppressWarnings[] value() default {@SuppressWarnings({"",})};

    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    @Target({})
    @interface AnyAnnotation {}
}
