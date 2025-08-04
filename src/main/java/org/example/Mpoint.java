package org.example;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

/*
 * Created on 25/07/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Embeddable
public class Mpoint extends Point {
    @Embedded
    RealQuantity r;
    @Embedded
    RealQuantity q;
    public Mpoint(RealQuantity q, RealQuantity r) {
        this.q = q;
        this.r = r;
    }

    public Mpoint() {

    }
    public Mpoint(Mpoint other) {
        //this(new RealQuantity(other.q.v, other.q.unit), new RealQuantity(other.r.v, other.r.unit));
        this(other.q,other.r);
    }
}
