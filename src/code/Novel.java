/**
 * Represents individual novels within the bookstore.
 * @author Prince Lesapo and Jimmy Aphane.
 * @version 1.0
 */

class Novel {
    private final String novelTitle;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructor to create a Novel object.
     * @param novelTitle The title of the novel.
     * @param authorName The name of the author.
     * @param yearPublished The year the novel was published.
     */
    Novel(final String  novelTitle,
          final String  authorName,
          final int     yearPublished)
    {
        this.novelTitle     = novelTitle;
        this.authorName     = authorName;
        this.yearPublished  = yearPublished;
    }

    /**
     * Returns the title of the novel.
     * @return The title of the novel.
     */
    public String getNovelTitle()
    {
        return novelTitle;
    }

    /**
     * Returns the name of the author.
     * @return The name of the author.
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Returns the year the novel was published.
     * @return The year the novel was published.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
