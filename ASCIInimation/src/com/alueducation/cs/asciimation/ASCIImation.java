/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alueducation.cs.asciimation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextPane;

/**
 *
 * @author stephennaicken
 */
public class ASCIImation {

    private static final String STR_DELIMITER = "=====";
    

    private List<Frame> frames;

    public ASCIImation() {
        // TODO: instantiate the frames object
        Frame frameObject = new Frame();
    }

    public void loadMovieFile(File movieFile) throws FileNotFoundException, IOException {

        // TODO: load the animation from the file
        // create each frame and add them to the list of frames
        File animation = new File(movieFile);

    }

    public Frame getFrame(int frameNumber) {
        // TODO: implement
        return this.frames.get(frameNumber);
    }

    public int getNumberOfFrames() {
        // TODO: implement

    }

}
