package web;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SerenityTest {

    @org.junit.jupiter.api.Test
    void Given_2Params_When_UsingmapChampsFormulaire_Then_returnMap() {
        Serenity serenity = new Serenity();
        Map<String,String>  champsResultats = serenity.mapChampsFormulaire("login=npapon&motdepasse=Valentine123");
        assertEquals(2,champsResultats.size());
        assertEquals("npapon",champsResultats.get("login"));
        assertEquals("Valentine123",champsResultats.get("motdepasse"));
    }
}