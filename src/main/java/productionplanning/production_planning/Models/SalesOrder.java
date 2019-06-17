package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class SalesOrder {


//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name="system-uuid",strategy = "uuid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ord_id;

    private Date orderDeadline;
    private Date date;
    private Date dele_date;

    @OneToMany(mappedBy = "salesOrderId")
    @JsonIgnoreProperties("salesOrderId")
    private Set<OrderItem> products;

    private String completionDate;
    private String orderStatus;

    public SalesOrder() {
    }

    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public Date getOrderDeadline() {
        return orderDeadline;
    }

    public void setOrderDeadline(Date orderDeadline) {
        this.orderDeadline = orderDeadline;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDele_date() {
        return dele_date;
    }

    public void setDele_date(Date dele_date) {
        this.dele_date = dele_date;
    }

    public Set<OrderItem> getProducts() {
        return products;
    }

    public void setProducts(Set<OrderItem> products) {
        this.products = products;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
