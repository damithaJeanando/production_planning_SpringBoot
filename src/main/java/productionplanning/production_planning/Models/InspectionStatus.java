package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class InspectionStatus {

    private String inspectionStatus;

    @OneToMany(mappedBy = "inspectionStatus")
    @JsonIgnoreProperties("inspectionStatus")
    private Set<Inspection> inspections;

    public InspectionStatus(String inspectionStatus, Set<Inspection> inspections) {
        this.inspectionStatus = inspectionStatus;
        this.inspections = inspections;
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
