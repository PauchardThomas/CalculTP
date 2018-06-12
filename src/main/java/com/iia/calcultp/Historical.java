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
        if (Files.exists(path)) {
            System.out.print("* Fichier non créé ! * \r\n");
            result = true;
        } else {
            createFile();
            result = false;
        }
        return result;
    }

    /**
     * Create file in directory.
     */
    public static boolean createFile() {
        try {
            System.out.print("* Création fichier ! * \r\n");
            path = Paths.get(filePathString);
            if (Files.isDirectory(path)) {
                try {
                    new File(filePathString, fileName).createNewFile();
                } catch (FileSystemException e) {
                    Utils.message(e.getMessage());
                }
            }
            result = true;
        } catch (IOException e) {
            Utils.message(e.getMessage());
            result = false;
        }
        return result;

    }

    /**
     * Delete file in directory.
     */
    public static boolean deleteFile() {
        if (Files.exists(path)) {
            try {
                System.out.print("* Destruction fichier ! * \r\n");
                Files.delete(path);
                result = true;
            } catch (IOException e) {
                Utils.message(e.getMessage());
                result = false;
            }
        }
        else {
        result = false;
        }
        return result;
    }
}
