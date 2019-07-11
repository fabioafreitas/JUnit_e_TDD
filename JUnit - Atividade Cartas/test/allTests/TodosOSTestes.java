package allTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testCard.TestCard;
import testCard.TestCardMetodoRank;
import testDeck.TestDeck;

@RunWith(Suite.class)
@SuiteClasses({TestCard.class, 
	TestCardMetodoRank.class,
	TestDeck.class
	})
public class TodosOSTestes {

}
