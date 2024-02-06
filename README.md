## BookStore Code

This Java program represents a bookstore with functionalities to manage and retrieve information about novels.

### Features:

- **Print All Titles**: Prints all the titles of novels in the bookstore.
- **Print Titles Containing**: Prints titles of novels containing a specified substring, with options for case sensitivity.
- **Print Titles of Length**: Prints titles of novels with a specified length.
- **Print Name Starts/Ends With**: Prints the author's name that starts with or ends with a specified substring.
- **Get Longest**: Gets the longest title or author name based on the specified property.
- **Main Method**: Demonstrate various methods of the application.

### Exceptions Handling:

- **printTitlesOfLength**: Throws `IllegalArgumentException` if the length is 0 or negative.
- **printNameStartsEndsWith**: Throws `IllegalNameException` (custom checked exception) if the substring parameter is null or blank.
- **printTitlesContaining**: Throws `IllegalArgumentException` if the substring parameter is blank or null.
- **getLongest**: Throws `IllegalNovelPropertyException` (custom unchecked exception) if the property value is not "author" nor "title".
- **Main Method**: All methods are wrapped with try/catch blocks to handle exceptions gracefully. In case of an exception, the message from the exception is printed.

### Instructions for Use:

1. Clone the repository.
2. Compile the Java files.
3. Run the `BookStore` class with appropriate arguments (if any).

### How to Run:

```
java BookStore <bookstore_name>
```

Replace `<bookstore_name>` with the name of the bookstore.

### Example:

```
java BookStore Amazon
```

### Note:

- Ensure Java Development Kit (JDK) is installed on your system.
- Handle exceptions gracefully for smooth execution.

### Author:

[Mbadaliga Arehone]

### Version:

1.0
