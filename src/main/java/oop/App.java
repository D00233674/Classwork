package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();

        myCounter.display();

        //DONE - add call to reset() that you implement in Counter class

        myCounter.reset();

        myCounter.display();

        //DONE - add call to undo() that you implement in Counter class

//        myCounter.click();
        myCounter.undo();

        //DONE
        // Add a JUnit test method to test undo()

        //DONE
        // Create a second Counter object, then
        // click() it once, undo() twice, click(), then display()
        // What count do you expect? 1

        System.out.println("\n* New Counter *");
        Counter myCounter2 = new Counter(10);
        myCounter2.click();
        myCounter2.undo();
        myCounter2.undo();
        myCounter2.click();
        myCounter2.display();

        System.out.println("\n* Checking upper limit *");
        myCounter2.reset();
        myCounter2.display();
        for(int i = 0; i < 15; i++){
            myCounter2.click();
            myCounter2.display();
        }


    }

}
