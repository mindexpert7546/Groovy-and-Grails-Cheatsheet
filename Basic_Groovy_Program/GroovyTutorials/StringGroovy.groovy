/**
Methods & Description
1	center()
Returns a new String of length numberOfChars consisting of the recipient padded on the left and right with space characters.

2	compareToIgnoreCase()
Compares two strings lexicographically, ignoring case differences.

3	concat()
Concatenates the specified String to the end of this String.

4	eachMatch()
Processes each regex group (see next section) matched substring of the given String.

5	endsWith()
Tests whether this string ends with the specified suffix.

6	equalsIgnoreCase()
Compares this String to another String, ignoring case considerations.

7	getAt()
It returns string value at the index position

8	indexOf()
Returns the index within this String of the first occurrence of the specified substring.

9	matches()
It outputs whether a String matches the given regular expression.

10	minus()
Removes the value part of the String.

11	next()
This method is called by the ++ operator for the class String. It increments the last character in the given String.

12	padLeft()
Pad the String with the spaces appended to the left.

13	padRight()
Pad the String with the spaces appended to the right.

14	plus()
Appends a String

15	previous()
This method is called by the -- operator for the CharSequence.

16	replaceAll()
Replaces all occurrences of a captured group by the result of a closure on that text.

17	reverse()
Creates a new String which is the reverse of this String.

18	split()
Splits this String around matches of the given regular expression.

19	subString()
Returns a new String that is a substring of this String.

20	toUpperCase()
Converts all of the characters in this String to upper case.

21	toLowerCase()
Converts all of the characters in this String to lower case.

*/
class StringGroovy{
    static main(args) {
        //Defination of string
        String str = 'Kundan';

        //to print the string
        println(str);
    }
}