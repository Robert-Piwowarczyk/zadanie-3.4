class OnlineShop {
    public static void main(String[] args) {
        Category category1 = new Category("Książki", "Wętkarstwo spławikowe");
        Product product1 = new Product("Poradnik wętkarski", 20.90,
                "Książka o wętkarstwie na rzekach i jeziorach", category1);

        Product product2 = new Product("Podręcznik początkującego wętkarza", 25.75,
                "Książka opisująca dobór przynęty i spławika oraz wętek przez " +
                        "początkujących wętkarzy", category1);

        Category category2 = new Category("Filmy", "Science fiction");
        Product product3 = new Product("Powrót Jedi", 14.99,
                "Gwiezdne wojny - film na płycie DVD", category2);

        NoCategoryProduct product4 = new NoCategoryProduct("Samsung Galaxy A307F",
                849.0, "Smartfon polecany dużym firmom");

        Product promotion = new Product("Podręcznik początkującego wętkarza", 25.75,
                "Dobór przynęty i spławika", category1);
        SpecialOffer productPromotion = new SpecialOffer("Obniżka cenowa 20% na podręczniki",
                " od 14.04.2020 do 30.04.2020 ", 0.2, promotion);


        System.out.println("Produkt 1: " + product1.name + "," +
                " cena: " + product1.price + "zł" + "," + " opis: "
                + product1.description);

        System.out.println("Produkt 2: " + product2.name + "," +
                " cena: " + product2.price + "zł" + "," + " opis: "
                + product2.description);

        System.out.println("Produkt 3: " + product3.name + "," +
                " cena: " + product3.price + "zł" + "," + " opis: "
                + product3.description);

        System.out.println("Produkt 4: " + product4.name + "," +
                " cena: " + product4.price + "zł" + "," + " opis: "
                + product4.description);

        System.out.println("Oferta specjalna na Produkt 2: "
                + productPromotion.descriptionOffer
                + productPromotion.timeOffer + ", na ten produkt przysługuje rabat "
                + productPromotion.discount);
    }

}
