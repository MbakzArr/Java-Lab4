/**
 * Represents a custom unchecked exception thrown when the property is invalid.
 *
 * @version 1.6
 */
class IllegalNovelPropertyException extends RuntimeException {
    public IllegalNovelPropertyException(final String message) {
        super(message);
    }
}
