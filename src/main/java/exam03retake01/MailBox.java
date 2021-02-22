package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> getMails() {
        return new ArrayList<>(mails);
    }

/*
public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.startsWith("Welcome") );
 */

    /*    A keresési feltételek lehetnek:

from:John Doe vagy from:johndoe@example.com - from: előtaggal visszaadja az összes olyan levelet, ahol a feladó neve
 vagy e-mail címe pontosan a from: után szereplő szöveg
to:John Doe vagy to:johndoe@example.com - from: előtaggal visszaadja az összes olyan levelet, ahol a címzettek között
 szerepel olyan, akinek a neve vagy e-mail címe pontosan a to: után szereplő szöveg
egyéb esetben visszaadja az összes olyan levelet, amiben szerepel a tárgyban vagy üzenetben a megadott szó
     */


    public List<Mail> findByCriteria(String criteria) {
        List<Mail> result  = new ArrayList<>();

        if (criteria.startsWith("from:")) {
            result.add(mail);
        } else if (criteria.startsWith("to:")) {
         result.add(mail);
        } else {
            result.add(mail);
        }

        }
    }

