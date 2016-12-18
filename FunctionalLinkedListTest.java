/**
 * Test FunctionalLinkedList
 * @author pedro
 */
public class FunctionalLinkedListTest {

    public static void main(String[] args) {
        FunctionalLinkedListTest test = new FunctionalLinkedListTest();
        test.run();
    }

    public void run() {
        FunctionalLinkedList list = new FunctionalLinkedList();
        System.out.println(list.head().getError() == ErrorMessage.EMPTY_STRUCTURE ? "Pass, head of list EMPTY_STRUCTURE" : "Fail, head of list is not EMPTY_STRUCTURE");
        System.out.println(list.rest().isEmpty() ? "Pass, rest of the list is empty" : "Fail, rest of the list is not empty");
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.head().getReturnValue() == "A" ? "Pass, head of list is A" : "Fail, head of list is not A");
        System.out.println(list.rest().size() == 4 ? "Pass, size of rest is 4" : "Fail, size of rest is not 4");
        for (int i = 1; i < list.size(); i++) {
            Object l = list.get(i).getReturnValue();
            Object r = list.rest().get(i-1).getReturnValue();
            System.out.println(l.equals(r) ? "Pass, " + l + " equals to " + r : "Fail, " + l + " not equals to " + r);
        }
    }
}
