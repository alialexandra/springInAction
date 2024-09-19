// tag::all[]
// tag::allButValidation[]
package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

// end::allButValidation[]
// tag::allButValidation[]

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Taco {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  // end::allButValidation[]
  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  // tag::allButValidation[]
  private String name;
  // end::allButValidation[]
  @Size(min=1, message="You must choose at least 1 ingredient")
  // tag::allButValidation[]
  private List<String> ingredients;

}
//end::allButValidation[]
//tag::end[]