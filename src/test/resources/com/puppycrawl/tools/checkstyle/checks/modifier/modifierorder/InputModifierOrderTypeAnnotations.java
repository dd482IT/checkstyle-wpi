/*
ModifierOrder


*/

package com.puppycrawl.tools.checkstyle.checks.modifier.modifierorder;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class InputModifierOrderTypeAnnotations extends MyClass {

    // Simple type definitions with type annotations
    private String hello = "Hello, World!";
    private final String jdk = "JDK8";
    private String projectName = "Checkstyle";

    // We can use type Annotations with generic type arguments
    private Map.Entry entry;
    // Type annotations can also be applied to nested types
    private List<String> strings;

    // Constructors with type annotations
    {
        new Object();
    }

    static {
        new Object();
    }

    public void foo1() {
        new Object();
    }

    // Type annotations work with nested (non static) class constructors too
    public void foo2() {
        Object myObject = new Object();
        //myObject.new @TypeAnnotation Nested();
    }

    // Type casts
    public void foo3() {
        String myString = (String) new Object();

    }

    // Type annotations with method arguments
    private void foo4(final String parameterName) { }

    // Inheritance
    class MySerializableClass<T> implements Serializable {  }

    // Nested type annotations
    Map<String, List<String>> documents;

    // Apply type annotations to intersection types
    public <E extends Comparator<E> & Comparable> void foo5() {  }

    // Including parameter bounds and wildcard bounds
    class Folder<F extends File> { }
    Collection<? super File> c;
    List<? extends Comparable<T>> unchangeable;

    // Throwing exceptions
    void foo6() throws IOException { }

    // Type annotations in instanceof statements
    public void foo7() {
        boolean isNonNull = "string" instanceof String;

    }

    class Nested { }

    class T { }

    // Type annotation on method return type
    @Override
    public String toString() { return ""; }

    @Override
    public int hashCode() { return 1; }

    public int foo8() { return 1; }

    public boolean equals(Object obj) { return super.equals(obj); }

//    @TypeAnnotation void foo9() { } <-- Compiletime error:
                                        // void type cannot be annotated with type annotation

    @Override
    void foo10() {
        super.foo10();
    }
}

class MyClass {

    // It is annotation on method, but not on type!
    void foo10() {}
    private void foo11() {} // violation

    public MyClass() {}
    public MyClass(String name) {}
}

enum MyEnum {
    A;
}

interface IInterfacable {
    default String foo() {
        return null;
    }
}

@Target({
    ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER,
    ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@interface TypeAnnotation {
}

@interface MethodAnnotation {}

@interface ConstructorAnnotation {}
