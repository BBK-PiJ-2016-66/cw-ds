/**
 * Test of ArrayList
 * @author pedro
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayListTest test = new ArrayListTest();
        test.run();
    }
    
    public void run() {
        ArrayList list;
        ReturnObject item;

        System.out.println("Create new empty ArrayList...");
        list = new ArrayList();
        System.out.println(list.isEmpty() ? "Pass, isEmpty returns true" : "Fail, isEmpty does not return true");
        System.out.println(list.size() == 0 ? "Pass, size returns 0" : "Fail, size does not return 0");

        System.out.println("Try to get item from index -1...");
        item = list.get(-1);
        System.out.println(item.hasError() ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "Pass, item error is INDEX_OUT_OF_BOUNDS" : "Fail, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to get item from index 0...");
        item = list.get(0);
        System.out.println(item.hasError() ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "Pass, item error is EMPTY_STRUCTURE" : "Fail, item error is not EMPTY_STRUCTURE");

        System.out.println("Try to add item of type null to the end of the list...");
        item = list.add(null);
        System.out.println(item.hasError() == true ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INVALID_ARGUMENT ? "Pass, item error is INVALID_ARGUMENT" : "Fail, item error is not INVALID_ARGUMENT");

        System.out.println("Try to add item of type String to the end of the list...");
        item = list.add(new String());
        System.out.println(item.hasError() == false ? "Pass, item has not error" : "Fail, item has error");
        System.out.println(list.size() == 1 ? "Pass, size returns 1" : "Fail, size does not return 1");

        System.out.println("Try to add item of type Double to the end of the list...");
        item = list.add(new Double(1));
        System.out.println(item.hasError() == false ? "Pass, item has not error" : "Fail, item has error");
        System.out.println(list.size() == 2 ? "Pass, size returns 2" : "Fail, size does not return 2");

        System.out.println("Try to add item of type Float to the index 1...");
        item = list.add(new Float(1.0));
        System.out.println(item.hasError() == false ? "Pass, item has not error" : "Fail, item has error");
        System.out.println(list.size() == 3 ? "Pass, size returns 3" : "Fail, size does not return 3");

        System.out.println("Try to add item with index -1...");
        item = list.add(-1, new String());
        System.out.println(item.hasError() ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "Pass, item error is INDEX_OUT_OF_BOUNDS" : "Fail, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to add item with index 10...");
        item = list.add(10, new String());
        System.out.println(item.hasError() ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "Pass, item error is INDEX_OUT_OF_BOUNDS" : "Fail, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to add item of type null with index 0...");
        item = list.add(0, null);
        System.out.println(item.hasError() ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INVALID_ARGUMENT ? "Pass, item error is INVALID_ARGUMENT" : "Fail, item error is not INVALID_ARGUMENT");

        System.out.println("Try to remove item with index -1...");
        item = list.remove(-1);
        System.out.println(item.hasError() ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "Pass, item error is INDEX_OUT_OF_BOUNDS" : "Fail, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to remove item with index 10...");
        item = list.remove(10);
        System.out.println(item.hasError() ? "Pass, item has error" : "Fail, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "Pass, item error is INDEX_OUT_OF_BOUNDS" : "Fail, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to remove item with index 1...");
        item = list.remove(1);
        System.out.println(item.hasError() == false ? "Pass, item has not error" : "Fail, item has error");
        System.out.println(list.size() == 2 ? "Pass, list size is 2" : "Fail, list size is not 2");

    }
}
