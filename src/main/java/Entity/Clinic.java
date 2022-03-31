package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Clinic extends BaseClass{
    private String nameClinic;
    @OneToMany(mappedBy ="clinicSet",fetch = FetchType.EAGER)
    private List<Doctor> doctor;

    public Clinic(Integer id, String nameClinic) {
        super(id);
        this.nameClinic = nameClinic;
    }
}
