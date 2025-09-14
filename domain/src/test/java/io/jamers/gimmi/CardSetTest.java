package io.jamers.gimmi;

import io.jamers.gimmi.pokemon.PokemonCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardSetTest {
    @Test
    void testGet() {
        Card snivy = new PokemonCard(CardSet.of("Black Bolt"), 1, "Snivy");
        assertEquals(snivy, CardSet.of("Black Bolt").get(1));
    }
}
