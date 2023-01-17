package com.puppycrawl.tools.checkstyle.grammar.antlr4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class InputAntlr4AstRegressionNestedTypeParametersAndArrayDeclarators {
    class Outer {
        class Inner {
            class Inner2 {
            }
        }

        class GInner<X> {
            class GInner2<Y, Z> {}
        }

        class Static {}
        class GStatic<X, Y> {
            class GStatic2<Z> {}
        }
    }

    class Test1 {
        Outer . GInner<MyList<Object[][]>>
                .GInner2<Integer, Object>[][] f4arrtop;
    }
}

class MyList<K> { }

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface A1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface B1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface C1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface D1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface E1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface F1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface G1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface H1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface I1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface J1 { }
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface K1 { }
