/* Copyright RENAULT Antoine 12/06/20 */

package com.iia.calcultp;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Antoine RENAULT.
 *
 */
public final class Historical {

    /** Path od directory ressources. */
    private static String filePathString = "src\\main\\resources";

    /** Name of file. */
    private static String fileName = "historical.txt";

    /** Path + file complete. */
    private static Path path = Paths.get(filePathString + fileName);

    /** Operation result. */
    private static boolean result;
    
    /**
     * Constructor.
     */
    private Historical() {
        super();
    }

    /**
     * Init file on her directory.
     */
    public static boolean initFile() {
        if (!Files.exists(path)) {
            createFile();
            result = true;
        } else {
            System.out.print("* Fichier non créé ! * \r\n");
        }
        return result;
    }

    /**
     * Create file in directory.
     */
    public static void createFile() {
        try {
            System.out.print("* Création fichier ! * \r\n");
            path = Paths.get(filePathString);
            if (Files.isDirectory(path)) {
                try {
                    new File(filePathString, fileName).createNewFile();
                } catch (FileSystemException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Delete file in directory.
     */
    public static void deleteFile() {
        if (Files.exists(path)) {
            try {
                System.out.print("* Destruction fichier ! * \r\n");
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
