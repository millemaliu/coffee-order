package edu.iu.habahram.coffeeorder.controllers;

import edu.iu.habahram.coffeeorder.model.DarkRoast;
import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import edu.iu.habahram.coffeeorder.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderControllerTest {

    OrderController oc = new OrderController(new OrderRepository());

    @Test
    public void darkroast() {
        OrderData od = new OrderData("dark roast", new ArrayList<>());
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.99F);
        assert(((Receipt)ans.getBody()).description().equals("Dark roast"));
    }

    @Test
    public void decaf() {
        OrderData od = new OrderData("decaf", new ArrayList<>());
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.28F);
        assert(((Receipt)ans.getBody()).description().equals("Decaf"));
    }

    @Test
    public void houseblend() {
        OrderData od = new OrderData("house blend", new ArrayList<>());
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.65F);
        assert(((Receipt)ans.getBody()).description().equals("House Blend"));
    }

    @Test
    public void espresso() {
        OrderData od = new OrderData("espresso", new ArrayList<>());
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.34F);
        assert(((Receipt)ans.getBody()).description().equals("Espresso"));
    }

    @Test
    public void espressomilk() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("milk");
        OrderData od = new OrderData("espresso", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.74F);
        assert(((Receipt)ans.getBody()).description().equals("Espresso, Milk"));
    }

    @Test
    public void espressomocha() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("mocha");
        OrderData od = new OrderData("espresso", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.6400001F);
        assert(((Receipt)ans.getBody()).description().equals("Espresso, Mocha"));
    }

    @Test
    public void espressosoy() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("soy");
        OrderData od = new OrderData("espresso", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.61F);
        assert(((Receipt)ans.getBody()).description().equals("Espresso, Soy"));
    }

    @Test
    public void espressowhip() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("whip");
        OrderData od = new OrderData("espresso", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.59F);
        assert(((Receipt)ans.getBody()).description().equals("Espresso, Whip"));
    }

    @Test
    public void hhousemilk() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("milk");
        OrderData od = new OrderData("house blend", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 2.05F);
        assert(((Receipt)ans.getBody()).description().equals("House Blend, Milk"));
    }

    @Test
    public void hhousemocha() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("mocha");
        OrderData od = new OrderData("house blend", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.95F);
        assert(((Receipt)ans.getBody()).description().equals("House Blend, Mocha"));
    }

    @Test
    public void hhousesoy() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("soy");
        OrderData od = new OrderData("house blend", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.92F);
        assert(((Receipt)ans.getBody()).description().equals("House Blend, Soy"));
    }

    @Test
    public void hhousewhip() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("whip");
        OrderData od = new OrderData("house blend", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.9F);
        assert(((Receipt)ans.getBody()).description().equals("House Blend, Whip"));
    }

    @Test
    public void darkrilk() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("milk");
        OrderData od = new OrderData("dark roast", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 2.39F);
        assert(((Receipt)ans.getBody()).description().equals("Dark roast, Milk"));
    }

    @Test
    public void darkrmocha() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("mocha");
        OrderData od = new OrderData("dark roast", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 2.29F);
        assert(((Receipt)ans.getBody()).description().equals("Dark roast, Mocha"));
    }

    @Test
    public void darkrsoy() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("soy");
        OrderData od = new OrderData("dark roast", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 2.26F);
        assert(((Receipt)ans.getBody()).description().equals("Dark roast, Soy"));
    }

    @Test
    public void darkrwhip() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("whip");
        OrderData od = new OrderData("dark roast", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 2.24F);
        assert(((Receipt)ans.getBody()).description().equals("Dark roast, Whip"));
    }

    @Test
    public void decafmilk() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("milk");
        OrderData od = new OrderData("decaf", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.68F);
        assert(((Receipt)ans.getBody()).description().equals("Decaf, Milk"));
    }

    @Test
    public void decafmocha() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("mocha");
        OrderData od = new OrderData("decaf", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.5799999F);
        assert(((Receipt)ans.getBody()).description().equals("Decaf, Mocha"));
    }

    @Test
    public void decafsoy() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("soy");
        OrderData od = new OrderData("decaf", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.55F);
        assert(((Receipt)ans.getBody()).description().equals("Decaf, Soy"));
    }

    @Test
    public void decafwhip() {
        ArrayList<String> cond = new ArrayList<>();
        cond.add("whip");
        OrderData od = new OrderData("decaf", cond);
        ResponseEntity<?> ans = oc.add(od);

        assert(((Receipt)ans.getBody()).cost() == 1.53F);
        assert(((Receipt)ans.getBody()).description().equals("Decaf, Whip"));
    }

}