package org.example;


import jakarta.persistence.*;

/*
 * Created on 25/07/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@jakarta.persistence.DiscriminatorColumn( name = "Ob_SUBTYPE", discriminatorType = jakarta.persistence.DiscriminatorType.STRING, length = 64)
public abstract class Base {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   protected Long id;

   protected String astring;

   public Base(String astring) {
      this.astring = astring;
   }

   public Base(Base other) {
      this(other.astring);
   }

   public Base() {

   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public abstract Base copyme();
}
