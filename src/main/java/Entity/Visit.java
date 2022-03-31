package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Visit extends BaseClass {
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Patient patient;
    private LocalTime time;
}
