package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.mail;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class PostOffice {
    enum MailHandler{
        GENERAL_DELIVERY{
            boolean handle(Mail m){
                switch (m.generalDelivery){
                    case YES:
                        print("Using general delivery for "+m);
                        return true;
                        default: return false;
                }
            }
        },
        MACHINE_SCAN{
            boolean handle(Mail m){
                switch (m.scannability){
                    case UNSCANNABLE: return false;
                    default:
                        switch (m.address){
                            case INCORRECT: return false;
                            default:
                                print("Delivering "+m+" automatically");
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION{
            boolean handle(Mail m){
                switch (m.readability){
                    case ILLEGIBLE: return false;
                    default:
                        switch (m.address){
                            case INCORRECT: return false;
                            default:
                                print("Delivering "+m+" normally");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER{
            boolean handle(Mail m){
                switch (m.returnAddress){
                    case MISSING: return false;
                    default:
                        print("Returning "+m+" to sender");
                        return true;
                }
            }
        };
        abstract boolean handle(Mail m);
    }
    static void handle(Mail m){
        for (MailHandler handler: MailHandler.values())
            if (handler.handle(m))
                return;
            print(m+" is a dead letter");
    }

    public static void main(String[] args) {
        for (Mail mail: Mail.generator(10)){
            print(mail.details());
            handle(mail);
            print("*****");
        }
    }
}
