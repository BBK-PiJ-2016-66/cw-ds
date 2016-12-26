
/**
 * Test LinkedList
 *
 * @author pedro
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedListTest test = new LinkedListTest();
        test.run();
    }

    public void run() {
        System.out.println("Create new empty LinkedList...");
        LinkedList list = new LinkedList();
        System.out.println(list.isEmpty() ? "PASS, list is empty" : "FAIL, list is not empty");
        System.out.println(list.size() == 0 ? "PASS, list size is 0" : "FAIL, list size is not 0");

        System.out.println("Try to get index 0...");
        ReturnObject item = list.get(0);
        System.out.println(item.hasError() ? "PASS, item has an error" : "FAIL, item does not have an error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, error is EMPTY_STRUCTURE" : "FAIL, error is not EMPTY_STRUCTURE");

        System.out.println("Try to remove index 0...");
        item = list.remove(0);
        System.out.println(item.hasError() ? "PASS, item has an error" : "FAIL, item does not have an error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, error is EMPTY_STRUCTURE" : "FAIL, error is not EMPTY_STRUCTURE");

        System.out.println("Try to add a new item with index 0...");
        item = list.add(0, new Object());
        System.out.println(item.hasError() ? "PASS, item has an error" : "FAIL, item does not have an error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, error is EMPTY_STRUCTURE" : "FAIL, error is not EMPTY_STRUCTURE");

        System.out.println("Try to add a new item to the end of the list...");
        item = list.add("A");
        System.out.println(item.hasError() == false ? "PASS, item does not have an error" : "FAIL, item has an error");
        System.out.println(list.size() == 1 ? "PASS, list size is 1" : "FAIL, list size is not 1");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "PASS, list index 0 is A" : "FAIL, list index 0 is not A");

        System.out.println("Try to add another new item to the end of the list...");
        item = list.add("B");
        System.out.println(item.hasError() == false ? "PASS, item does not have an error" : "FAIL, item has an error");
        System.out.println(list.size() == 2 ? "PASS, list size is 2" : "FAIL, list size is not 2");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "PASS, list index 0 is A" : "FAIL, list index 0 is not A");
        System.out.println(list.get(1).getReturnValue().equals("B") ? "PASS, list index 1 is B" : "FAIL, list index 1 is not B");

        System.out.println("Try to add even another new item to the end of the list...");
        item = list.add("C");
        System.out.println(item.hasError() == false ? "PASS, item does not have an error" : "FAIL, item has an error");
        System.out.println(list.size() == 3 ? "PASS, list size is 3" : "FAIL, list size is not 3");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "PASS, list index 0 is A" : "FAIL, list index 0 is not A");
        System.out.println(list.get(1).getReturnValue().equals("B") ? "PASS, list index 1 is B" : "FAIL, list index 1 is not B");
        System.out.println(list.get(2).getReturnValue().equals("C") ? "PASS, list index 2 is C" : "FAIL, list index 2 is not C");

        System.out.println("Try to add a new item to index 1...");
        item = list.add(1, "D");
        System.out.println(item.hasError() == false ? "PASS, item does not have an error" : "FAIL, item has an error");
        System.out.println(list.size() == 4 ? "PASS, list size is 4" : "FAIL, list size is not 4");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "PASS, list index 0 is A" : "FAIL, list index 0 is not A, it is " + list.get(0).getReturnValue());
        System.out.println(list.get(1).getReturnValue().equals("D") ? "PASS, list index 1 is D" : "FAIL, list index 1 is not D, it is " + list.get(1).getReturnValue());
        System.out.println(list.get(2).getReturnValue().equals("B") ? "PASS, list index 2 is B" : "FAIL, list index 2 is not B, it is " + list.get(2).getReturnValue());
        System.out.println(list.get(3).getReturnValue().equals("C") ? "PASS, list index 3 is C" : "FAIL, list index 3 is not C, it is " + list.get(3).getReturnValue());

        System.out.println("Try to remove index 2...");
        item = list.remove(2);
        System.out.println(item.hasError() == false ? "PASS, item does not have an error" : "FAIL, item has an error");
        System.out.println(list.size() == 3 ? "PASS, list size is 3" : "FAIL, list size is not 3");
        System.out.println(item.getReturnValue().equals("B") ? "PASS, item removed was B" : "FAIL, item removed was not B, it was " + item.getReturnValue());
        System.out.println(list.get(0).getReturnValue().equals("A") ? "PASS, list index 0 is A" : "FAIL, list index 0 is not A, it is " + list.get(0).getReturnValue());
        System.out.println(list.get(1).getReturnValue().equals("D") ? "PASS, list index 1 is D" : "FAIL, list index 1 is not D, it is " + list.get(1).getReturnValue());
        System.out.println(list.get(2).getReturnValue().equals("C") ? "PASS, list index 2 is C" : "FAIL, list index 2 is not C, it is " + list.get(2).getReturnValue());
    }
}
