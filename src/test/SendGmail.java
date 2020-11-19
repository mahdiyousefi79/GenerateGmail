package test;
import library.EmailUtility;
public class SendGmail {
    /*
            when you are using your own google account:
                 first Step:
                    go to  :
                         https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                            Make sure that your google account allows third part app
        */
    public static void main(String[] args) {
        String userName = "mahdiybo@gmail.com"; //    your gmail address
        String passWord = "German1979"; // your gmail password
        String[] receivers = { "azar.ca1979@gmail.com"}; // receiver's email address (can be any domain)
        String subject = "test";  // subject of the email
        String text = "hi how are you?";  // text message

        int times  = 1;
        for(int i = 1; i <= times; i++  ){  // how many times you wanna send?

            for( String each : receivers ){ // to how many people you wanna send the email
                EmailUtility.sendEmails(userName, passWord, each, subject, text);
            }

        }
        System.out.println("Completed");
    }
}

