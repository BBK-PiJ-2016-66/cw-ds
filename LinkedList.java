
/**
 * Question 3
 *
 * @author pedro
 */
public class LinkedList implements List {

    private Object current;
    private List next;

    /**
     * Returns true if the list is empty, false otherwise.
     *
     * @return true if the list is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return this.current == null;
    }

    /**
     * Returns the number of items currently in the list.
     *
     * @return the number of items currently in the list
     */
    @Override
    public int size() {
        if (this.current == null) {
            return 0;
        } else if (this.next != null) {
            return this.next.size() + 1;
        }

        return 1;
    }

    /**
     * Returns the element at the given position.
     *
     * If the index is negative or greater or equal than the size of the list,
     * then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message, encapsulated in a
     * ReturnObject
     */
    @Override
    public ReturnObject get(int index) {
        if (this.size() == 0) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if (index < 0 || index >= this.size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else if (index > 0) {
            return this.next.get(index - 1);
        }

        return new ReturnObjectImpl(this.current);
    }

    /**
     * Returns the elements at the given position and removes it from the list.
     * The indeces of elements after the removed element must be updated
     * accordignly.
     *
     * If the index is negative or greater or equal than the size of the list,
     * then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message, encapsulated in a
     * ReturnObject
     */
    @Override
    public ReturnObject remove(int index) {
        if (this.size() == 0) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if (index < 0 || index >= this.size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        
        ReturnObject removed;

        if (index == 0) {
            removed = new ReturnObjectImpl(this.current);
            if (this.next == null) {
                this.current = null;
            } else if (this.next.size() == 1) {
                this.current = this.next.get(0).getReturnValue();
                this.next = null;
            } else {
                this.current = this.next.get(0).getReturnValue();
                LinkedList next = new LinkedList();
                for (int i = 1; i < this.next.size(); i++) {
                    next.add(this.next.get(1));
                }
                this.next = next;
            }
        } else {
            removed = this.next.remove(index - 1);
        }

        return removed;
    }

    /**
     * Adds an element to the list, inserting it at the given position. The
     * indeces of elements at and after that position must be updated
     * accordignly.
     *
     * If the index is negative or greater or equal than the size of the list,
     * then an appropriate error must be returned.
     *
     * If a null object is provided to insert in the list, the request must be
     * ignored and an appropriate error must be returned.
     *
     * @param index the position at which the item should be inserted in the
     * list
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful or
     * containing an appropriate error message otherwise
     */
    @Override
    public ReturnObject add(int index, Object item) {
        if (this.size() == 0) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if (index < 0 || index >= this.size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }

        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }

        if (index == 0) {
            if (this.current == null) {
                this.current = item;
            } else {
                if (this.next == null) {
                    this.next = new LinkedList();
                    this.next.add(this.current);
                } else {
                    this.next.add(0, this.current);
                }
                this.current = item;
            }
        } else {
            if (this.next == null) {
                this.next = new LinkedList();
            }
            this.next.add(index - 1, item);
        }

        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    /**
     * Adds an element at the end of the list.
     *
     * If a null object is provided to insert in the list, the request must be
     * ignored and an appropriate error must be returned.
     *
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful or
     * containing an appropriate error message otherwise
     */
    @Override
    public ReturnObject add(Object item) {
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if (this.current == null) {
            this.current = item;
        } else {
            if (this.next == null) {
                this.next = new LinkedList();
            }
            this.next.add(item);
        }

        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

}
