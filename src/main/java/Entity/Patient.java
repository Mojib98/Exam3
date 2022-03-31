package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Patient extends BaseClass {
    private String name;
    @OneToMany(mappedBy = "patient",fetch = FetchType.EAGER)
    private Set<Prescription> prescriptions;

    public Patient(Integer id, String name, Set<Prescription> prescriptions) {
        super(id);
        this.name = name;
        this.prescriptions = prescriptions;
    }

}
