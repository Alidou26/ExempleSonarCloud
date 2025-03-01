package com.tp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exemple {

    private static final Logger logger = LoggerFactory.getLogger(Exemple.class);

    public static void main(String[] args) {

        // Éviter NullPointerException
        String test = "test";
        if ("Test".equals(test)) {
            logger.info("La chaîne est Test");
        }

        int x = 10;
        int y = 20;
        int somme = x + y;

        // On utilise la variable pour éviter l’erreur "unused"
        logger.info("La somme est : {}", somme);
    }
}
