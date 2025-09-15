package io.jamers.gimmi;

import io.jamers.gimmi.pokemon.PokemonCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardSet {
    private static final Map<String, CardSet> sets = new HashMap<>();

    private final String name;
    private int length;
    private final Map<Integer, Card> cards = new HashMap<>();

    private CardSet(String name) {
        this.name = name;
    }

    private CardSet(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public static CardSet of(String name) {
        return sets.computeIfAbsent(name, k -> new CardSet(name));
    }

    public static CardSet of(String name, int length) {
        return sets.computeIfAbsent(name, k -> new CardSet(name, length));
    }

    public Card get(int i) {
        return cards.get(i);
    }

    public void add(int id, Card card) {
        cards.put(id, card);
    }
}
