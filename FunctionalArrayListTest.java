
/**
 *
 * @author pedro
 */
public class FunctionalArrayListTest {

    public static void main(String[] args) {
        FunctionalArrayListTest test = new FunctionalArrayListTest();
        test.run();
    }

    public void run() {
        FunctionalArrayList list = new FunctionalArrayList();
        System.out.println(list.head().getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, head of list EMPTY_STRUCTURE" : "FAIL, head of list is not EMPTY_STRUCTURE");
        System.out.println(list.rest().isEmpty() ? "PASS, rest of the list is empty" : "FAIL, rest of the list is not empty");
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.head().getReturnValue() == "A" ? "PASS, head of list is A" : "FAIL, head of list is not A");
        System.out.println(list.rest().size() == 4 ? "PASS, size of rest is 4" : "FAIL, size of rest is not 4");
        for (int i = 1; i < list.size(); i++) {
            Object l = list.get(i).getReturnValue();
            Object r = list.rest().get(i-1).getReturnValue();
            System.out.println(l.equals(r) ? "PASS, " + l + " equals to " + r : "FAIL, " + l + " not equals to " + r);
        }
    }
}
