package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Воин");

        Assertions.assertArrayEquals(new String[]{"Воин"}, manager.findAll());

        manager.addFilm("Титаник");

        Assertions.assertArrayEquals(new String[]{"Воин", "Титаник"}, manager.findAll());

    }

    @Test
    public void shouldFilmFindsAll() {
        PosterManager manager = new PosterManager();
        Assertions.assertArrayEquals(new String[]{}, manager.findAll());

        manager.addFilm("Титаник");
        manager.addFilm("Час-пик");
        manager.addFilm("Матрица");
        manager.addFilm("Воин");
        Assertions.assertArrayEquals(new String[]{"Титаник", "Час-пик", "Матрица", "Воин"}, manager.findAll());

    }

    @Test
    public void shouldFilmFindsLast() {
        PosterManager manager = new PosterManager(3);

        manager.addFilm("Титаник");
        manager.addFilm("Час-пик");
        manager.addFilm("Матрица");
        manager.addFilm("Воин");

        Assertions.assertArrayEquals(new String[]{"Воин", "Матрица", "Час-пик"}, manager.findLast());

    }

    @Test
    public void shouldFilmFindsLastWithOutLimit() {
        PosterManager manager = new PosterManager();

        manager.addFilm("Титаник");

        Assertions.assertArrayEquals(new String[]{"Титаник"}, manager.findLast());

    }
}
