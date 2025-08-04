package org.example;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

/*
 * Created on 22/07/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Embeddable
public class GenericPoint extends Point {
   @Embedded
   RealQuantity x;
   @Embedded
   RealQuantity y;
   @Embedded
   RealQuantity z;

   public GenericPoint(RealQuantity x, RealQuantity y, RealQuantity z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public GenericPoint() {

   }
}
