package peterkoncz;

public class Challenge {
/**
 * When we overriding the equals() method in HeavenlyBody class, we
 * were careful to make sure that it would not return true if a HeavenlyBody
 * was compared to a subclass of itself.
 *
 * We did to demonstrate that method, but it was actually
 * unnecessary in the HeavenlyBody class.
 *
 * The mini challenge just a question: Why was it unnecessary?
 *
 *
 * THE ANSWER:
 *
 * The HeavenlyBody class is declared final, so cannot be subclassed.
 * The JAVA String class is also final, which is why it can safely
 * use the instanceof method without having to worry about
 * comparison with a subclass.
  */

// I am going to demonstrate what is the major issue with using an instance of a Subclass.







}
