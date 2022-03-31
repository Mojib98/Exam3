package Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
public class Prescription extends BaseClass{
    private String medical;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    private Date date;


}
