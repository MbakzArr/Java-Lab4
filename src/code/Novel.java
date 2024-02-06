/**
 * Represents a novel with title, author name, and year published.
 *
 * @version 1.6
 */
class Novel
{
    private final String title;
    private final String authorName;
    private final int    yearPublished;

    /**
     * Constructor
     *
     * @param title         The title of the book.
     * @param authorName    The authors' name of the book.
     * @param yearPublished The year which the book was published.
     */
    Novel(final String title,
          final String authorName,
          final int    yearPublished)
    {
        this.title         = title;
        this.authorName    = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * @return The title of the book.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @return The author's name of the book.
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * @return The year the book was published.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
