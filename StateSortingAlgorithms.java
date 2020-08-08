// This program is some practice for data structures and algorithms using java and the list of the 50 states and their capitals.

import java.util.Scanner; // import Scanner class to take input for the state capitals.
import java.util.Arrays; // import Arrays class to allow a variety of features of arrays.
import java.util.HashMap; // import the HashMap class for Hash map use.
import java.util.TreeMap; // import the TreeMap class for Tree map use.

public class StateSortingAlgorithms {
    public static void main(String[] args) {

        // A two-dimentional String array to store states and their capitals, in order by state name.

        String[][] stateCapitals = {
            {
                "Alabama",
                "Montgomery"
            },
            {
                "Alaska",
                "Juneau"
            },
            {
                "Arizona",
                "Phoenix"
            },
            {
                "Arkansas",
                "Little Rock"
            },
            {
                "California",
                "Sacramento"
            },
            {
                "Colorado",
                "Denver"
            },
            {
                "Connecticut",
                "Hartford"
            },
            {
                "Delaware",
                "Dover"
            },
            {
                "Florida",
                "Tallahasse"
            },
            {
                "Georgia",
                "Atlanta"
            },
            {
                "Hawaii",
                "Honolulu"
            },
            {
                "Idaho",
                "Boise"
            },
            {
                "Illinois",
                "Springfield"
            },
            {
                "Indiana",
                "Indianapolis"
            },
            {
                "Iowa",
                "Des Moines"
            },
            {
                "Kansas",
                "Topeka"
            },
            {
                "Kentucky",
                "Frankfort"
            },
            {
                "Louisiana",
                "Baton Rouge"
            },
            {
                "Maine",
                "Augusta"
            },
            {
                "Maryland",
                "Annapolis"
            },
            {
                "Massachusettes",
                "Boston"
            },
            {
                "Michigan",
                "Lansing"
            },
            {
                "Minnesota",
                "Saint Paul"
            },
            {
                "Mississippi",
                "Jackson"
            },
            {
                "Missouri",
                "Jefferson City"
            },
            {
                "Montana",
                "Helena"
            },
            {
                "Nebraska",
                "Lincoln"
            },
            {
                "Nevada",
                "Carson City"
            },
            {
                "New Hampshire",
                "Concord"
            },
            {
                "New Jersey",
                "Trenton"
            },
            {
                "New York",
                "Albany"
            },
            {
                "New Mexico",
                "Santa Fe"
            },
            {
                "North Carolina",
                "Raleigh"
            },
            {
                "North Dakota",
                "Bismark"
            },
            {
                "Ohio",
                "Columbus"
            },
            {
                "Oklahoma",
                "Oklahoma City"
            },
            {
                "Oregon",
                "Salem"
            },
            {
                "Pennslyvania",
                "Harrisburg"
            },
            {
                "Rhode Island",
                "Providence"
            },
            {
                "South Carolina",
                "Columbia"
            },
            {
                "South Dakota",
                "Pierre"
            },
            {
                "Tennessee",
                "Nashville"
            },
            {
                "Texas",
                "Austin"
            },
            {
                "Utah",
                "Salt Lake City"
            },
            {
                "Vermont",
                "Montpelier"
            },
            {
                "Virginia",
                "Richmond"
            },
            {
                "Washington",
                "Olympia"
            },
            {
                "West Virginia",
                "Charleston"
            },
            {
                "Wisconsin",
                "Madison"
            },
            {
                "Wyoming",
                "Cheyenne"
            }
        };

        int len = stateCapitals.length; // To save time by redundant lookups, the array length is saved into a variable.

        // prints out the stateCapitals array. 
        System.out.println("\nThe Current contents of the stateCapitals array: ");
        for (int i = 0; i < len; i++) {
            System.out.println(Arrays.toString(stateCapitals[i]));

        }

        // Bubble sort is used to sort the contents by capital.
        String[] temp; // temp var to hold object being swapped
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) { // nested loops for each element and then comparing all elements.
                if ((stateCapitals[j][1].charAt(0) > stateCapitals[j + 1][1].charAt(0)) || // checks first letter

                    ((stateCapitals[j][1].charAt(0) == stateCapitals[j + 1][1].charAt(0)) && // or if first letter the same, checks second
                        (stateCapitals[j][1].charAt(1) > stateCapitals[j + 1][1].charAt(1))) ||

                    ((stateCapitals[j][1].charAt(1) == stateCapitals[j + 1][1].charAt(1)) && // or if second letter the same, checks third.
                        (stateCapitals[j][1].charAt(2) > stateCapitals[j + 1][1].charAt(2)))) {

                    temp = stateCapitals[j]; // uses our temp container to hold object to swap 
                    stateCapitals[j] = stateCapitals[j + 1]; // swaps later to earlier position.
                    stateCapitals[j + 1] = temp; // Swap between element and smaller element complete.
                }
            }
        }

        // Re-prints string to show new order
        System.out.println("\nAfter bubble sorting, the conents of the array are: ");
        for (int i = 0; i < len; i++) {
            System.out.println(Arrays.toString(stateCapitals[i]));
        }

        // Takes input from user for each state, and checks if correct capital is given

        Scanner input_scanner = new Scanner(System.in); // Creates a scanner for user input
        System.out.println("\nEnter the capital for the given state.");

        int points = 0; // counter to keept track of score.
        for (int i = 0; i < len; i++) { // cycles through every US state.
            System.out.println("What is the capital of " + stateCapitals[i][0] + "?");
            String given_capital = input_scanner.nextLine();
            if (given_capital.toLowerCase().equals(stateCapitals[i][1].toLowerCase())) { // both the input and capital are lower cased
                points++; // updates point if answer correct
            }
        }
        System.out.println("Thanks for playing. You got " + points + "/50 correct.\n");

        // a small pause so you can see your score before the next part of the program.
        try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Creates and populates the hashmap using the previous array
        HashMap < String, String > stateCapitalsHM = new HashMap < String, String > ();

        for (int i = 0; i < len; i++) {
            stateCapitalsHM.put(stateCapitals[i][0], stateCapitals[i][1]);
        }

        // Prints out all capital cities from the hash map.
        System.out.println("The state capitals in a hash map:");
        System.out.println(stateCapitalsHM);
        System.out.println(); //newline for readability

        // Uses the TreeMap class to print it again, this time, sorted by keys.
        TreeMap < String, String > stateCapitalsTM = new TreeMap < String, String > ();
        stateCapitalsTM.putAll(stateCapitalsHM);

        // Prints out all capital cities from the hash map.
        System.out.println("The state capitals soted with a tree map:");
        System.out.println(stateCapitalsTM);
        System.out.println(); //newline for readability

        // Prompts user to provide state, and then displays the capital of the State, if it exists. Else, it re-prompts.
        System.out.println("Enter a US state and get its capital.");
        while (true) {
            String given_state = input_scanner.nextLine(); // Scanner using nextLine, given multi-word states like New York.
            if (stateCapitalsTM.containsKey(given_state)) { // Checks if given state is a key for the Tree Map.
                System.out.println("The capital of " + given_state + " is " + stateCapitalsTM.get(given_state) + ".\n");
                break;
            } else {
                System.out.println("Please provide the full name of a US state.");
                continue;
            }
        }
        input_scanner.close(); // closes scanner to prevent a memory leak.
    }
}