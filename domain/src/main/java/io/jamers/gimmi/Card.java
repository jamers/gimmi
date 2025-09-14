package io.jamers.gimmi;

public class Card {
    private final Game game;
    private final CardSet set;
    private final int id;

    public Card(Game game, CardSet set, int id) {
        this.game = game;
        this.set = set;
        this.id = id;
    }
}
