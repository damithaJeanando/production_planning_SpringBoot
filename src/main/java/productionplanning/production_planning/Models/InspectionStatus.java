package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class InspectionStatus {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String isId;

    private String inspectionStatus;

    @OneToMany(mappedBy = "inspectionStatus")
    @JsonIgnoreProperties("inspectionStatus")
    private Set<Inspection> inspections;

    public InspectionStatus(String isId, String inspectionStatus, Set<Inspection> inspections) {
        this.isId = isId;
        this.inspectionStatus = inspectionStatus;
        this.inspections = inspections;
    }

    public String getIsId() {
        return isId;
    }

    public void setIsId(String isId) {
        this.isId = isId;
    }

    public String getInspectionStatus() {
        return inspectionStatus;
    }

    public void setInspectionStatus(String inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
    }

    public Set<Inspection> getInspections() {
        return inspections;
    }

    public void setInspections(Set<Inspection> inspections) {
        this.inspections = inspections;
    }
}
