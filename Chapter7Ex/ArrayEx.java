package Chapter7Ex;

public class ArrayEx {
    public static void main(String[] args) {


        String[] colours = new String[7];
        colours[0] = "red";
        colours[1] = "green";
        colours[2] = "yellow";
        colours[3] = "blue";
        colours[4] = "black";
        colours[5] = "purple";
        colours[6] = "orange";


        for(int index = 0; index < colours.length; index++) {

//            System.out.printf("%s%n", colours[index]);

           System.out.println( index + "  " + colours[index]);

//         System.out.println(colours[index]);
        }
        System.out.println(colours.length);

        }
    }

//             // second method of arrays using for loop.
//        String[] colours = {"Blue", "orange", "blue", "white", "yellow", "black", "green"};
//        for (int index = 0; index < colours.length; index++) {
//            System.out.println(colours[index]);
//        }
//    }
//}



