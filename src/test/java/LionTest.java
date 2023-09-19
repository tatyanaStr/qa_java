import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getKittensLionTest() throws Exception {
        var lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodLionTest() throws Exception {
        var lion = new Lion("Самец", feline);
        var foodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodList);
        Assert.assertEquals(foodList, lion.getFood());
    }
}
