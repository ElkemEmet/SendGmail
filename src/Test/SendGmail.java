package Test;
/*
            first Step:
                go to  :
                     https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
 */

import Library.Util;

public class SendGmail {

    public static void main(String[] args) {
        // credentials
        String userName = "Cybertek.Batch@gmail.com";
        String passWord = "CybertekBatch20";
        // email:
        String[] receivers = {
                "amasroor88@gmail.com",
                "rsuzem@gmail.com",
                "wakarjan@gmail.com",
                "kaheremank@gmail.com",
                "trlis369@gmail.com"
        };

        String subject = "Muhtar";
        String text = "Hi How are you? Why you are so ...";

        int times = 5;
        int count = 1;
        while(times > 0){ //send the email multiple time

            for( String each : receivers ){  // for sending emails to multiple people
                System.out.println("Sending to: "+each);
                Util.sendEmails(userName,passWord,each, subject,text);
            }

            System.out.println(count++);
            times--;

        }
        System.out.println("Completed");
    }
}
