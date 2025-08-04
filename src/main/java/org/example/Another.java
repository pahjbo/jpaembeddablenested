package org.example;


import jakarta.persistence.Entity;

/*
 * Created on 31/07/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Entity
public class Another extends Base{

   public Another() {

   }

   public Another(Another another) {
      super(another);
   }

   @Override
   public Base copyme() {
      return new Another(this);
   }
}
