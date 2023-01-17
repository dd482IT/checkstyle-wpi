/*
DesignForExtension
ignoredAnnotations = Override, Deprecated, Before, After, BeforeClass, AfterClass
requiredJavadocPhrase = (default).*


*/

package com.puppycrawl.tools.checkstyle.checks.design.designforextension;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class InputDesignForExtensionMultipleAnnotations { // ok

    @Deprecated
    public void foo1() {
        foo3();
    }

    @Deprecated
    public void foo2() {
        foo3();
    }

    // comment
    @Deprecated
    public void foo4() {
        foo3();
    }

    @Deprecated
    // comment
    public void foo5() {
        foo3();
    }


    /**
     * comment
     */
    @Deprecated
    public void foo6() {
        foo3();
    }

    @Deprecated
    /**
     * comment
     */
    public void foo7() {
        foo3();
    }

    /* comment */
    @Deprecated
    public void foo8() {
        foo3();
    }

    @Deprecated
    /* comment */
    public void foo9() {
        foo3();
    }

    /* comment */
    @Deprecated
    public void foo10() {
        foo3();
    }

    /* comment */
    @Deprecated
    public void foo11() {
        foo3();
    }

    private void foo3() {}
}
