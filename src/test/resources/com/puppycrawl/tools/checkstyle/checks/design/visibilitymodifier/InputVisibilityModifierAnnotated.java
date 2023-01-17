/*
VisibilityModifier
packageAllowed = (default)false
protectedAllowed = (default)false
publicMemberPattern = (default)^serialVersionUID$
allowPublicFinalFields = (default)false
allowPublicImmutableFields = (default)false
immutableClassCanonicalNames = (default)java.io.File, java.lang.Boolean, java.lang.Byte, \
                               java.lang.Character, java.lang.Double, java.lang.Float, \
                               java.lang.Integer, java.lang.Long, java.lang.Short, \
                               java.lang.StackTraceElement, java.lang.String, \
                               java.math.BigDecimal, java.math.BigInteger, \
                               java.net.Inet4Address, java.net.Inet6Address, \
                               java.net.InetSocketAddress, java.net.URI, java.net.URL, \
                               java.util.Locale, java.util.UUID
ignoreAnnotationCanonicalNames = (default)com.google.common.annotations.VisibleForTesting, \
                                 org.junit.ClassRule, org.junit.Rule


*/

package com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier;

import com.google.common.annotations.VisibleForTesting;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class InputVisibilityModifierAnnotated {
    public TemporaryFolder publicJUnitRule = new TemporaryFolder();

    public TemporaryFolder fqPublicJUnitRule = new TemporaryFolder();

    public String googleCommonsAnnotatedPublic;

    String googleCommonsAnnotatedPackage;

    protected String googleCommonsAnnotatedProtected;

    public String fqGoogleCommonsAnnotatedPublic;

    String fqGoogleCommonsAnnotatedPackage;

    protected String fqGoogleCommonsAnnotatedProtected;

    public String customAnnotatedPublic; // violation

    String customAnnotatedPackage; // violation

    protected String customAnnotatedProtected; // violation

    public String unannotatedPublic; // violation
    String unannotatedPackage; // violation
    protected String unannotatedProtected; // violation
    private String unannotatedPrivate;

    @Retention(value=RetentionPolicy.RUNTIME)
    @Target(value={ElementType.FIELD})
    public @interface CustomAnnotation {
    }

    public static TemporaryFolder publicJUnitClassRule = new TemporaryFolder();

    public static TemporaryFolder fqPublicJUnitClassRule = new TemporaryFolder();
}
