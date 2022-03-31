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
    private LocalTime startWork;
    private LocalTime endWork;
    @ManyToOne
    private Clinic clinicSet;
    @OneToMany(mappedBy = "doctor")
    private Set<Prescription> prescriptions;

    public Doctor(String name, String specialty, Integer capacity, LocalTime startWork, LocalTime endWork, Clinic clinicSet) {
        this.name = name;
        this.specialty = specialty;
        this.capacity = capacity;
        this.startWork = startWork;
        this.endWork = endWork;
        this.clinicSet = clinicSet;
    }
    public void changeTime(){
        this.startWork.plusMinutes(15L);
    }
}
