package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

//@Data// using this annotation can cause perfoamrce issues
// better to add speratley getter and setter annotations alongise your own
// implementation of equals, hashcode and so on
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
// if i delete force=true, some variables might not be initialised error...
// if i deltete final then is ok
//
@Entity
public class Ingredient {

  @Id
  private final String id;

  private final String name;
  private final Type type;


  public static enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Ingredient that = (Ingredient) o;
    return id != null && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
