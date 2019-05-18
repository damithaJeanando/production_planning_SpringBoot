package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class WorkSchedule {


    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String scheduleId;


    private Timestamp startDate;
    private Timestamp endDate;
    private Date date;

    @ManyToOne
    private Employee empId;

    @ManyToOne
    private CapacityPlan planId;

    @ManyToOne
    private LeaveType leaveType;

    @ManyToOne
    private OrderItem orderItemId;

    public WorkSchedule(Timestamp startDate, Timestamp endDate, Date date, Employee empId,
                        CapacityPlan planId, LeaveType leaveType, OrderItem orderItemId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.date = date;
        this.empId = empId;
        this.planId = planId;
        this.leaveType = leaveType;
        this.orderItemId = orderItemId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmpId() {
        return empId;
    }

    public void setEmpId(Employee empId) {
        this.empId = empId;
    }

    public CapacityPlan getPlanId() {
        return planId;
    }

    public void setPlanId(CapacityPlan planId) {
        this.planId = planId;
    }

    public LeaveType getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

    public OrderItem getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(OrderItem orderItemId) {
        this.orderItemId = orderItemId;
    }
}
