package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductDesign {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String designId;

    private int requiredWorkHours;

    @OneToOne
    private Product productid;

    @OneToMany(mappedBy = "designId")
    @JsonIgnoreProperties("designId")
    private Set<ProductDesignItem> productDesignItems;

    public ProductDesign(int requiredWorkHours, Product productid, Set<ProductDesignItem> productDesignItems) {
        this.requiredWorkHours = requiredWorkHours;
        this.productid = productid;
        this.productDesignItems = productDesignItems;
    }

    public String getDesignId() {
        return designId;
    }

    public void setDesignId(String designId) {
        this.designId = designId;
    }

    public int getRequiredWorkHours() {
        return requiredWorkHours;
    }

    public void setRequiredWorkHours(int requiredWorkHours) {
        this.requiredWorkHours = requiredWorkHours;
    }

    public Product getProductid() {
        return productid;
    }

    public void setProductid(Product productid) {
        this.productid = productid;
    }

    public Set<ProductDesignItem> getProductDesignItems() {
        return productDesignItems;
    }

    public void setProductDesignItems(Set<ProductDesignItem> productDesignItems) {
        this.productDesignItems = productDesignItems;
    }
}
