package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;
import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Prescription extends BaseClass{
    private String medical;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    private Date date;
    private Boolean expired;

    public Prescription(Integer id, Boolean expired) {
        super(id);
        this.expired = expired;
    }

    public Prescription(Integer id, String medical, Patient patient, Doctor doctor, Date date, Boolean expired) {
        super(id);
        this.medical = medical;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.expired = expired;
    }
}
