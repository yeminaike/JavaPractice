package PhoneProject;

import java.util.Scanner;

public class PhoneMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                System.out.println("Press 1 to go to Menu: ");
                input.nextInt();

                System.out.println("""
                1.Phone book
                2.Messages
                3.Chat
                4.Call register
                5.Tones
                6.Settings
                7.Call divert
                8.Games
                9.Calculator
                10.Reminders
                11.Clock
                12.Profiles
                13.SIM services""");
                int Menu = 0;
                if(Menu == 0){
                    System.out.println("Choose options: ");
                    input.nextInt();}
                int options = 1;
                switch (options) {
                    case 1 -> System.out.println("""
                    1.Search
                    2. Service Nos.
                    3. Add Name
                    4.Erase
                    5. Edit
                    6. Assign tone
                    7. Send b'card
                    8. Options
                    9. Speed dial
                    10. Voice tags""");
                    case 2 -> System.out.println("""
                    1.Write messages
                    2.Inbox
                    3.Outbox
                    4.Picture messages
                    5.Templates
                    6.Smileys
                    7.Message settings
                    8.Info service
                    9.Voice mailbox number
                    10.Service command editor""");
                    case 4 -> System.out.println("""
                    1. Missed calls
                    2. Received calls
                    3. Dialled numbers
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show call costs
                    7. Call cost settings
                    8. Prepaid credit""");
                    case 5 -> System.out.println("""
                    1. Ringing tones
                    2. Ringing volume
                    3. Incoming call alert
                    4. Composer
                    5. Message alert tones
                    6. Keypad tones
                    7. Warning and game tone
                    8. Vibrating alert
                    9. Screen saver""");
                    case 6 -> System.out.println("""
                    1. Call setting
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings""");
                    case 11 -> System.out.println("""
                    1. Alarm clock
                    2. Clock settings
                    3. Date setting
                    4. Stopwatch
                    5. Countdown timer
                    6. Auto update of date and time");
                            """);
                }
            }
        }





