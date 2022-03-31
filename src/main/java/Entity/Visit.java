package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Visit extends BaseClass {
    @ManyToOne(fetch = FetchType.EAGER)
    private Doctor doctor;
    @ManyToOne(fetch = FetchType.EAGER)
    private Patient patient;
    private LocalTime time;

    public Visit(Integer id, Doctor doctor, Patient patient, LocalTime time) {
        super(id);
        this.doctor = doctor;
        this.patient = patient;
        this.time = time;
    }

}
