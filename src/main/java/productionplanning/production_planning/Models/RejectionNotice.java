package productionplanning.production_planning.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RejectionNotice {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String rejectionNoticeId;

    private String getRejectionReason;
    private Date noticeDate;
    private String remedyAction;

    @OneToOne
    private OrderItem orderItemId;

    @ManyToOne
    private RNStatus rnStatus;

    public RejectionNotice(String getRejectionReason, Date noticeDate, String remedyAction, OrderItem orderItemId,
                           RNStatus rnStatus) {
        this.getRejectionReason = getRejectionReason;
        this.noticeDate = noticeDate;
        this.remedyAction = remedyAction;
        this.orderItemId = orderItemId;
        this.rnStatus = rnStatus;
    }

    public String getRejectionNoticeId() {
        return rejectionNoticeId;
    }

    public void setRejectionNoticeId(String rejectionNoticeId) {
        this.rejectionNoticeId = rejectionNoticeId;
    }

    public String getGetRejectionReason() {
        return getRejectionReason;
    }

    public void setGetRejectionReason(String getRejectionReason) {
        this.getRejectionReason = getRejectionReason;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getRemedyAction() {
        return remedyAction;
    }

    public void setRemedyAction(String remedyAction) {
        this.remedyAction = remedyAction;
    }

    public OrderItem getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(OrderItem orderItemId) {
        this.orderItemId = orderItemId;
    }

    public RNStatus getRnStatus() {
        return rnStatus;
    }

    public void setRnStatus(RNStatus rnStatus) {
        this.rnStatus = rnStatus;
    }
}
