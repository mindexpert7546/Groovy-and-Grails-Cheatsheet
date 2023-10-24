/**

Methods & Description
1	after()
Tests if this date is after the specified date.

2	equals()
Compares two dates for equality. The result is true if and only if the argument is not null and is a Date object that represents the same point in time, to the millisecond, as this object.

3	compareTo()
Compares two Dates for ordering.

4	toString()
Converts this Date object to a String

5	before()
Tests if this date is before the specified date.

6	getTime()
Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.

7	setTime()
Sets this Date object to represent a point in time that is time milliseconds after January 1, 1970 00:00:00 GMT.

*/

class DateAndTimes{
    static main(args) {
        Date date = new Date(100);
      
       // display time and date using toString()
       System.out.println(date.toString());
    }
}