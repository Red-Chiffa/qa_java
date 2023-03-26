import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline = new Feline();

    @Test
    public void checkMealList() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void checkIsFelineFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getKittensReturningInt() {
        int expected = feline.getKittens();
        int actual = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkKittensNumber() {
        Feline feline = new Feline();
        int expected = feline.getKittens();
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkAnyKittensNumber() {
        Feline feline = new Feline();
        int expected = 9;
        int actual = feline.getKittens(9);
        Assert.assertEquals(expected, actual);
    }
}
