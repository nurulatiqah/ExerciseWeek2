package e89;

/**
 * @author nurulatiqahali
 *
 */
public class Main {
    /**
     * @param args print clock until less than 20times
     */
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }
}