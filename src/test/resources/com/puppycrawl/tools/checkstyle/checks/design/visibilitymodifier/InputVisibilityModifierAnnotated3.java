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
ignoreAnnotationCanonicalNames =


*/

package com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier;

import com.google.common.annotations.VisibleForTesting;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

public class InputVisibilityModifierAnnotated3 {
    public TemporaryFolder publicJUnitRule = new TemporaryFolder(); // violation

    public TemporaryFolder fqPublicJUnitRule = new TemporaryFolder(); // violation

    public String googleCommonsAnnotatedPublic; // violation

    String googleCommonsAnnotatedPackage; // violation

    protected String googleCommonsAnnotatedProtected; // violation

    public String fqGoogleCommonsAnnotatedPublic; // violation

    String fqGoogleCommonsAnnotatedPackage; // violation

    protected String fqGoogleCommonsAnnotatedProtected; // violation

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

    public static TemporaryFolder publicJUnitClassRule = new TemporaryFolder(); // violation

    public static TemporaryFolder fqPublicJUnitClassRule = new TemporaryFolder(); // violation
}
