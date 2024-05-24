package com.example.recipe_app;

import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Utility {

    // Write in File
    public static boolean writeFile(String line,String fileName){
        try {

            char alphabets[] = line.toCharArray();
            FileOutputStream writer = new FileOutputStream(fileName);
            for (int i=0;i<alphabets.length;i++){
                writer.write(i);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    // Read From File
    public static String readFile(String fileName){
        try{
            String temp="",line="";
            FileInputStream reader = new FileInputStream(fileName);
            while (temp != null){
                line = line + reader.read();
            }
            return line;
        }catch (Exception e){
            return null;
        }
    }

    // inside the setOnClickListener

    // Write
    /*
    *
    * try{
        FileOutputStream fout = new openFileOutput("myfile",MODE_PRIVATE);
        fOut.write(fileContents.getByes());
        fout.close();
        File fileDir = new File(getFilesDir(),file);
        Toast.makeText(getBaseContext(), "File Saved at"+fileDir, Toast.LENGTH_LONG).show();
    }catch(Exception e){
        e.printStackTrace();
    }
    *
    */

    // Read
    /*
    *
     try{
        FileInputStream fIn = new FileInputStream(file); // file means fileName
        int c;
        String temp = "";
        while((c= fIn.read()) != -1){
            temp = temp + Character.toString((char)c);
        }
        showText.setText(temp);
    }catch(Exception e){
        e.printStackTrace();
    }
    *
    * */




}