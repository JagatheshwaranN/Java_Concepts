package beforeJava8.features.flow_control.selection_statements;

public class _03_Switch_Statement_Scenarios {

    public static void main(String[] args) {

        /*
            Fall Through Inside Switch
            ==========================
            Within the switch, if any case is matched from that case onwards all statements will be
            executed until break or end of the switch. This is called as Fall Through Inside Switch.
            The main advantage of Fall Through Inside Switch is we can define common action for multiple
            cases (Code re-usability).

            Example,
            Switch(x){
            case 1:
            case 2:
                SOP("Q4");
                break;
            case 3:
            case 4:
                SOP("Q1");
                break;
            }
        */

        int x = 0;
        switch(x){

            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println("-1");
        }

        // If x = 0, o/p => 0, 1
        // If x = 1, o/p => 1
        // If x = 2, o/p => 2, -1
        // If x = 3, o/p => -1

        /*
            Default Case Summary
            ====================
            1.	Within the switch, we can take default case only once.
            2.	Default case will be executed if and only if there is no case matched.
            3.	Within the switch, we can write default case anywhere, but it’s recommended to write
                as last case.
        */
        switch(x){

            default:
                System.out.println("-1");
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }

        // If x = 0, o/p => 0
        // If x = 1, o/p => 1, 2
        // If x = 2, o/p => 2
        // If x = 3, o/p => -1, 0
    }
}
