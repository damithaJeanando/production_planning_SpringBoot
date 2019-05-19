package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LeaveType {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String leaveTypeId;

    private String leaveType;

    @OneToMany(mappedBy = "leaveType")
    @JsonIgnoreProperties("leaveType")
    private WorkSchedule workSchedule;

    public LeaveType(String leaveTypeId, String leaveType, WorkSchedule workSchedule) {
        this.leaveTypeId = leaveTypeId;
        this.leaveType = leaveType;
        this.workSchedule = workSchedule;
    }

    public String getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(String leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public LeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(WorkSchedule workSchedule) {
        this.workSchedule = workSchedule;
    }
}
