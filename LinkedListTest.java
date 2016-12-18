
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
        System.out.println(list.isEmpty() ? "Pass, list is empty" : "Fail, list is not empty");
        System.out.println(list.size() == 0 ? "Pass, list size is 0" : "Fail, list size is not 0");

        System.out.println("Try to get index 0...");
        ReturnObject item = list.get(0);
        System.out.println(item.hasError() ? "Pass, item has an error" : "Fail, item does not have an error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "Pass, error is EMPTY_STRUCTURE" : "Fail, error is not EMPTY_STRUCTURE");

        System.out.println("Try to remove index 0...");
        item = list.remove(0);
        System.out.println(item.hasError() ? "Pass, item has an error" : "Fail, item does not have an error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "Pass, error is EMPTY_STRUCTURE" : "Fail, error is not EMPTY_STRUCTURE");

        System.out.println("Try to add a new item with index 0...");
        item = list.add(0, new Object());
        System.out.println(item.hasError() ? "Pass, item has an error" : "Fail, item does not have an error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "Pass, error is EMPTY_STRUCTURE" : "Fail, error is not EMPTY_STRUCTURE");

        System.out.println("Try to add a new item to the end of the list...");
        item = list.add("A");
        System.out.println(item.hasError() == false ? "Pass, item does not have an error" : "Fail, item has an error");
        System.out.println(list.size() == 1 ? "Pass, list size is 1" : "Fail, list size is not 1");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "Pass, list index 0 is A" : "Fail, list index 0 is not A");

        System.out.println("Try to add another new item to the end of the list...");
        item = list.add("B");
        System.out.println(item.hasError() == false ? "Pass, item does not have an error" : "Fail, item has an error");
        System.out.println(list.size() == 2 ? "Pass, list size is 2" : "Fail, list size is not 2");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "Pass, list index 0 is A" : "Fail, list index 0 is not A");
        System.out.println(list.get(1).getReturnValue().equals("B") ? "Pass, list index 1 is B" : "Fail, list index 1 is not B");

        System.out.println("Try to add even another new item to the end of the list...");
        item = list.add("C");
        System.out.println(item.hasError() == false ? "Pass, item does not have an error" : "Fail, item has an error");
        System.out.println(list.size() == 3 ? "Pass, list size is 3" : "Fail, list size is not 3");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "Pass, list index 0 is A" : "Fail, list index 0 is not A");
        System.out.println(list.get(1).getReturnValue().equals("B") ? "Pass, list index 1 is B" : "Fail, list index 1 is not B");
        System.out.println(list.get(2).getReturnValue().equals("C") ? "Pass, list index 2 is C" : "Fail, list index 2 is not C");

        System.out.println("Try to add a new item to index 1...");
        item = list.add(1, "D");
        System.out.println(item.hasError() == false ? "Pass, item does not have an error" : "Fail, item has an error");
        System.out.println(list.size() == 4 ? "Pass, list size is 4" : "Fail, list size is not 4");
        System.out.println(list.get(0).getReturnValue().equals("A") ? "Pass, list index 0 is A" : "Fail, list index 0 is not A, it is " + list.get(0).getReturnValue());
        System.out.println(list.get(1).getReturnValue().equals("D") ? "Pass, list index 1 is D" : "Fail, list index 1 is not D, it is " + list.get(1).getReturnValue());
        System.out.println(list.get(2).getReturnValue().equals("B") ? "Pass, list index 2 is B" : "Fail, list index 2 is not B, it is " + list.get(2).getReturnValue());
        System.out.println(list.get(3).getReturnValue().equals("C") ? "Pass, list index 3 is C" : "Fail, list index 3 is not C, it is " + list.get(3).getReturnValue());

        System.out.println("Try to remove index 2...");
        item = list.remove(2);
        System.out.println(item.hasError() == false ? "Pass, item does not have an error" : "Fail, item has an error");
        System.out.println(list.size() == 3 ? "Pass, list size is 3" : "Fail, list size is not 3");
        System.out.println(item.getReturnValue().equals("B") ? "Pass, item removed was B" : "Fail, item removed was not B, it was " + item.getReturnValue());
        System.out.println(list.get(0).getReturnValue().equals("A") ? "Pass, list index 0 is A" : "Fail, list index 0 is not A, it is " + list.get(0).getReturnValue());
        System.out.println(list.get(1).getReturnValue().equals("D") ? "Pass, list index 1 is D" : "Fail, list index 1 is not D, it is " + list.get(1).getReturnValue());
        System.out.println(list.get(2).getReturnValue().equals("C") ? "Pass, list index 2 is C" : "Fail, list index 2 is not C, it is " + list.get(2).getReturnValue());
    }
}
