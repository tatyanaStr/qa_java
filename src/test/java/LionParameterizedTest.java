import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String SEX;
    private final boolean MANE;

    public LionParameterizedTest(String SEX, boolean MANE){
        this.SEX = SEX;
        this.MANE = MANE;
    }


    @Parameterized.Parameters
    public static Object[][] getSexLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void getLionSexTest() throws Exception{

        var lion = new Lion(SEX);
        Assert.assertEquals(lion.doesHaveMane(), MANE);
    }

    @Test(expected = Exception.class)
    public void getLionSexExceptionTest() throws Exception{

        var lion = new Lion("");
        lion.doesHaveMane();
    }
}
