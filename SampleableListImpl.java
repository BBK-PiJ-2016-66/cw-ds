
/**
 * Question 6
 *
 * @author pedro
 */
public class SampleableListImpl extends LinkedList implements SampleableList {

    /**
     * Returns a list containing the first, third, fifth... items of this list,
     * or an empty list if the list is empty.
     *
     * @return a list containing the first, third, fifth... items of this list
     */
    @Override
    public SampleableList sample() {
        SampleableList list = new SampleableListImpl();

        if (this.isEmpty()) {
            return list;
        }

        for (int i = 0; i < this.size(); i += 2) {
            list.add(this.get(i).getReturnValue());
        }

        return list;
    }

}
