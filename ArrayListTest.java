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
        System.out.println(list.isEmpty() ? "PASS, isEmpty returns true" : "FAIL, isEmpty does not return true");
        System.out.println(list.size() == 0 ? "PASS, size returns 0" : "FAIL, size does not return 0");

        System.out.println("Try to get item from index -1...");
        item = list.get(-1);
        System.out.println(item.hasError() ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "PASS, item error is INDEX_OUT_OF_BOUNDS" : "FAIL, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to get item from index 0...");
        item = list.get(0);
        System.out.println(item.hasError() ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, item error is EMPTY_STRUCTURE" : "FAIL, item error is not EMPTY_STRUCTURE");

        System.out.println("Try to add item of type null to the end of the list...");
        item = list.add(null);
        System.out.println(item.hasError() == true ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INVALID_ARGUMENT ? "PASS, item error is INVALID_ARGUMENT" : "FAIL, item error is not INVALID_ARGUMENT");

        System.out.println("Try to add item of type String to the end of the list...");
        item = list.add(new String());
        System.out.println(item.hasError() == false ? "PASS, item has not error" : "FAIL, item has error");
        System.out.println(list.size() == 1 ? "PASS, size returns 1" : "FAIL, size does not return 1");

        System.out.println("Try to add item of type Double to the end of the list...");
        item = list.add(new Double(1));
        System.out.println(item.hasError() == false ? "PASS, item has not error" : "FAIL, item has error");
        System.out.println(list.size() == 2 ? "PASS, size returns 2" : "FAIL, size does not return 2");

        System.out.println("Try to add item of type Float to the index 1...");
        item = list.add(new Float(1.0));
        System.out.println(item.hasError() == false ? "PASS, item has not error" : "FAIL, item has error");
        System.out.println(list.size() == 3 ? "PASS, size returns 3" : "FAIL, size does not return 3");

        System.out.println("Try to add item with index -1...");
        item = list.add(-1, new String());
        System.out.println(item.hasError() ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "PASS, item error is INDEX_OUT_OF_BOUNDS" : "FAIL, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to add item with index 10...");
        item = list.add(10, new String());
        System.out.println(item.hasError() ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "PASS, item error is INDEX_OUT_OF_BOUNDS" : "FAIL, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to add item of type null with index 0...");
        item = list.add(0, null);
        System.out.println(item.hasError() ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INVALID_ARGUMENT ? "PASS, item error is INVALID_ARGUMENT" : "FAIL, item error is not INVALID_ARGUMENT");

        System.out.println("Try to remove item with index -1...");
        item = list.remove(-1);
        System.out.println(item.hasError() ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "PASS, item error is INDEX_OUT_OF_BOUNDS" : "FAIL, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to remove item with index 10...");
        item = list.remove(10);
        System.out.println(item.hasError() ? "PASS, item has error" : "FAIL, item has not error");
        System.out.println(item.hasError() && item.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "PASS, item error is INDEX_OUT_OF_BOUNDS" : "FAIL, item error is not INDEX_OUT_OF_BOUNDS");

        System.out.println("Try to remove item with index 1...");
        item = list.remove(1);
        System.out.println(item.hasError() == false ? "PASS, item has not error" : "FAIL, item has error");
        System.out.println(list.size() == 2 ? "PASS, list size is 2" : "FAIL, list size is not 2");

    }
}
