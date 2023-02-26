import java.io.Serializable;

public class Rating implements Serializable {

    private double form;
    private double marketValue;

    public Rating(double form, double marketValue){
        this.form = form;
        this.marketValue = marketValue;
    }

    public double getForm() {
        return form;
    }

    public void setForm(double form) {
        this.form = form;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}
