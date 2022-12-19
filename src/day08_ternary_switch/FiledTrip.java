package day08_ternary_switch;

public class FiledTrip {
    public static void main(String[] args) {

        int grade = 6;

        String location = "Unknown";
        int num0fGroup = 0;
        String teaching = "Unknown";

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple orchard";
                num0fGroup = 3;
                teaching = "Ms smith";
            } else if (grade == 2) {
                location = "zoo";
                num0fGroup = 7;
                teaching = "Mr lee";
            } else if (grade == 3) {
                location = "Aquarium";
                num0fGroup = 5;
                teaching = "Ms. -Wilson ";

            } else if (grade == 4) {
                location = "Movie theater";
                num0fGroup = 2;
                teaching = "Ms Reyes";
            }
        } else if (grade == 5) {
            location = "Museum";
            num0fGroup = 5;
            teaching = "Ms lela";

        } else {
            location = "Six Flags";
            num0fGroup = 6;
            teaching = "Mr Watt";

            System.out.println("Local -" + location);
                    System.out.println("Number of groups"+num0fGroup);
                            System.out.println("Teacher in charge"+teaching);
        }
    }}



/*
•2. Create a class called FieldTrip.-Your•school•goes on a Field trip each-year. The place you go will be based
    on your grade.
    Given a variable gradeNumber figure out the details of your field trip.-Print the information at the end.
    *Data based on grade:
    grade •-• 1
   • • location- - -Apple orchard
    • • number of • groups• - 3
   ••teacher in charge-•Ms.- Smith

   grade •-•2
   • location-• Zoo
   •    number of •groups•--7
   •   teacher • in • charge -•Mr. •Lee

   grade •-• 3
   *location•-Aquarium
  • number of • groups • -• 5
   • teacher • in • charge
   •-•Ms. -Wilson
 */