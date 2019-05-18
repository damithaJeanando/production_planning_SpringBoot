package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class ProductDesignItem {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String designItemId;

    private int quantity;

    @ManyToOne
    private ProductDesign productDesign;

    @OneToOne
    private RawMaterials materialId;

    public ProductDesignItem(int quantity, ProductDesign productDesign, RawMaterials materialId) {
        this.quantity = quantity;
        this.productDesign = productDesign;
        this.materialId = materialId;
    }

    public String getDesignItemId() {
        return designItemId;
    }

    public void setDesignItemId(String designItemId) {
        this.designItemId = designItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDesign getProductDesign() {
        return productDesign;
    }

    public void setProductDesign(ProductDesign productDesign) {
        this.productDesign = productDesign;
    }

    public RawMaterials getMaterialId() {
        return materialId;
    }

    public void setMaterialId(RawMaterials materialId) {
        this.materialId = materialId;
    }
}
