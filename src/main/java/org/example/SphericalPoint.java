package org.example;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

/*
 * Created on 22/07/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Embeddable
public class SphericalPoint extends Point {
   @Embedded
   private  RealQuantity a;
   @Embedded
   private  RealQuantity b;
   @Embedded
   private  RealQuantity c;

   public SphericalPoint(RealQuantity x, RealQuantity y, RealQuantity z) {
      this.a = x;
      this.b = y;
      this.c = z;
   }

   public SphericalPoint() {

   }
}
