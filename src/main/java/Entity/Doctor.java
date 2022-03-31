package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalTime;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Doctor extends BaseClass{
    private String name,specialty;
    private Integer capacity;
    @ManyToOne
    private Clinic clinicSet;
    @OneToMany(mappedBy = "doctor")
    private Set<Prescription> prescriptions;
    private LocalTime startWork;
    private LocalTime endWork;
}
