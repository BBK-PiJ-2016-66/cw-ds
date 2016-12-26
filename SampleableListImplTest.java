
/**
 * Test SampleableListImpl
 *
 * @author pedro
 */
public class SampleableListImplTest {

    public static void main(String[] args) {
        SampleableListImplTest test = new SampleableListImplTest();
        test.run();
    }

    public void run() {
        SampleableList list = new SampleableListImpl();
        System.out.println(list.sample().isEmpty() ? "PASS, sample of the list is empty" : "FAIL, rest of the sample is not empty");

        list.add("A");
        System.out.println(list.sample().size() == 1 ? "PASS, size of sample is 1" : "FAIL, size of sample is not 1");
        list.add("B");
        System.out.println(list.sample().size() == 1 ? "PASS, size of sample is 1" : "FAIL, size of sample is not 1");
        list.add("C");
        System.out.println(list.sample().size() == 2 ? "PASS, size of sample is 2" : "FAIL, size of sample is not 2");
        list.add("D");
        System.out.println(list.sample().size() == 2 ? "PASS, size of sample is 2" : "FAIL, size of sample is not 2");
        list.add("E");
        System.out.println(list.sample().size() == 3 ? "PASS, size of sample is 3" : "FAIL, size of sample is not 3");
    }
}
