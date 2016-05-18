/**
 * This is the main class of the app. The entry oint of our app.
 * In main class we created the object of class Frame and initialized it.
 * Also we create a new thread for working with CheckWinner class and start it.
 */
public class Main {

    static CheckWinners checkWinners;

    public static void main(String[] args) {
        Frame frame = new Frame();
        checkWinners = new CheckWinners();
        Thread thread = new Thread(checkWinners);	//Создание потока "thread"
        thread.start();
    }
}
