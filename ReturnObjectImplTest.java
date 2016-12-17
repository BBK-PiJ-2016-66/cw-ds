
/**
 * Test ReturnObjectImpl
 *
 * @author pedro
 */
public class ReturnObjectImplTest {

    public static void main(String[] args) {
        ReturnObjectImplTest test = new ReturnObjectImplTest();
        test.run();
    }

    public void run() {
        Object object = new Object();
        ReturnObjectImpl impl;

        // test with object
        impl = new ReturnObjectImpl(object);
        System.out.println(impl.hasError() == false ? "PASS, hasError is false" : "FAIL, hasError is not false");
        System.out.println(impl.getError() == ErrorMessage.NO_ERROR ? "PASS, gasError returns NO_ERROR" : "FAIL, gasError returns " + impl.getError());
        System.out.println(impl.getReturnValue() != null ? "PASS, getReturnValue is not null" : "PASS, getReturnValue is null");

        // test with error NO_ERROR
        impl = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        System.out.println(impl.hasError() == false ? "PASS, hasError is false" : "FAIL, hasError is not false");
        System.out.println(impl.getError() == ErrorMessage.NO_ERROR ? "PASS, gasError returns NO_ERROR" : "FAIL, gasError returns " + impl.getError());
        System.out.println(impl.getReturnValue() == null ? "PASS, getReturnValue is null" : "PASS, getReturnValue is not null");

        // test with error EMPTY_STRUCTURE
        impl = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        System.out.println(impl.hasError() == true ? "PASS, hasError is true" : "FAIL, hasError is not true");
        System.out.println(impl.getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, gasError returns EMPTY_STRUCTURE" : "FAIL, gasError returns " + impl.getError());
        System.out.println(impl.getReturnValue() == null ? "PASS, getReturnValue is null" : "PASS, getReturnValue is not null");

        // test with error INDEX_OUT_OF_BOUNDS
        impl = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        System.out.println(impl.hasError() == true ? "PASS, hasError is true" : "FAIL, hasError is not true");
        System.out.println(impl.getError() == ErrorMessage.INDEX_OUT_OF_BOUNDS ? "PASS, gasError returns INDEX_OUT_OF_BOUNDS" : "FAIL, gasError returns " + impl.getError());
        System.out.println(impl.getReturnValue() == null ? "PASS, getReturnValue is null" : "PASS, getReturnValue is not null");

        // test with error INVALID_ARGUMENT
        impl = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        System.out.println(impl.hasError() == true ? "PASS, hasError is true" : "FAIL, hasError is not true");
        System.out.println(impl.getError() == ErrorMessage.INVALID_ARGUMENT ? "PASS, gasError returns INVALID_ARGUMENT" : "FAIL, gasError returns " + impl.getError());
        System.out.println(impl.getReturnValue() == null ? "PASS, getReturnValue is null" : "PASS, getReturnValue is not null");
    }
}
