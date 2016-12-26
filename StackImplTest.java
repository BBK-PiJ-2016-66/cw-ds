/**
 * Test StackImpl
 *
 * @author pedro
 */
public class StackImplTest {

    public static void main(String[] args) {
        StackImplTest test = new StackImplTest();
        test.run();
    }

    public void run() {
        ReturnObject object;

        System.out.println("Create new empty StackImpl...");
        StackImpl stack = new StackImpl(null);
        System.out.println(stack.isEmpty() ? "PASS, stack is empty" : "FAIL, stack is not empty");
        System.out.println(stack.size() == 0 ? "PASS, stack size is 0" : "FAIL, stack size is not 0");
        object = stack.top();
        System.out.println(object.getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, stack top returns EMPTY_STRUCTURE" : "FAIL, stack top does not returns EMPTY_STRUCTURE");
        object = stack.pop();
        System.out.println(object.getError() == ErrorMessage.EMPTY_STRUCTURE ? "PASS, stack pop returns EMPTY_STRUCTURE" : "FAIL, stack pop does not returns EMPTY_STRUCTURE");

        System.out.println("Push some items into the stack...");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(!stack.isEmpty() ? "PASS, stack is not empty" : "FAIL, stack is empty");
        System.out.println(stack.size() == 3 ? "PASS, stack size is 3" : "FAIL, stack size is not 3");
        object = stack.top();
        System.out.println(object.getReturnValue().equals("C") ? "PASS, stack top returns C" : "FAIL, stack top does not returns C");
        object = stack.pop();
        System.out.println(object.getReturnValue().equals("C") ? "PASS, stack pop returns C" : "FAIL, stack pop does not returns C");
        System.out.println(stack.size() == 2 ? "PASS, stack size is 2" : "FAIL, stack size is not 2");
        object = stack.pop();
        System.out.println(object.getReturnValue().equals("B") ? "PASS, stack pop returns B" : "FAIL, stack pop does not returns B");
        System.out.println(stack.size() == 1 ? "PASS, stack size is 1" : "FAIL, stack size is not 1");
        object = stack.pop();
        System.out.println(object.getReturnValue().equals("A") ? "PASS, stack pop returns A" : "FAIL, stack pop does not returns A, it returns " + object.getReturnValue());
        System.out.println(stack.size() == 0 ? "PASS, stack size is 0" : "FAIL, stack size is not 0");
    }
}
