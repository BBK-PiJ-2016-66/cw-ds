
/**
 * Question 8
 *
 * @author pedro
 */
public class ImprovedStackImpl implements ImprovedStack {

    final private List internalList;

    /**
     * Creates a new abstract stack using the provided list as the underlying
     * data structure.
     *
     * @param list the list to be used
     */
    public ImprovedStackImpl(List list) {
        if (list == null) {
            list = new LinkedList();
        }
        this.internalList = list;
    }

    /**
     * Returns a copy of this stack with the items reversed, the top elements on
     * the original stack is at the bottom of the new stack and viceversa.
     *
     * @return a copy of this stack with the items reversed.
     */
    @Override
    public ImprovedStack reverse() {
        ImprovedStack reversed = new ImprovedStackImpl(null);
        for (int i = 0; i < this.internalList.size(); i++) {
            reversed.push(this.internalList.get(i).getReturnValue());
        }
        return reversed;
    }

    /**
     * Removes the given object from the stack if it is there. Multiple
     * instances of the object are all removed.
     *
     * Classes implementing this method must use method .equals() to check
     * whether the item is in the stack or not.
     *
     * @param object the object to remove
     */
    @Override
    public void remove(Object object) {
        for (int i = 0; i < this.internalList.size(); i++) {
            if (this.internalList.get(i).getReturnValue().equals(object)) {
                this.internalList.remove(i);
                i--;
            }
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
