package com.iia.calcultp;

import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HistoricalTest {

    @org.junit.Test
    public void testInitFile() {
        String pathName = "src\\main\\resources\\historical.txt";
        Path path = Paths.get(pathName);
        if (Files.isDirectory(path)) {
            assertTrue(Historical.initFile() == true);
        } 
    }

    @org.junit.Test
    public void testDeleteFile() {
        String pathName = "src\\main\\resources\\historical.txt";
        Path path = Paths.get(pathName);
        if (Files.isDirectory(path)) {
            assertTrue(Historical.deleteFile() == true);
        } else {
            assertTrue(Historical.deleteFile() == false);
        }
    }
    
    @org.junit.Test
    public void testCreateFile() {
        String pathName = "src\\main\\resources\\historical.txt";
        Path path = Paths.get(pathName);
        if (!Files.isDirectory(path)) {
            assertTrue(Historical.createFile() == true);
        } 
    }
}
