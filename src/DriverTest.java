import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    private Car car1 = new Car("www.c1.com", "ford", "mondeo", " ABS,\n Cruse control,\n Central locking\n", 10999);
    private Furniture furniture1 = new Furniture("www.f1.com", "6 foot wooden dining \ntable with mahogany inlay", 27.99f);
    private Ticket t1 = new Ticket("www.tickets.com", "Westlife", "2", "aviva stadium", "43 each");
    private CarResource cr = new CarResource(car1);
    private FurnitureResource fr = new FurnitureResource(furniture1);
    private TicketResource tr = new TicketResource(t1);
    @Test
    public void carPictureAd(){
        Advertisment pa = new PictureAd(this.cr);
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
                "***********************************************", pa.display());
    }

    @Test
    public void carTextAd(){
        //TextAdCar tac = new TextAdCar(this.car1);
        Advertisment tac = new TextAd(this.cr);
        assertEquals("###################################################\n" +
                "Make: ford\n" +
                "Model: mondeo\n" +
                "Price: €10999\n" +
                "###################################################", tac.display());
    }

    @Test
    public void furniturePictureAd(){
        //PictureAdFurniture paf = new PictureAdFurniture(furniture1);
        Advertisment paf = new PictureAd(this.fr);
        String expected = "***********************************************\n" +
                "www.f1.com\n" +
                "6 foot wooden dining \n" +
                "table with mahogany inlay\n" +
                "\n" +
                "Price: €27.99\n" +
                "***********************************************";
        assertEquals(expected, paf.display());
    }

    @Test
    public void furnitureTextAd(){
        //TextAdFurniture taf = new TextAdFurniture(furniture1);
        Advertisment taf = new TextAd(this.fr);
        String expected = "###################################################\n" +
                "6 foot wooden dining \n" +
                "table with mahogany inlay\n" +
                "Price: €27.99\n" +
                "###################################################";
        assertEquals(expected, taf.display());
    }

    @Test
    public void ThumbnailAdFurniture(){
        //TextAdFurniture taf = new TextAdFurniture(furniture1);
        Advertisment taf = new ThumbnailAd(this.fr);
        String expected = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n" +
                "www.f1.com\n" +
                "Price: €27.99\n" +
                "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
        assertEquals(expected, taf.display());
    }

    @Test
    public void TicketPictureAd(){
        Advertisment pa = new PictureAd(this.cr);
        pa.setItem(this.tr);
        assertEquals("***********************************************\n" +
                "www.tickets.com\n" +
                "Westlife\n" +
                "2 tickets for Westlife in aviva stadium\n" +
                "Price: €43 each\n" +
                "***********************************************", pa.display());
    }

}