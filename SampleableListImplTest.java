
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
        System.out.println(list.sample().isEmpty() ? "Pass, sample of the list is empty" : "Fail, rest of the sample is not empty");

        list.add("A");
        System.out.println(list.sample().size() == 1 ? "Pass, size of sample is 1" : "Fail, size of sample is not 1");
        list.add("B");
        System.out.println(list.sample().size() == 1 ? "Pass, size of sample is 1" : "Fail, size of sample is not 1");
        list.add("C");
        System.out.println(list.sample().size() == 2 ? "Pass, size of sample is 2" : "Fail, size of sample is not 2");
        list.add("D");
        System.out.println(list.sample().size() == 2 ? "Pass, size of sample is 2" : "Fail, size of sample is not 2");
        list.add("E");
        System.out.println(list.sample().size() == 3 ? "Pass, size of sample is 3" : "Fail, size of sample is not 3");
    }
}
