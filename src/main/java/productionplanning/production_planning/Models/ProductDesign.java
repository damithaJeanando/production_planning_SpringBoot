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
    private Set<PDItem> PDItems;

    public ProductDesign(int requiredWorkHours, Product productid, Set<PDItem> PDItems) {
        this.requiredWorkHours = requiredWorkHours;
        this.productid = productid;
        this.PDItems = PDItems;
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

    public Set<PDItem> getPDItems() {
        return PDItems;
    }

    public void setPDItems(Set<PDItem> PDItems) {
        this.PDItems = PDItems;
    }
}
