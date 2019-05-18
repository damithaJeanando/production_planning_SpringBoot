package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class LeaveType {

    private String leaveType;

    @OneToMany(mappedBy = "leaveType")
    @JsonIgnoreProperties("leaveType")
    private WorkSchedule workSchedule;

    public LeaveType(String leaveType, WorkSchedule workSchedule) {
        this.leaveType = leaveType;
        this.workSchedule = workSchedule;
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
