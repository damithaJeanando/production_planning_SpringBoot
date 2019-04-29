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


}
