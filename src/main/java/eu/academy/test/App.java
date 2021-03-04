package eu.academy.test;

import eu.academy.test.service.Task1impl;

import java.io.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        InputStream in = new FileInputStream("orig.txt");
        OutputStream out = new FileOutputStream("copy.txt");
        for (int c; (c = in.read()) != -1;) {
            out.write(c);
        }

        in.close();
        out.close();


    }
}
