package pl.umcs;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldConcatWordsWithDot() {
        List<String> cars = Lists.newArrayList("Audi", "BMW", "VW", "Peugeot");

        String concatedListWithDot = Joiner.on(".").join(cars);

        assertEquals("Audi.BMW.VW.Peugeot", concatedListWithDot);
    }

    @Test
    public void shouldExtractWordsFromStringWithSeparatedWords() {

        String source = "Audi.BMW.VW.Peugeot";

        List<String> cars = Splitter.on(".").splitToList(source);

        assertEquals(cars, Lists.newArrayList("Audi", "BMW", "VW", "Peugeot"));
    }
}
