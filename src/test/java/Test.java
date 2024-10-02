import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestCat.class, TestDog.class, TestRaven.class, TestPets.class})
public class Test {
}
