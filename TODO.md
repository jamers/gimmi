# TODO

## Project Plan
### Features
1. Desktop UI that presents a list of every card available
2. Checkboxes to select which cards are wanted/already got
3. Once cards selected, go off to web and scrape offers for each card
4. Add proxying to allow quicker scraping without being IP blocked
5. Collect offers for each card with some sort of limiting rule, e.g. willing to pay up to £0.05 above minimum, or double of minimum
   - Need some sort of dedupe
6. Present list of sellers by how many cards they have

### MVP
- To start with just support Pokémon
- To start with just support CardMarket

## Steps in rough order
- Create domain model for Card, Set, Versions (e.g. reverse Holo) Offers, Seller
- Set up local database
- Populate database with available cards (how? Bulbapedia?)
- Make UI
- Make web scraper to gather prices
- Add proxying to increase speed and avoid IP ban