package pom;

import org.openqa.selenium.By;
import utils.Utilities;

public class Calendar {

    private final By CALENDAR = By.xpath("//div[@aria-label='Calendar']");
    private final By HEADER = By.xpath("//header/div/div/div[@class]");
    private final By MODALTITTLE = By.xpath("//div/h6[text()='New Appointment']");
    private final By SEARCHCOSTUMER = By.xpath("");
    private final By CATEGORY = By.xpath("//div/div[text()='Select category...']/following-sibling::div");
    private final By SERVICE = By.xpath("//div/div[text()='Select service..']/following-sibling::div");
    private final By CLOSEICON= By.xpath("//button[@aria-label='close']");
    private final By DURATION = By.xpath("");
    private final By BUFFER = By.xpath("");
    private final By BTNADDNEW = By.xpath("");
    private final By BTNWALKIN = By.xpath("//div/button[text()='Walk in']");
    private final By BTNADDSERVICE = By.xpath("");
    private final By BTNADDOFFER = By.xpath("");
    private final By BTNADDSUBC = By.xpath("//div/button[text()='Print Booking Info']");
    private final By BTNCREATE = By.xpath("//div/button[text()='Create']");
    private final By BTNREMOVESERVICE = By.xpath("");
    private final By TXTWALKIN = By.xpath("//div/h3[text()='Walk in']");
    private final By STATUS = By.xpath("//div/span[text()='No Status']");
    private final By BTNBOOKINGINFO = By.xpath("//div/button[text()='Print Booking Info']");
    private final By BTNEDITBOOKING = By.xpath("//div/button[text()='Edit Booking']");
    private final By BTNCHECKOUT = By.xpath("//div/button[text()='Checkout']");


    public Calendar btnTimeSlot(String staff)
    {
        final By TIMESLOT = By.xpath("//div[@class='rbc-time-content']//child::div["+staff+"]/div/div[@class='rbc-time-slot rbc-available']/span[text()='1:00 AM']");
        Utilities.wt( 100);
        Utilities.HooverClick(TIMESLOT);

//         if (Utilities.isElementPresent(TIMESLOT))
//        {
//            Utilities.clickWait(TIMESLOT);
//        }
        return this;
    }

    public Calendar btnCalendar(){
        Utilities.wt( 10);
        Utilities.clickWait(CALENDAR);
        return this;
    }

    public Calendar chckMessage(String message1) {
        Utilities.isElementPresent(HEADER);
        Utilities.wt( 2000);
        Utilities.compareText(HEADER, message1);
        return this;
    }
    public Calendar chckModal() {
        Utilities.isElementPresent(MODALTITTLE);
        return this;
    }
    public Calendar closeIcon() {
        Utilities.clickWait(CLOSEICON);
        return this;
    }
    public Calendar SelectCategory() {
        Utilities.clickEnter(CATEGORY);
        return this;
    }

    public Calendar SelectService() {
        Utilities.clickEnter(SERVICE);
        return this;
    }
    public Calendar btnCreate(){
        Utilities.wt( 10);
        Utilities.clickWait(BTNCREATE);
        return this;
    }
    public Calendar checkApptBox(){
        Utilities.isElementPresent(TXTWALKIN);
        Utilities.isElementPresent(STATUS);
        Utilities.isElementPresent(BTNBOOKINGINFO);
        Utilities.isElementPresent(BTNEDITBOOKING);
        Utilities.isElementPresent(BTNCHECKOUT);
        return this;
    }
    public Calendar btnWalkin(){
        Utilities.wt( 10);
        Utilities.clickWait(BTNWALKIN);
        return this;
    }
}