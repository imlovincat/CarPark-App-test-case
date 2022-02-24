import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

class RateTestTask {

    @org.junit.jupiter.api.Test
    void calculate() {
    }

    /**
     * Testcase #1
     * BigDecimal hourlyReducedRate = -1
     * Partition: hourlyReducedRate >= 0
     * expert @throws IllegalAccessException
     */
    @Test
    public void testcase1() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(-1);
        Period r1 = new Period(5,9);
        Period r2 = new Period(13,14);
        Period r3 = new Period(18,22);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        reducedPeriods.add(r2);
        reducedPeriods.add(r3);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

    /**
     * Testcase #2
     * BigDecimal hourlyNormalRate = -20
     * Partition: hourlyNormalRate >= 0
     * expert @throws IllegalAccessException
     */
    @Test
    public void testcase2() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyNormalRate = new BigDecimal(-20);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period r1 = new Period(5,9);
        Period r2 = new Period(13,14);
        Period r3 = new Period(18,22);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        reducedPeriods.add(r2);
        reducedPeriods.add(r3);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

    /**
     * Testcase #3
     * BigDecimal hourlyNormalRate = 0
     * BigDecimal hourlyReducedRate = 0
     * Partition: hourlyNormalRate >= 0 and hourlyReduced >= 0
     * expert instance of Rate is generated
     */
    @Test
    public void testcase3() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyNormalRate = new BigDecimal(0);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        Period r1 = new Period(5,9);
        Period r2 = new Period(13,14);
        Period r3 = new Period(18,22);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        reducedPeriods.add(r2);
        reducedPeriods.add(r3);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

    /**
     * Testcase #4
     * BigDecimal hourlyNormalRate = 5
     * BigDecimal hourlyReducedRate = 3
     * Partition: hourlyNormalRate >= 0 and hourlyReducedRate >= 0
     * expert instance of Rate is generated
     */
    @Test
    public void testcase4() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period r1 = new Period(5,9);
        Period r2 = new Period(13,14);
        Period r3 = new Period(18,22);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        reducedPeriods.add(r2);
        reducedPeriods.add(r3);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

    /**
     * Testcase #5
     * BigDecimal hourlyNormalRate = 1
     * * BigDecimal hourlyReducedRate = 2
     * Partition: hourlyNormalRate >= hourlyReducedRate
     * expert @throws IllegalAccessException
     */
    @Test
    public void testcase5() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyNormalRate = new BigDecimal(1);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        Period r1 = new Period(5,9);
        Period r2 = new Period(13,14);
        Period r3 = new Period(18,22);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        reducedPeriods.add(r2);
        reducedPeriods.add(r3);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

    /**
     * Testcase #6
     * BigDecimal hourlyReducedRate = 1
     * BigDecimal hourlyNormalRate = 1
     * Partition: hourlyNormalRate >= hourlyReducedRate
     * expert instance of Rate is generated
     */
    @Test
    public void testcase6() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyReducedRate = new BigDecimal(1);
        BigDecimal hourlyNormalRate = new BigDecimal(1);
        Period r1 = new Period(5,9);
        Period r2 = new Period(13,14);
        Period r3 = new Period(18,22);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        reducedPeriods.add(r2);
        reducedPeriods.add(r3);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

    /**
     * Testcase #7
     * ArrayList<Period> reducedPeriods = [(-1,3)]
     * Partition: startHour >= 0 and startHour <=24
     * expert @throws IllegalAccessException
     */
    @Test
    public void testcase7() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period r1 = new Period(-1,3);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

    /**
     * Testcase #8
     * ArrayList<Period> reducedPeriods = [(-22,25)]
     * Partition: hourlyNormalRate > hourlyReducedRate
     * expert @throws IllegalAccessException
     */
    @Test
    public void testcase8() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("STUDENT");
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period r1 = new Period(-1,3);
        Period n1 = new Period(9,13);
        Period n2 = new Period(14,18);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(r1);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(n1);
        normalPeriods.add(n2);
        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
        Assertions.assertNotNull(rate);
    }

}