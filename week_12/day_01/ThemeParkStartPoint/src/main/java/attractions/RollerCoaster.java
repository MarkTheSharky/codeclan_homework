package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    double defaultPrice;

    public RollerCoaster(String name, int rating, double defaultPrice) {
        super(name, rating);
        this.defaultPrice = defaultPrice;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 13 && visitor.getHeight() >= 146) {
            return true;
        };
        return false;
    }

    public double defaultPrice() {
        return defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() <= 200) {
            return defaultPrice;
        } else {
            return defaultPrice * 2;
        }
    }
}
