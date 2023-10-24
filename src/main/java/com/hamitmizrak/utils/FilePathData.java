package com.hamitmizrak.utils;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.UUID;

// LOMBOK
@Data
@Log4j2
public class FilePathData {

    // Variable
    private String id;
    private String pathFileName;
    private String url;
    private String path;
    private File file;
    private Date sytemCreatedDate;

    // parametresiz constructor
    // URL URI
    // Relative path absolute path
    public FilePathData() {
        id = UUID.randomUUID().toString();
        sytemCreatedDate = new Date(System.currentTimeMillis());
        url = "C:\\io\\techcareer\\full_4";
        pathFileName = "\\MyRemainingRight.txt";
        //path="C:\\io\\techcareer\\full_4\\MyRemainingRight.txt";
        path = url.concat(pathFileName);
        file = new File(path);
        try {
            // Böyle bir dosya var mı ? eğer varsa tekrar oluşturma
            if (file.createNewFile()) {
                System.out.println("Böyle bir dosya yoktur " + path + " adında dosya oluşturuldu");
                System.out.println("Permission: Çalışabilir mi ?" + file.canExecute() + " Okunabilinir mi ? " + file.canRead() + " Yazılabilir mi ?" + file.canWrite());
                System.out.println("ID: " + this.id + "URL: " + this.path + " " + file.getName() + " PATH: " + file.getPath());
            } else {
                System.out.println(path + " Böyle bir dosya adı zaten var tekrardan oluşturulmadı !!!");
            }
            // dosyaya default 4 hak verildi.
            fileRemainingNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // FileWriter
    private void fileRemainingNumber() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.path, false))) {
            bufferedWriter.write("4");
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // FileReader

    public static void main(String[] args) {
        FilePathData filePathData = new FilePathData();
        System.out.println(filePathData);
    }
} //end class

// Primitive Type ile Wrapper Type arasındaki farklar ?
// Heap memory ile Stack memory nedir arasındaki farklar ?
// String neden primitive Type'dır ?
// Compiler Interpreter nedir ?
// Java 8 ile gelen stream seri ve paralel nedir ?

