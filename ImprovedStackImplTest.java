
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
        System.out.println(object.getReturnValue().equals("A") ? "Pass, stack pop returns A" : "Fail, stack pop does not returns A");
        System.out.println(stack.size() == 0 ? "Pass, stack size is 0" : "Fail, stack size is not 0");

        System.out.println("Push some items into the stack...");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        ImprovedStack reversed = stack.reverse();
        System.out.println(reversed.size() == 3 ? "Pass, reversed size is 3" : "Fail, reversed size is not 3");
        object = reversed.top();
        System.out.println(object.getReturnValue().equals("A") ? "Pass, reversed top returns A" : "Fail, reversed top does not returns A");
        object = reversed.pop();
        System.out.println(object.getReturnValue().equals("A") ? "Pass, reversed pop returns A" : "Fail, reversed pop does not returns A");
        System.out.println(reversed.size() == 2 ? "Pass, reversed size is 2" : "Fail, reversed size is not 2");
        object = reversed.pop();
        System.out.println(object.getReturnValue().equals("B") ? "Pass, reversed pop returns B" : "Fail, reversed pop does not returns B");
        System.out.println(reversed.size() == 1 ? "Pass, reversed size is 1" : "Fail, reversed size is not 1");
        object = reversed.pop();
        System.out.println(object.getReturnValue().equals("C") ? "Pass, reversed pop returns C" : "Fail, reversed pop does not returns C");
        System.out.println(reversed.size() == 0 ? "Pass, reversed size is 0" : "Fail, reversed size is not 0");

        System.out.println("Push some items into the stack...");
        stack.push("A");
        stack.push("B");
        stack.push("B");
        stack.push("C");
        stack.push("A");
        System.out.println(stack.size() == 8 ? "Pass, stack size is 8" : "Fail, stack size is not 8");
        stack.remove("B");
        System.out.println(stack.size() == 5 ? "Pass, stack size is 5" : "Fail, stack size is not 5");
        while (!stack.isEmpty()) {
            object = stack.pop();
            System.out.println(!object.equals("B") ? "Pass, pop object is not B" : "Fail, pop object is B");
        }
    }
}
