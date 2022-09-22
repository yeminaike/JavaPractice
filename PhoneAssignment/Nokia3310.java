package PhoneAssignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class Nokia3310 {

    public static void startMain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Yemo Super phone\nPress 1 for menu options and 0 to exit\n>");
        String opt = input.nextLine();
        if (opt.equals("1")){
        System.out.println("""
                1. Phonebook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM Services
                14. Exit
               
                    """);
    }else {
        exit(0);
    }
        System.out.print("Welcome to Yemo super menu. Select an option\n >");
        String option = input.nextLine();
        switch (option){
            case "1":phoneBook();break;
            case "2":messages();break;
            case "3":chats();break;
            case "4":callRegister();break;
            case "5":tones();break;
            case "6":settings();break;
            case "7":callDivert();break;
            case "8":games();break;
            case "9":calculator();break;
            case "10":reminder();break;
            case "11":clock();break;
            case "12":profiles();break;
            case "13":simServices();break;
            case "14":exit(14);break;
        }

    }
    //    public static void input(){
//        Scanner input = new Scanner(System.in);
//    }

    public static void phoneBook() {
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Search\n 2. Service Nos\n " +
                "3. Add Name\n 4. Erase\n 5. Edit\n 6. Assign tone\n " +
                "7. Send b'card\n 8. Options\n 9. Speed Dials\n 10. Voice Tags\n 00. Back\n" +
                "Select an option:\n > ");
        String option = input.nextLine();
        switch (option){
            case "1":
                System.out.println("Search options:");break;
            case "2":
                System.out.println("Service Nos:");break;
            case "3":
                System.out.println("Add Name:");break;
            case "4":
                System.out.println("Erase:");break;
            case "5":
                System.out.println("Edit:");break;
            case "6":
                System.out.println("Assign tone:");break;
            case "7":
                System.out.println("Send b'card:");break;
            case "8":
                System.out.println("Options:\n1. Type of View\n2. Memory status\n00. Back");
                String opt = input.nextLine();
                switch (opt){
                    case "1":
                        System.out.println("Type of view");break;
                    case "2":
                        System.out.println("Memory status");break;
                    case"00": phoneBook();
                    default:
                        System.out.println("Sorry wrong number input");
                }
                break;
            case "9":
                System.out.println("Speed Dials:");break;
            case "10":
                System.out.println("Voice Tags:");break;
            case "00":startMain();break;
            default:
                System.out.println("Sorry you entered a wrong number");
        }
    }
    public static void messages(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Write messages\n 2. Inbox\n " +
                "3. Outbox\n 4. Picture messages\n 5. Templates\n 6. Smileys\n " +
                "7. Message settings\n 8. Info services\n 9. Voice mailbox number\n 10. Service command editor\n 00. Back\n" +
                "Select an option: \n> ");
        String option = input.nextLine();

        switch (option){
            case "1":
                System.out.println("Write message:");break;
            case "2":
                System.out.println("inbox:");break;
            case "3":
                System.out.println("Outbox:");break;
            case "4":
                System.out.println("Picture messages:");break;
            case "5":
                System.out.println("Templates:");break;
            case "6":
                System.out.println("Smileys:");break;
            case "7":
                System.out.println("Message settings:\n1. Set 1\n2. Common\n00. Back");
                System.out.println("Select an option:\n >");
                String opt = input.nextLine();
                switch (opt){
                    case "1":
                        System.out.println("1. Message center number\n2. Message sent as\n3. Message validity");break;
                    case "2":
                        System.out.println("1. Delivery reports\n2. Reply via same centre\n3. Character support");break;
                    case "00":messages();
                    default:
                        System.out.println("Sorry, wrong number");
                }
                break;
            case "8":
                System.out.println("Info services");
                break;
            case "9":
                System.out.println("Voice mailbox number");break;
            case "10":
                System.out.println("Services command editor");break;
            case "00":
                startMain();break;
            default:
                System.out.println("Sorry you entered a wrong number");
        }

    }

    public static void chats(){
        System.out.print(" Chats");
    }
    public static void callRegister(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Missed calls\n 2. Received calls\n " +
                "3. Dialled numbers\n 4. Erase recent call lists\n 5. Show call duration\n 6. Show call costs\n " +
                "7. Call cost settings\n 8. Prepaid credit\n 00. Back\nSelect an option:\n > ");
        String option = input.nextLine();

        switch (option){
            case "1":
                System.out.println("Missed calls:");break;
            case "2":
                System.out.println("Received calls:");break;
            case "3":
                System.out.println("Dialled numbers:");break;
            case "4":
                System.out.println("Erase recent call lists:");break;
            case "5":
                System.out.println("Show call duration:\n1. Last call duration\n2. All calls' duration\n 3. Received calls' duration" +
                        "\n4. Dialled calls' duration\n5. Clear timers\n00. Back");
                System.out.println("Select an option:\n >");
                String opt = input.nextLine();
                switch (opt){
                    case "1":
                        System.out.println("Last call duration");break;
                    case "2":
                        System.out.println("All calls' duration");break;
                    case "3":
                        System.out.println("Received calls' duration");break;
                    case "4":
                        System.out.println("Dialled calls' duration");break;
                    case "5":
                        System.out.println("Clear timers");break;
                    case "00":
                        callRegister();break;
                }
                break;
            case "6":
                System.out.println("Show call costs:\n1. Last call cost\n2. All calls'\n3. Clear timers");break;
            case "7":
                System.out.println("Call cost settings:\n1. Call cost limit\n2. Show costs in");
                break;
            case "8":
                System.out.println("Prepaid credit");
                break;
            case "00":
                startMain();break;
            default:
                System.out.println("Sorry you entered a wrong number");
        }

    }
    public static void tones(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Ringing tone\n 2. Ringing volume\n " +
                "3. Incoming call alert\n 4. Composer\n 5. Messages alert tone\n 6. Keypad tones\n " +
                "7. Warning and game tone\n 8. Vibrating alert\n 9. Screen saver\n 00. Back\n" +
                "Select an option:\n > ");
        String option = input.nextLine();

        switch (option){
            case "1":
                System.out.println("Ringing tone");break;
            case "2":
                System.out.println("Ringing volume");break;
            case "3":
                System.out.println("Incoming call alert");break;
            case "4":
                System.out.println("Composer");break;
            case "5":
                System.out.println("Message alert tone");break;
            case "6":
                System.out.println("Keypad tones");break;
            case "7":
                System.out.println("Warning and game tones");
                break;
            case "8":
                System.out.println("Vibrating alert");
                break;
            case "9":
                System.out.println("Screen saver");break;
            case "00":
                startMain();break;
            default:
                System.out.println("Sorry you entered a wrong number");
        }
    }
    public static void settings(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Call settings\n 2. Phone settings\n " +
                "3. Security settings\n 4. Restore factory settings\n 00. Back " +
                "Select an option: \n> ");
        String option = input.nextLine();

        switch (option){
            case "1":
                System.out.println("Call settings:\n1. Automatic redial\n2. Speed dialling\n3. Call waiting\n" +
                        "4. Own number sending\n5. Phone line in use\n 6. Automatic answer");break;
            case "2":
                System.out.println("Phone settings:\n1. Language\n2. Cell info display\n3. Welcome note\n " +
                        "4. Network selection\n5. Lights\n 6. Confirm SIM services actions");break;
            case "3":
                System.out.println("Security settings:\n1. PIN code request\n2. Call barring service\n3. Fixed dialling" +
                        "\n4. Closed user group\n 5. Phone security\n 6. Change access codes");break;
            case "4":
                System.out.println("Restore factory settings");
                break;
            case "00":
                startMain();break;
            default:
                System.out.println("Sorry you entered a wrong number");
        }

    }
    public static void callDivert(){
        System.out.print(" Call Divert");

    }
    public static void games(){
        System.out.print(" Games");

    }
    public static void calculator(){
        System.out.print(" Calculator");

    }
    public static void reminder(){
        System.out.print(" Reminders");

    }

    public static void clock(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Alarm clock\n 2. Clock settings\n " +
                "3. Date setting\n 4. Stopwatch\n 5. Countdown timer\n " +
                "6. Auto update of date and time\n 00. Back\n" +
                "Select an option: \n> ");
        String option = input.nextLine();

        switch (option){
            case "1":
                System.out.println("Alarm clock");break;
            case "2":
                System.out.println("Clock settings");break;
            case "3":
                System.out.println("Date settings");break;
            case "4":
                System.out.println("Stopwatch");break;
            case "5":
                System.out.println("Countdown timer");break;
            case "6":
                System.out.println("Auto update of date and time");break;
            case "00":
                startMain();break;
            default:
                System.out.println("Sorry you entered a wrong number");
        }

    }

    public static void profiles(){
        System.out.print(" Profiles");

    }

    public static void simServices(){
        System.out.print(" SIM Services");
    }



}


