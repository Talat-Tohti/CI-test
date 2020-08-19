package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void setUp() throws Exception {
        Controller con = new Controller();
        con.small.setSelected(true);
        con.thin.setSelected(true);
        con.Ham.setSelected(true);
        con.Olives.setSelected(true);
        con.Peperoni.setSelected(true);
       assertEquals("small thin Ham,Olives,Peperoni",con.display.getEllipsisString());
    }


}