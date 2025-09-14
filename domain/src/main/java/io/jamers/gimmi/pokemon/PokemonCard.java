package io.jamers.gimmi.pokemon;

import io.jamers.gimmi.Card;
import io.jamers.gimmi.CardSet;
import io.jamers.gimmi.Game;

import java.util.List;

public class PokemonCard extends Card {
    private final List<String> species;

    public PokemonCard(CardSet set, int id, String species) {
        super(Game.POKEMON, set, id);
        this.species = List.of(species);
        set.add(id, this);
    }
}
