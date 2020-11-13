import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    private Car car1 = new Car("www.c1.com", "ford", "mondeo", " ABS,\n Cruse control,\n Central locking\n", 10999);
    private Furniture furniture1 = new Furniture("www.f1.com", "6 foot wooden dining \ntable with mahogany inlay", 27.99f);
    @Test
    public void carPictureAd(){
        PictureAdCar pac = new PictureAdCar(this.car1);
        assertEquals("***********************************************\n" +
                "www.c1.com\n" +
                "Make: ford\n" +
                "Model: mondeo\n" +
                "Features: \n" +
                " ABS,\n" +
                " Cruse control,\n" +
                " Central locking\n" +
                "\n" +
                "Price: €10999\n" +
                "***********************************************", pac.display());
    }

    @Test
    public void carTextAd(){
        TextAdCar tac = new TextAdCar(this.car1);
        assertEquals("###################################################\n" +
                "Car: ford mondeo\n" +
                "Price: €10999\n" +
                "###################################################", tac.display());
    }

    @Test
    public void furniturePictureAd(){
        PictureAdFurniture paf = new PictureAdFurniture(furniture1);
        String expected = "***********************************************\n" +
                "www.f1.com\n" +
                "Discription: 6 foot wooden dining \n" +
                "table with mahogany inlay\n" +
                "Price: €27.99\n" +
                "***********************************************";
        assertEquals(expected, paf.display());
    }

    @Test
    public void furnitureTextAd(){
        TextAdFurniture taf = new TextAdFurniture(furniture1);
        String expected = "###################################################\n" +
                "Item: 6 foot wooden dining \n" +
                "table with mahogany inlay\n" +
                "Price: €27.99\n" +
                "###################################################";
        assertEquals(expected, taf.display());
    }

}