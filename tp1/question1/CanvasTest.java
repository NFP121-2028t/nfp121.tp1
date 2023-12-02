package question1;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CanvasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CanvasTest
{
    private question1.Circle circle1;
    private question1.Circle circle2;
    private question1.Square square1;
    private question1.Square square2;
    private question1.Triangle triangle1;
    private question1.Triangle triangle2;

    
    
    
    
    
    

    /**
     * Default constructor for test class CanvasTest
     */
    public CanvasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        question1.Canvas.getCanvas();
        circle1 = new question1.Circle();
        circle2 = new question1.Circle();
        square1 = new question1.Square();
        square2 = new question1.Square();
        triangle1 = new question1.Triangle();
        triangle2 = new question1.Triangle();
        circle1.makeVisible();
        circle2.moveDown();
        circle2.moveDown();
        circle2.moveLeft();
        circle2.moveRight();
        circle2.moveLeft();
        circle2.makeVisible();
        circle2.changeColor("magenta");
        square1.makeVisible();
        square1.moveUp();
        square1.moveUp();
        square1.moveRight();
        square1.makeVisible();
        square2.makeVisible();
        square1.changeColor("black");
        triangle1.makeVisible();
        triangle2.makeVisible();
        triangle2.moveVertical(45);
        triangle2.moveDown();
        triangle2.moveDown();
        triangle2.moveLeft();
        triangle2.moveRight();
        triangle2.moveRight();
        square2.changeColor("red");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
