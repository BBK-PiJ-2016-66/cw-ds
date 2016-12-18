
/**
 * Question 2
 *
 * A list is a collection of objects that are sorted and can be
 * accessed by index. The first element in the list is at index 0.
 *
 * A list can store objects of any kind, and they can be of different
 * types: Integers, Doubles, String, or even other lists. However,
 * this list cannot store null objects.
 *
 * There is no limit to the number of elements in the list (provided
 * that there is free memory in the Java Virtual Machine).
 *
 * Not all operations on a list will always be successful. For
 * example, a programmer may try to remove an element from an empty
 * list, or from a position where there is nothing. Since we hace not
 * covered exceptions yet, we need another mechanism to report
 * errors. In order to do that, methods of this list will return a
 * ReturnObject that will contain either an object or an error
 * value of the right kind (as defined in ErrorMessage).
 *
 * @author pedro
 */
public class ArrayList implements List {

    private Object[] list;

    /**
     * Create new empty ArraList
     */
    public ArrayList() {
        this.list = new Object[0];
    }

    /**
     * Returns true if the list is empty, false otherwise.
     *
     * @return true if the list is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return this.list.length == 0;
    }

    /**
     * Returns the number of items currently in the list.
     *
     * @return the number of items currently in the list
     */
    @Override
    public int size() {
        return this.list.length;
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
        }
        
        return new ReturnObjectImpl(this.list[index]);
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

        ReturnObject removed = new ReturnObjectImpl(this.list[index]);

        int size = this.size() - 1;
        Object[] newList = new Object[size];
        int p = 0;

        for (int i = 0; i < this.size(); i++) {
            if (index != i) {
                newList[p] = this.list[i];
                p++;
            }
        }

        this.list = newList;

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

        int size = this.size() + 1;
        Object[] newList = new Object[size];
        int p = 0;

        for (int i = 0; i < this.size(); i++) {
            if (index == i) {
                newList[i] = item;
                p++;
            }
            newList[p] = this.list[i];
            p++;
        }

        this.list = newList;

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
        }

        int size = this.size() + 1;
        Object[] newList = new Object[size];

        for (int i = 0; i < this.size(); i++) {
            newList[i] = this.list[i];
        }

        int i = size - 1;
        newList[i] = item;

        this.list = newList;

        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

}
