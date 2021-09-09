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

        int selectedFloor = Integer.parseInt(args[0]);
        switch (selectedFloor) {
            case 1:
                System.out.println("Going to floor 1");
                break;
            case 2:
                System.out.println("Going to floor 2");
                break;
            case 3:
                System.out.println("Going to floor 3");
                break;
            case 4:
                System.out.println("Going to floor 4");
                break;
            case 5:
                System.out.println("Going to floor 5");
                break;
            default:
                System.out.println("Going to floor " + selectedFloor);
        }
    }
}
