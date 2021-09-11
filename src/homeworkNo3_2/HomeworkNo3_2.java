package homeworkNo3_2;

/*
2. Create an elevator using main method's args.
   From the args get the first argument (args[0]) as the selected floor.
   Using switch-case see which floor is selected and print the following messages for each floor: "Going to floor 1",
   "Going to floor 2" .... "Going to floor " + selectedFloor
   Include 5 floors only
   Don't forget that the provided argument can be higher than 5
 */
public class HomeworkNo3_2 {
    public static void main(String[] args) {
        int selectedFloor = Integer.parseInt(args[1]);
        if (args.length > 0) {
            switch (selectedFloor) {
                case 1:
                    System.out.println("Going to floor 1");
                    break;
                case 2:
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Going to floor :" + i);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Going to floor :" + i);
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 4; i++) {
                        System.out.println("Going to floor :" + i);
                    }
                    break;
                case 5:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Going to floor :" + i);
                    }
                    break;
                default:
                    System.out.println("Invalid floor");
            }
        } else {
            System.out.println("No arguments.");
        }
    }
}
