package quoters;

import javax.annotation.PostConstruct;

public class T1000 extends TerminatorQuoter {
    @Override
    public void sayQuote() {
        System.out.println("Я ЖИДКИЙ");
    }
}
