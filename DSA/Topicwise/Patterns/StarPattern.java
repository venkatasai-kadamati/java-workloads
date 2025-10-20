package DSA.Topicwise.Patterns;

public class StarPattern {
    // printing pattern : right angle triangle
    public static void main(String[] args) {
        int desired_stars = 4;

        // *
        // **
        // ***
        // ****

        for (int rows = 0; rows < desired_stars; rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }

        separator();

        // ****
        // ****
        // ****
        // ****

        for (int rows = 0; rows < desired_stars; rows++) {
            for (int cols = 0; cols < desired_stars; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }

        separator();

        // ****
        // ***
        // **
        // *

        for (int rows = 1; rows <= desired_stars; rows++) {
            for (int cols = 0; cols <= desired_stars - rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }

        separator();

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        for (int rows = 1; rows <= desired_stars; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }

        separator();

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4

        for (int rows = 1; rows <= desired_stars; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(rows);
            }
            System.out.println();
        }

        separator();

        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        for (int rows = 1; rows <= desired_stars; rows++) {
            for (int cols = 1; cols <= desired_stars - rows + 1; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }

        separator();

        //          *
        //        * * *
        //      * * * * *
        //     * * * * * *

        for (int rows = 1; rows <= desired_stars; rows++) {
            for (int cols = 1; cols <= (rows * 2 - 1); cols++) {
                for (int spec = 1; spec <= desired_stars * 2 - 1; spec++) {
                    if (spec == 4) System.out.print("*");
                    else System.out.print("");
                }

            }
            System.out.println();
        }

        separator();

    }


    // func: prints a divider to differentiate neatly
    public static void separator() {
        System.out.println("----- separator --------");
    }
}

