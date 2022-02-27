/**
 * Chi Ieong Ng C00223421
 * Date: 25/02/2022
 */

package cm;

public class Period {

    final public int startHour;
    final public int endHour;

    public Period(int startHour, int endHour) {

        /**
         * OCL expression
         * context Period
         * inv LegalValues: self.startHour >= 0 and self.startHour <= 24 and self.endHour >= 0 and self.endHour <= 24
         * inv PositiveDuration: self.startHour < self.endHour
         */

        if (startHour >= 0 && startHour <= 24 && endHour >= 0 && endHour <= 24 && startHour < endHour) {
            this.startHour = startHour;
            this.endHour = endHour;
        }
        else {
            throw new IllegalArgumentException("period class error");
        }
    };

    public int duration() {
        //because of the rule startHour < endHour
        //so it will not count for if parking past from 23:59:59 to 00:00:00 or more
        //example start time at 23:00 and end time at 07:00, it is not valid
        return endHour - startHour;
    };

    public Boolean overlaps(Period period) {
        if ( period.startHour >= this.endHour || period.endHour <= this.startHour) {
            return false;
        }
        return true;
    }
}
