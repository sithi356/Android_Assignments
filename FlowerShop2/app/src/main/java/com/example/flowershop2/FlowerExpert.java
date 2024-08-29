package com.example.flowershop2;
import java.util.ArrayList;
import java.util.List;

public class FlowerExpert {
    List<String> getVarieties(String color) {
        List<String> varieties = new ArrayList<>();
        switch (color) {
            case "Rose":
                varieties.add("China Rose");
                varieties.add("Damask Rose");
                varieties.add("Cabbage Rose");
                varieties.add("Swamp Rose");
                varieties.add("Burnet Rose");
                varieties.add("Corymb Rose");
                varieties.add("Woods' Rose");
                varieties.add("Nootka Rose");
                varieties.add("Carolina Rose");
                varieties.add("Memorial Rose");
                break;
            case "Tulip":
                varieties.add("Lady Tulip");
                varieties.add("Parrot Tulip");
                varieties.add("Garden Tulip");
                varieties.add("Red Cross Tulip");
                varieties.add("Candia Tulip");
                varieties.add("Flax-leaved Tulip");
                varieties.add("Triumph Tulips");
                varieties.add("Double Tulips");
                varieties.add("Fringed Tulips");
                varieties.add("Fosteriana Tulips");
                varieties.add("Greigii Tulips");
                varieties.add("Kaufmanniana Tulips");
                varieties.add("Lily-Flowered Tulips");
                varieties.add("Single Early Tulips");
                varieties.add("Single Late Tulips");
                varieties.add("Viridiflora Tulips");
                varieties.add("Species Tulips");
                break;
            case "Lily":
                varieties.add("Tiger Lily");
                varieties.add("Madonna Lily");
                varieties.add("Easter Lily");
                varieties.add("Orange Lily");
                varieties.add("Fire Lily");
                varieties.add("Regal Lily");
                varieties.add("Japanese Lily");
                varieties.add("Stargazer Lily");
                varieties.add("Canada Lily");
                varieties.add("Yellow Water Lily");
                break;
            case "Daisy":
                varieties.add("Asters Daisy");
                varieties.add("Blue Daisy");
                varieties.add("Cape Daisy");
                varieties.add("Chocolate Daisy");
                varieties.add("Coneflower Daisy");
                varieties.add("Dahlberg Daisy");
                varieties.add("Damianita Daisy");
                varieties.add("English Daisy");
                varieties.add("Euryops Daisy");
                varieties.add("Gerbera Daisy");
                break;
            case "Zinnia":
                varieties.add("Queen Lime Red");
                varieties.add("Double Zahara Cherry");
                varieties.add("Uproar Rose");
                varieties.add("Queeny Lime Orange");
                varieties.add("Holi Scarlet");
                varieties.add("Polar Bear");
                varieties.add("Profusion Red Yellow Bicolor");
                varieties.add("Benary’s Giant Lime");
                varieties.add("Mazurkia");
                varieties.add("Sunbow Mix");
                break;
            case "Peony":
                varieties.add("Sarah Bernhardt");
                varieties.add("Festiva Maxima");
                varieties.add("Coral Sunset");
                varieties.add("Kansas");
                varieties.add("Bowl of Beauty");
                varieties.add("Chocolate Soldier");
                varieties.add("Bartzella");
                varieties.add("Bowl of Cream");
                varieties.add("Green Halo");
                varieties.add("Francoise Ortegat");
                break;
            case "Azalea":
                varieties.add("Lavender Azalea");
                varieties.add("Pink Double Reblooming Azalea");
                varieties.add("Red Reblooming Azalea");
                varieties.add("Coral Bells Azalea");
                varieties.add("Dawn's Chorus Azalea");
                varieties.add("Duc De Rohan Azalea");
                varieties.add("Fragrant Star Azalea");
                varieties.add("Golden Flare Azalea ");
                varieties.add("Happy Days Azalea ");
                varieties.add("Orange Delight Azalea");
                break;
            case "Dahlia":
                varieties.add("Single dahlias");
                varieties.add("Cactus dahlias");
                varieties.add("Semi-cactus");
                varieties.add("Pompon dahlias");
                varieties.add("Ball dahlias");
                varieties.add("Waterlily dahlias");
                varieties.add("Anemone dahlias");
                varieties.add("Decorative dahlias");
                varieties.add("Collarette dahlias");
                break;
            case "Lavender":
                varieties.add("French lavender");
                varieties.add("Spanish lavender");
                varieties.add("English lavender");
                varieties.add("Lavandin");
                varieties.add("Fernleaf lavender");
                varieties.add("Portuguese lavender");
                varieties.add("Hidcote lavender");
                varieties.add("Lavandula stoechas 'Curly Top");
                varieties.add("Spanish lavender 'Kew Red'");
                varieties.add(" White lavender 'Alba'");
                break;
            case "Aconite":
                varieties.add("Chinese Aconite");
                varieties.add("Aconitum napellus");
                varieties.add("Aconitum anthora");
                varieties.add("Aconitum carmichaelii");
                break;
            case "Asters":
                varieties.add("Harrington’s Pink");
                varieties.add("Purple Cloud");
                varieties.add("September Ruby");
                varieties.add("Pink Victor");
                varieties.add("Kickin’ Lilac Blue");
                varieties.add("Purple Dome");
                varieties.add("Lou Williams");
                varieties.add("Hella Lacy");
                varieties.add("Honeysong pink");
                varieties.add("Treasure");
                break;
            case "Orchid":
                varieties.add("Aerangis Orchids");
                varieties.add("Ascocenda Orchids");
                varieties.add("Brassavola Orchids");
                varieties.add("Brassia Orchids");
                varieties.add("Catasetum Orchid");
                varieties.add("Corsage orchids");
                varieties.add("Boat orchids");
                varieties.add("Dendrobium orchids");
                varieties.add("Cockleshell orchids");
                varieties.add("Epidendrum orchids");
                break;
            default:
                varieties.add("No Flower Selected");
                break;
        }

        return varieties;
    }
}
