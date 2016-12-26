
/**
 * Question 7
 *
 * @author pedro
 */
public class StackImpl extends AbstractStack {

    /**
     * Creates a new abstract stack using the provided list as the underlying
     * data structure.
     *
     * @param list the list to be used
     */
    public StackImpl(List list) {
        super(list);

        if (list == null) {
            this.internalList = new LinkedList();
        }
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     *
     * @return true if the stack is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return this.internalList.isEmpty();
    }

    /**
     * Returns the number of items currently in the stack.
     *
     * @return the number of items currently in the stack
     */
    @Override
    public int size() {
        return this.internalList.size();
    }

    /**
     * Adds an element at the top of the stack.
     *
     * @param item the new item to be added
     */
    @Override
    public void push(Object item) {
        if (this.internalList.isEmpty()) {
            this.internalList.add(item);
        } else {
            this.internalList.add(0, item);
        }
    }

    /**
     * Returns the element at the top of the stack. The stack is left unchanged.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     * stack is empty, an appropriate error.
     */
    @Override
    public ReturnObject top() {
        return this.internalList.get(0);
    }

    /**
     * Returns the element at the top of the stack. The element is removed frmo
     * the stack.
     *
     * @return If stack is not empty, the item on the top is returned. If the
     * stack is empty, an appropriate error.
     */
    @Override
    public ReturnObject pop() {
        return this.internalList.remove(0);
    }

}
