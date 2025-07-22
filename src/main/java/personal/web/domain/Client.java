package personal.web.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;
    private String address;

    @OneToMany(mappedBy = "client")
    private List<Orders> orders;

}
