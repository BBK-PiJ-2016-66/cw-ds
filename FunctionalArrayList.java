
/**
 * Question 4
 *
 * @author pedro
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

    /**
     * Returns the element at the beginning of the list.
     *
     * If the list is empty, an appropriate error is returned.
     *
     * @return a copy of the element at the beginning of the list or an error if
     * the list is empty.
     */
    @Override
    public ReturnObject head() {
        if (this.size() == 0) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }

        return this.get(0);
    }

    /**
     * Returns a list with the elements in this list except the head. The
     * elements must be in the same order. The original list must not change or
     * be affected by changes in the new list.
     *
     * If the list is empty, another empty list is returned.
     */
    @Override
    public FunctionalList rest() {
        FunctionalList list = new FunctionalArrayList();

        if (this.size() == 0) {
            return list;
        }

        for (int i = 1; i < this.size(); i++) {
            list.add(this.get(i).getReturnValue());
        }

        return list;
    }

}
