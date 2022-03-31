package Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Doctor extends BaseClass{
    private String name,specialty;
    private Integer capacity;
    @ManyToOne
    private Clinic clinicSet;
    @OneToMany(mappedBy = "doctor")
    private Set<Prescription> prescriptions;
}
