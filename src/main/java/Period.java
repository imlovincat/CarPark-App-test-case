public class Period {

    final public int startHour;
    final public int endHour;

    public Period(int startHour, int endHour) {
        this.startHour = startHour;
        this.endHour = endHour;
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