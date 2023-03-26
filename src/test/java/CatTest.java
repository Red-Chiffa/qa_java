import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    @Mock
    Cat cat;
    @Test
    public void catIsPredator() throws Exception {
        Cat cat = new Cat(feline);
        List catIsPredator = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(catIsPredator);
        Assert.assertEquals("Кошка - тоже хищник", catIsPredator, cat.getFood());
    }
    @Test
    public void getSoundTest() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
    }
    @Test
    public void getSoundCheckEquals() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals("Не работает: значения не равны", expected, actual);
        System.out.println("Работает: Кот говорит " + actual);
    }
}
