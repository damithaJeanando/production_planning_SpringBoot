package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Inspection {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    String inspectionId;

    Timestamp dateTime;

    @ManyToOne
    private Employee empId;

    @ManyToOne
    private InspectionStatus inspectionStatus;

    @OneToOne
    private OrderItem orderItemId;

    public Inspection(Timestamp dateTime, Employee empId, InspectionStatus inspectionStatus, OrderItem orderItemId) {
        this.dateTime = dateTime;
        this.empId = empId;
        this.inspectionStatus = inspectionStatus;
        this.orderItemId = orderItemId;

    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Employee getEmpId() {
        return empId;
    }

    public void setEmpId(Employee empId) {
        this.empId = empId;
    }

    public InspectionStatus getInspectionStatus() {
        return inspectionStatus;
    }

    public void setInspectionStatus(InspectionStatus inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
    }

    public OrderItem getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(OrderItem orderItemId) {
        this.orderItemId = orderItemId;
    }
}
