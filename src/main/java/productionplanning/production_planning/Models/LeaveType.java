package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class LeaveType {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String leaveTypeId;

    private String leaveType;

    @OneToMany(mappedBy = "leaveTypeId")
    @JsonIgnoreProperties("leaveTypeId")
    private Set<WorkSchedule> workSchedule;

    public LeaveType(String leaveType, Set<WorkSchedule> workSchedule) {
        this.leaveType = leaveType;
        this.workSchedule = workSchedule;
    }

    public String getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(String leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Set<WorkSchedule> getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(Set<WorkSchedule> workSchedule) {
        this.workSchedule = workSchedule;
    }
}
