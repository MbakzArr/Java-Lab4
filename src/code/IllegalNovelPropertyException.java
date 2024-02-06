/**
 * Represents a custom unchecked exception thrown when the property is invalid.
 *
 * @author  Idah Khumalo and Prince Lucas Motubatse.
 * @version 1.6
 */
class IllegalNovelPropertyException extends RuntimeException {
    public IllegalNovelPropertyException(final String message) {
        super(message);
    }
}
