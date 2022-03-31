package Entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
public class Patient extends BaseClass {
    private String name;
    @OneToMany(mappedBy = "patient")
    private Set<Prescription> prescriptions;
}
