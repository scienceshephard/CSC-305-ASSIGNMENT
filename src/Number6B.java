public class Number6B {
    public static void main(String[] args) {
        // Define course codes
        String[] courseCodes = {"CSC315", "CSC305", "CSC311", "CSC303", "CSC307"};

        // Define course units
        int[] courseUnits = {3, 3, 2, 2, 1};

        // Define whether a course is practical (1 = practical, 0 = not practical)
        int[] isPractical = {0, 1, 0, 1, 0};

        // Define time slots
        String[] timeSlots = {"8-11", "11-12", "12-2", "2-3", "3-6"};

        // Initialize timetable (empty slots)
        String[] timetable = new String[timeSlots.length];
        for (int i = 0; i < timetable.length; i++) {
            timetable[i] = "";
        }

        // Sort courses by units (descending order) using bubble sort
        for (int i = 0; i < courseUnits.length - 1; i++) {
            for (int j = 0; j < courseUnits.length - 1 - i; j++) {
                if (courseUnits[j] < courseUnits[j + 1]) {
                    // Swap course codes
                    String tempCode = courseCodes[j];
                    courseCodes[j] = courseCodes[j + 1];
                    courseCodes[j + 1] = tempCode;

                    // Swap course units
                    int tempUnit = courseUnits[j];
                    courseUnits[j] = courseUnits[j + 1];
                    courseUnits[j + 1] = tempUnit;

                    // Swap practical flags
                    int tempPractical = isPractical[j];
                    isPractical[j] = isPractical[j + 1];
                    isPractical[j + 1] = tempPractical;
                }
            }
        }

        // Assign courses to time slots
        for (int i = 0; i < courseCodes.length; i++) {
            if (isPractical[i] == 1) {
                // Assign practical courses to the evening slot (3-6 PM)
                timetable[4] = courseCodes[i];
            } else {
                // Assign non-practical courses to the earliest available slot
                for (int j = 0; j < timetable.length; j++) {
                    if (timetable[j].isEmpty() && j != 4) {
                        timetable[j] = courseCodes[i];
                        break;
                    }
                }
            }
        }

        // Display the restructured timetable
        System.out.println("Restructured Lecture Timetable:");
        System.out.println("--------------------------------");
        System.out.println("| DAYS  | 8-11       | 11-12      | 12-2       | 2-3        | 3-6        |");
        System.out.println("|-------|------------|------------|------------|------------|------------|");
        System.out.printf("| MON   | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                timetable[0], timetable[1], timetable[2], timetable[3], timetable[4]);

    }
}
