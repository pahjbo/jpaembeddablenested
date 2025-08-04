package org.example;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Created on 22/07/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Entity
public class AnObject extends Base {
   public AnObject( Mpoint e) {
      this.e = e;

   }

   public AnObject( AnObject other) {
      this(new Mpoint((Mpoint) other.e), other.aq, other.astring);

   }

   RealQuantity aq;

   public AnObject(Mpoint e, RealQuantity aq, String astring) {
      super(astring);
      this.aq = aq;
      this.e = e;
   }

   public void setE(Mpoint e) {
      this.e = e;
   }

   public Mpoint getE() {
      return (Mpoint) e;
   }





   @Embedded
   @AttributeOverrides({
         @AttributeOverride(name = "x.v", column = @Column(name = "t0_x")),
         @AttributeOverride(name = "x.unit.u", column = @Column(name = "t0_x_unit")),
         @AttributeOverride(name = "y.v", column = @Column(name = "t0_y")),
         @AttributeOverride(name = "y.unit.u", column = @Column(name = "t0_y_unit")),
         @AttributeOverride(name = "z.v", column = @Column(name = "t0_z")),
         @AttributeOverride(name = "z.unit.u", column = @Column(name = "t0_z_unit")),
         @AttributeOverride(name = "datemjd", column = @Column(name = "t0_datemjd")),
         @AttributeOverride(name = "mjd", column = @Column(name = "t0_mjd")),
         @AttributeOverride(name = "jd", column = @Column(name = "t0_jd")),
         @AttributeOverride(name = "date", column = @Column(name = "t0_date")),
         @AttributeOverride(name = "r.v", column = @Column(name = "t0_r_value")),
         @AttributeOverride(name = "r.unit.u", column = @Column(name = "t0_r_unit")),
         @AttributeOverride(name = "q.v", column = @Column(name = "t0_q_value")),
         @AttributeOverride(name = "q.unit.u", column = @Column(name = "t0_q_unit"))
   })   Coordinate e;


   public AnObject() {

   }


   @Override
   public Base copyme() {
      return new AnObject(this);
   }
}
