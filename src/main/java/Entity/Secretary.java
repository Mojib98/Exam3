package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Secretary extends BaseClass {
    private String name;
    private Integer passcode;

}
