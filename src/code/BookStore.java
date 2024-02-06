import java.util.List;
import java.util.ArrayList;

/**
 * Represents a bookstore with a name and collection of novels.
 *
 * @version 1.6
 */
class BookStore
{
    private final String      name;
    private final List<Novel> novels;

    /**
     * Constructs a new bookstore with the given name.
     * If the name is "Amazon," it is replaced with "Chapters."
     *
     * @param name The name of the book store.
     */
    BookStore(final String name)
    {
        if(name.equalsIgnoreCase("Amazon"))
        {
            this.name = "Chapters";
        }
        else
        {
            this.name = name;
        }

        this.novels = new ArrayList<>();

        // Adding novels to the list, including null and empty values as specified
        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novels.add(null); // Adding null as per instruction
        novels.add(new Novel(null, "author name 1", 0)); // Novel with null title
        novels.add(new Novel("", null, 0)); // Novel with empty title and null author
        novels.add(new Novel(null, "", 0)); // Novel with null title and empty author
        novels.add(new Novel("title 1", null, 0)); // Novel with title and null author
        novels.add(new Novel("", "", 0)); // Novel with empty title and author
        novels.add(new Novel("", "author name 2", 0)); // Novel with empty title
        novels.add(new Novel("title 2", null, 0)); // Novel with title and null author
        // Continue with the specified novels
        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novels.add(new Novel("Deliverance", "James Dickey", 1970));
        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novels.add(new Novel("Falconer", "John Cheever", 1977));
        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novels.add(new Novel("Light in August", "William Faulkner", 1932));
        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novels.add(new Novel("Loving", "Henry Green", 1945));
        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novels.add(new Novel("Money", "Martin Amis", 1984));
        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novels.add(new Novel("Native Son", "Richard Wright", 1940));
        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novels.add(new Novel("1984", "George Orwell", 1948));
        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novels.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1927));
        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));
    }

    /**
     * Prints all the titles of novels in the bookstore.
     */
    public void printAllTitles()
    {
        for(final Novel novel : novels)
        {
            if(novel != null)
            {
                System.out.println(novel.getTitle());
            }
        }
    }

    /**
     * Prints titles of novels containing a specified substring.
     * The search can be case-sensitive or case-insensitive.
     *
     * @param substring                 The substring to search for in the titles.
     * @param caseSensitive             True if the search is case-sensitive, False otherwise.
     */
    public void printTitlesContaining(final String  substring,
                                      final boolean caseSensitive)
            throws IllegalNameException
    {
        String substringToFind;
        substringToFind = substring;

        if(substring == null)
        {
            throw new IllegalArgumentException("bad string");
        }

        if(substring.isBlank())
        {
            throw new IllegalNameException("bad name");
        }

        for(final Novel novel: novels)
        {
            if(novel != null)
            {
                String title;
                title = novel.getTitle();

                if(!caseSensitive)
                {
                    if(title != null)
                    {
                        title = title.toLowerCase();
                    }
                    substringToFind = substring.toLowerCase();
                }

                if(title != null && title.contains(substringToFind))
                {
                    System.out.println(novel.getTitle());
                }
            }
        }
    }

    /**
     * Prints titles of novels with a specified length.
     *
     * @param length                    The desired length of titles.
     * @throws IllegalArgumentException if length is 0 or negative
     */
    public void printTitlesOfLength(final int length)
    {
        if(length <= 0)
        {
            throw new IllegalArgumentException("bad length");
        }

        for(final Novel novel: novels)
        {
            if(novel != null)
            {
                if(novel.getTitle() != null && novel.getTitle().length() == length)
                {
                    System.out.println(novel.getTitle());
                }
            }
        }
    }

    /**
     * Prints the author's name that starts with or ends with a specified substring.
     *
     * @param substring             The substring to be checked for at the start or end of author names.
     * @throws IllegalNameException if the substring parameter is null or blank
     */
    public void printNameStartsEndsWith(final String substring)
            throws IllegalNameException
    {
        String substr;
        substr = substring;

        if(substring == null)
        {
            throw new IllegalArgumentException("bad string");
        }

        if(substring.trim().isEmpty())
        {
            throw new IllegalNameException("bad name");
        }

        for(final Novel novel: novels)
        {
            if(novel != null)
            {
                String authorName;
                authorName = novel.getAuthorName();

                if(authorName != null)
                {
                    authorName = novel.getAuthorName().toLowerCase();
                }
                substr     = substring.toLowerCase();

                if(authorName != null)
                {
                    if(authorName.startsWith(substr) || authorName.endsWith(substr))
                    {
                        System.out.println(novel.getAuthorName());
                    }
                }
            }
        }
    }

    /**
     * Gets the longest title or author name based on the specified property.
     *
     * @param property                       The property to determine whether to find the longest title or author name.
     * @return                               The longest title or author name.
     * @throws IllegalNovelPropertyException if property is neither "author" nor "title"
     */
    public String getLongest(final String property)
    {
        String longest;
        int    maxLength;

        longest   = null;
        maxLength = 0;

        if(property.equalsIgnoreCase("author"))
        {
            for(final Novel novel: novels)
            {
                if(novel != null)
                {
                    if(novel.getAuthorName() != null)
                    {
                        final int authorNameLength;
                        authorNameLength = novel.getAuthorName().length();

                        if(authorNameLength > maxLength)
                        {
                            maxLength = authorNameLength;
                            longest   = novel.getAuthorName();
                        }
                    }
                }
            }
        }
        else if(property.equalsIgnoreCase("title"))
        {
            for(final Novel novel: novels)
            {
                if(novel != null)
                {
                    if(novel.getTitle() != null)
                    {
                        final int titleLength;
                        titleLength = novel.getTitle().length();

                        if(titleLength > maxLength)
                        {
                            maxLength = titleLength;
                            longest   = novel.getTitle();
                        }
                    }
                }
            }
        }
        return longest;
    }


    /**
     * The main method to create a BookStore instance,
     * populate it with novels, and demonstrate various methods.
     */
    public static void main(final String[] args) {
        final BookStore b;
        try
        {
            b = new BookStore(args[0]);

            b.printAllTitles();
            System.out.println("-------");

            b.printTitlesContaining("the", false);
            System.out.println("-------");

            b.printTitlesContaining("the", true);
            System.out.println("-------");

            b.printTitlesOfLength(13);
            System.out.println("-------");

            b.printNameStartsEndsWith("aN");
            System.out.println("-------");

            System.out.println(b.getLongest("xyz"));
            System.out.println("-------");

            System.out.println(b.getLongest("AutHor"));
            System.out.println("-------");

            System.out.println(b.getLongest("titlE"));
        }
        catch(final Exception e)
        {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }
}
