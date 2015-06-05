package task1;

/**
 * Class consists comparator for Units by Power decrement sorting
 * @author Viacheslav Chichin
 * @version 1.0  June 3, 2015.
 */
public class UnitPowerComparator implements java.util.Comparator<Unit>{
        public int compare(Unit un1, Unit un2) {
            return (un1.getUnitPower() - un2.getUnitPower());
        }

}
