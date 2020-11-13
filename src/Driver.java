public class Driver {
    public static void main(String[] args) {
        Car car1 = new Car("www.c1.com", "ford", "mondeo", " ABS,\n Cruse control,\n Central locking\n", 10999);
        PictureAdCar pac = new PictureAdCar(car1);
        System.out.println(pac.display());

        Furniture furniture1 = new Furniture("www.f1.com", "6 foot wooden dining \ntable with mahogany inlay", 27.99f);
        PictureAdFurniture paf = new PictureAdFurniture(furniture1);
        System.out.println(paf.display());

        TextAdCar tac = new TextAdCar(car1);
        System.out.println(tac.display());

        TextAdFurniture taf = new TextAdFurniture(furniture1);
        System.out.println(taf.display());
    }
}
