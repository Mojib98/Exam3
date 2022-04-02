package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Visit extends BaseClass {
    @ManyToOne(fetch = FetchType.EAGER)
    private Doctor doctor = new Doctor();
    @ManyToOne(fetch = FetchType.EAGER)
    private Patient patient=new Patient();
    private LocalTime time;



    public Visit(Integer id, Doctor doctor, Patient patient, LocalTime time) {
        super(id);
        this.doctor = doctor;
        this.patient = patient;
        this.time = time;
    }
    public Visit(Integer id, String name, String nameDoctor, LocalTime time){
        super(id);
        this.patient.setName(name);
        this.doctor.setName(nameDoctor);
        this.time=time;
    }

    @Override
    public String toString() {
        return  super.toString()+"\n\tVisit{" +
                "\n\tdoctor=" + doctor.getName() +
                "\n\t, patient=" + patient.getName() +
                "\n\t, time=" + time +
                "} \n" ;
    }
}
