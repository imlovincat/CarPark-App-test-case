/**
 * Chi Ieong Ng C00223421
 * Date: 25/02/2022
 */

import java.math.BigDecimal;
import java.util.ArrayList;

public class Rate {
    //private CarParkKind kind;
    private CarParkKind kind;
    private BigDecimal hourlyNormalRate;
    private BigDecimal hourlyReducedRate;
    private ArrayList<Period> reducedPeriods;
    private ArrayList<Period> normalPeriods;

    public Rate(CarParkKind kind,BigDecimal hourlyNormalRate,BigDecimal hourlyReducedRate,ArrayList<Period> reducedPeriods,ArrayList<Period> normalPeriods) {

        //all parameters can not be "null"
        if (kind == null || hourlyNormalRate == null || hourlyReducedRate == null || reducedPeriods == null || normalPeriods ==null) {
            throw new IllegalArgumentException("error in no value can be null");
        }

         //the normalRate and reducedRate are greater or equal to 0
        if (hourlyNormalRate.compareTo(BigDecimal.ZERO) < 0 || hourlyReducedRate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("error in Rate (less than 0)");
        }
        //the normalRate has to be greater or equal to the reducedRate
        if (hourlyNormalRate.compareTo(hourlyReducedRate) < 0) {
            throw new IllegalArgumentException("error in Rate (Normal Rate is less than Reduced Rate");
        }
        //inv LegalValues: self.startHour >= 0 and self.startHour <= 24 and self.endHour >= 0 and self.endHour <= 24
        //inv PositiveDuration: self.startHour < self.endHour
        for (int i = 0; i < reducedPeriods.size(); i++) {
            int startHour = reducedPeriods.get(i).startHour;
            int endHour = reducedPeriods.get(i).endHour;
            if (!(startHour >= 0 && startHour <=24 && endHour >= 0 && endHour <= 24)) {
                throw new IllegalArgumentException("error in Period (LegalValues)");
            }
            if (!(startHour < endHour)) {
                throw new IllegalArgumentException("error in Period (PositiveDuration)");
            }
        }
        for (int i = 0; i < normalPeriods.size(); i++) {
            int startHour = normalPeriods.get(i).startHour;
            int endHour = normalPeriods.get(i).endHour;
            if (!(startHour >= 0 && startHour <=24 && endHour >= 0 && endHour <= 24)) {
                throw new IllegalArgumentException("error in Period (LegalValues)");
            }
            if (!(startHour < endHour)) {
                throw new IllegalArgumentException("error in Period (PositiveDuration)");
            }
        }
        //the reducedPeriods and normalPeriods must be valid, i.e.
        //a collection of periods must not overlap
        for (int i = 0; i < normalPeriods.size()-1; i++) {
            if (normalPeriods.get(i).overlaps(normalPeriods.get(i+1))) {
                throw new IllegalArgumentException("error in normalPeriods overlaps");
            };
        }
        for (int i = 0; i < reducedPeriods.size()-1; i++) {
            if (reducedPeriods.get(i).overlaps(reducedPeriods.get(i+1))) {
                throw new IllegalArgumentException("error in reducedPeriods overlaps");
            };
        }
        //the two collections must not overlap themselves
        for (int i = 0; i < normalPeriods.size(); i++) {
            for (int j = 0; j < reducedPeriods.size(); j++) {
                if (normalPeriods.get(i).overlaps(reducedPeriods.get(j))) {
                    throw new IllegalArgumentException("error in 2 collections of Periods overlaps");
                }
            }
        }

        this.kind = kind;
        this.hourlyNormalRate = hourlyNormalRate;
        this.hourlyReducedRate = hourlyReducedRate;
        this.reducedPeriods = reducedPeriods;
        this.normalPeriods = normalPeriods;
    };

    public BigDecimal calculate(Period periodStay) {

        BigDecimal cost = new BigDecimal("0.00");

        for (int i = periodStay.startHour; i < periodStay.endHour; i++) {
            //reducedPeroids and reducedRates calculations
            for (int j = 0; j < this.reducedPeriods.size(); j++) {
                for (int k = this.reducedPeriods.get(j).startHour; k < this.reducedPeriods.get(j).endHour; k++) {
                    if (k == i) {
                        cost = cost.add(this.hourlyReducedRate);
                    }
                }
            }
            //normalPeroids and normalRates calculations
            for (int j = 0; j < this.normalPeriods.size(); j++) {
                for (int k = this.normalPeriods.get(j).startHour; k < this.normalPeriods.get(j).endHour; k++) {
                    if (k == i) {
                        cost = cost.add(this.hourlyNormalRate);
                    }
                }
            }

        }
        return cost;
    };
}