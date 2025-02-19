class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        /* for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        } */

        int lowest = findLowestTime(times);
        System.out.println(names[lowest] + ":" + times[lowest]);

        int second = findSecondTime(times, lowest);
        System.out.println(names[second] + ":" + times[second]);

        
    }

    public static int findLowestTime(int[] times) {
        int lowest = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < times[lowest]) {
                lowest =  i;
            }
        }
        return lowest;
    }

    public static int findSecondTime(int[] times, int lowest) {
        int second = 0;
        for (int i = 0; i < times.length; i++) {
            if (i == lowest) {
                continue;
            } else if (times[i] < times[second]) {
                second = i;
            }
        }
        return second;
    }
} 