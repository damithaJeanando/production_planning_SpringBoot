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
    private Product productId;

    @OneToMany(mappedBy = "designId")
    @JsonIgnoreProperties("designId")
    private Set<PDItem> pdItems;

    public ProductDesign(int requiredWorkHours, Product productId, Set<PDItem> pdItems) {
        this.requiredWorkHours = requiredWorkHours;
        this.productId = productId;
        this.pdItems = pdItems;
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

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Set<PDItem> getPdItems() {
        return pdItems;
    }

    public void setPdItems(Set<PDItem> pdItems) {
        this.pdItems = pdItems;
    }
}
