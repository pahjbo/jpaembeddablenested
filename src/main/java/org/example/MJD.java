package org.example;


import jakarta.persistence.Embeddable;

/*
 * Created on 22/07/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Embeddable
public class MJD extends TimeInstant{
   double datemjd;

   public MJD(double date) {
      this.datemjd = date;
   }

   public MJD() {

   }
}
