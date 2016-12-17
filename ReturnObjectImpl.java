
/**
 * Question 1
 *
 * @author pedro
 */
public class ReturnObjectImpl implements ReturnObject {

    private Object object;
    private ErrorMessage error;

    /**
     * Create new instance without error.
     *
     * @param object
     */
    public ReturnObjectImpl(Object object) {
        this.object = object;
        this.error = ErrorMessage.NO_ERROR;
    }

    /**
     * Create new instance with error.
     *
     * @param error
     */
    public ReturnObjectImpl(ErrorMessage error) {
        this.object = null;
        this.error = error;
    }

    /**
     * Returns whether there has been an error
     *
     * @return whether there has been an error
     */
    @Override
    public boolean hasError() {
        return this.error != ErrorMessage.NO_ERROR;
    }

    /**
     * Returns the error message.
     *
     * This method must return NO_ERROR if and only if hasError returns false.
     *
     * @return the error message
     */
    @Override
    public ErrorMessage getError() {
        return this.error;
    }

    /**
     * Returns the object wrapped in this ReturnObject, i.e. the result of the
     * operation if it was successful, or null if there has been an error.
     *
     * Note that the output of this method must be null if hasError returns true, 
     * but the opposite is not true: if hasError returns false, this method may or 
     * may not return null.
     *
     * @return the return value from the method or null if there has been an
     * error
     */
    @Override
    public Object getReturnValue() {
        return this.object;
    }

}
