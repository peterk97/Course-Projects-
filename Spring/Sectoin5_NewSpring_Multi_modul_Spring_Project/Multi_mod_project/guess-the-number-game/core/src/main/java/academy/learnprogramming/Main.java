package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

//    Adding another reference here static final for the location (we need to represent the config for the container)
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        //create context (container)
        // this line defining the IOC container but the ConfigAppContext is an interface and it is the best to coding to the interface !
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        //Get the NumberGenerator bean from context (container)
        // here we are asking the container for the bean instance by the name and type (name par. needs to match the ID in beans.xml)
        //the container gives us the numGeneratorImpl instance but because it implements the interface we are coding to the interface
        NumberGenerator numberGenerator = context.getBean("numberGenerator",NumberGenerator.class);

        //call method next() to get random number
        int number = numberGenerator.next();

        //log the generated number
        //this replaces the {} with the number automatically because of slf4j message formatter (with argument specified after the , )
        log.info("number = {}",number);


        //Get the Game ean from context (container)
        //getBean() is overloaded ! (many ways to get a bean from a S.container)
        Game game = context.getBean(Game.class);

        //call reset method
        game.reset();

        //close context (container)
        // to prevent memory resource leaks !
        context.close();



    }
}
