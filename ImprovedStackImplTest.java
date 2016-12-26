
/**
 * Test ImprovedStackImpl
 *
 * @author pedro
 */
public class ImprovedStackImplTest {

    public static void main(String[] args) {
        ImprovedStackImplTest test = new ImprovedStackImplTest();
        test.run();
    }

    public void run() {
        ReturnObject object;

        System.out.println("Create new empty ImprovedStackImpl...");
        ImprovedStackImpl stack = new ImprovedStackImpl(null);
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
        System.out.println(object.getReturnValue().equals("A") ? "PASS, stack pop returns A" : "FAIL, stack pop does not returns A");
        System.out.println(stack.size() == 0 ? "PASS, stack size is 0" : "FAIL, stack size is not 0");

        System.out.println("Push some items into the stack...");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        ImprovedStack reversed = stack.reverse();
        System.out.println(reversed.size() == 3 ? "PASS, reversed size is 3" : "FAIL, reversed size is not 3");
        object = reversed.top();
        System.out.println(object.getReturnValue().equals("A") ? "PASS, reversed top returns A" : "FAIL, reversed top does not returns A");
        object = reversed.pop();
        System.out.println(object.getReturnValue().equals("A") ? "PASS, reversed pop returns A" : "FAIL, reversed pop does not returns A");
        System.out.println(reversed.size() == 2 ? "PASS, reversed size is 2" : "FAIL, reversed size is not 2");
        object = reversed.pop();
        System.out.println(object.getReturnValue().equals("B") ? "PASS, reversed pop returns B" : "FAIL, reversed pop does not returns B");
        System.out.println(reversed.size() == 1 ? "PASS, reversed size is 1" : "FAIL, reversed size is not 1");
        object = reversed.pop();
        System.out.println(object.getReturnValue().equals("C") ? "PASS, reversed pop returns C" : "FAIL, reversed pop does not returns C");
        System.out.println(reversed.size() == 0 ? "PASS, reversed size is 0" : "FAIL, reversed size is not 0");

        System.out.println("Push some items into the stack...");
        stack.push("A");
        stack.push("B");
        stack.push("B");
        stack.push("C");
        stack.push("A");
        System.out.println(stack.size() == 8 ? "PASS, stack size is 8" : "FAIL, stack size is not 8");
        stack.remove("B");
        System.out.println(stack.size() == 5 ? "PASS, stack size is 5" : "FAIL, stack size is not 5");
        while (!stack.isEmpty()) {
            object = stack.pop();
            System.out.println(!object.equals("B") ? "PASS, pop object is not B" : "FAIL, pop object is B");
        }
    }
}
