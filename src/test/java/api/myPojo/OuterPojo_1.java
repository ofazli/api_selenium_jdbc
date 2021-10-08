package api.myPojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OuterPojo_1 {
    private Integer bookingid;
    private OuterPojo booking;

    public OuterPojo_1(Integer bookingid, OuterPojo booking) {
        this.bookingid = bookingid;
        this.booking = booking;
    }
    public OuterPojo_1() {
    }
    public Integer getBookingid() {
        return bookingid;
    }
    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }
    public OuterPojo getBooking() {
        return booking;
    }
    public void setBooking(OuterPojo booking) {
        this.booking = booking;
    }
    @Override
    public String toString() {
        return "OuterPojo_1{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }
}
