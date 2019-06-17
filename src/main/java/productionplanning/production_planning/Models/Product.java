package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Product {

//
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name="system-uuid",strategy = "uuid")
    @Id
    private int productId;

    private String productName;

    @OneToMany(mappedBy = "productId")
    @JsonIgnoreProperties("productId")
    private Set<OrderItem> orderItems;



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
