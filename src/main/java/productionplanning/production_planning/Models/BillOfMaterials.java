package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class BillOfMaterials {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String bomId;

    private Date createdDate;

    @OneToOne
    private OrderItem orderItemId;

    @OneToMany(mappedBy = "bomId")
    @JsonIgnoreProperties("bomId")
    private Set<BillItem> billItems;

    public BillOfMaterials(String bomId, Date createdDate, OrderItem orderItemId, Set<BillItem> billItems) {
        this.bomId = bomId;
        this.createdDate = createdDate;
        this.orderItemId = orderItemId;
        this.billItems = billItems;
    }

    public String getBomId() {
        return bomId;
    }

    public void setBomId(String bomId) {
        this.bomId = bomId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public OrderItem getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(OrderItem orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Set<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(Set<BillItem> billItems) {
        this.billItems = billItems;
    }
}
