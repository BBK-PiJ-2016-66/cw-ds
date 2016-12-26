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
        System.out.println(stack.isEmpty() ? "Pass, stack is empty" : "Fail, stack is not empty");
        System.out.println(stack.size() == 0 ? "Pass, stack size is 0" : "Fail, stack size is not 0");
        object = stack.top();
        System.out.println(object.getError() == ErrorMessage.EMPTY_STRUCTURE ? "Pass, stack top returns EMPTY_STRUCTURE" : "Fail, stack top does not returns EMPTY_STRUCTURE");
        object = stack.pop();
        System.out.println(object.getError() == ErrorMessage.EMPTY_STRUCTURE ? "Pass, stack pop returns EMPTY_STRUCTURE" : "Fail, stack pop does not returns EMPTY_STRUCTURE");

        System.out.println("Push some items into the stack...");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(!stack.isEmpty() ? "Pass, stack is not empty" : "Fail, stack is empty");
        System.out.println(stack.size() == 3 ? "Pass, stack size is 3" : "Fail, stack size is not 3");
        object = stack.top();
        System.out.println(object.getReturnValue().equals("C") ? "Pass, stack top returns C" : "Fail, stack top does not returns C");
        object = stack.pop();
        System.out.println(object.getReturnValue().equals("C") ? "Pass, stack pop returns C" : "Fail, stack pop does not returns C");
        System.out.println(stack.size() == 2 ? "Pass, stack size is 2" : "Fail, stack size is not 2");
        object = stack.pop();
        System.out.println(object.getReturnValue().equals("B") ? "Pass, stack pop returns B" : "Fail, stack pop does not returns B");
        System.out.println(stack.size() == 1 ? "Pass, stack size is 1" : "Fail, stack size is not 1");
        object = stack.pop();
        System.out.println(object.getReturnValue().equals("A") ? "Pass, stack pop returns A" : "Fail, stack pop does not returns A, it returns " + object.getReturnValue());
        System.out.println(stack.size() == 0 ? "Pass, stack size is 0" : "Fail, stack size is not 0");
    }
}
