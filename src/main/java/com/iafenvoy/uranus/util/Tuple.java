package com.iafenvoy.uranus.util;

/**
 * Replacement for net.minecraft.util.Tuple, which was removed in Minecraft 26.3.
 * Added by the local 26.3 port (not upstream).
 */
public class Tuple<A, B> {
    private A a;
    private B b;

    public Tuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() { return this.a; }
    public void setA(A a) { this.a = a; }
    public B getB() { return this.b; }
    public void setB(B b) { this.b = b; }
}
