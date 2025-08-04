package org.example;


import jakarta.persistence.*;

import java.util.List;

/*
 * Created on 01/08/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Entity
public class TopLevel {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false)
   private Long id;

   public TopLevel(List<Base> another) {
      this.another = another;
   }

   public TopLevel(TopLevel other) {
       this(other.another.stream().map(s->s.copyme()).toList());
   }


   @jakarta.persistence.OneToMany(  cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.LAZY, targetEntity= Base.class)
   List<Base> another;

   public TopLevel() {

   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
