import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFamilyFelineTest() {

        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void eatMeatFelineTest() throws Exception {

        var foodList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(foodList, feline.eatMeat());
    }

    @Spy
    Feline felineKittens;

    @Test
    public void getKittensFelineTest() {

        felineKittens.getKittens(1);
        Mockito.verify(felineKittens, Mockito.times(1)).getKittens(1);
        Assert.assertEquals(1, felineKittens.getKittens());
    }
}

