package productionplanning.production_planning.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class BillItemStatus {

    private String billItemStatus;

    @OneToMany(mappedBy = "billItemStatus")
    @JsonIgnoreProperties("billItemStatus")
    private Set<BillItem> billItems;

    public BillItemStatus(String billItemStatus, Set<BillItem> billItems) {
        this.billItemStatus = billItemStatus;
        this.billItems = billItems;
    }

    public String getBillItemStatus() {
        return billItemStatus;
    }

    public void setBillItemStatus(String billItemStatus) {
        this.billItemStatus = billItemStatus;
    }

    public Set<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(Set<BillItem> billItems) {
        this.billItems = billItems;
    }
}
