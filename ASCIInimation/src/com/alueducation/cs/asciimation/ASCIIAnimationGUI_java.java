/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alueducation.cs.asciimation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author stephennaicken
 */
public class ASCIIAnimationGUI_java extends JFrame {
    
    private static final String TITLE = "ASCIIAnimation";
    
    private ASCIImation asciiMation;
    private Timer drawTimer;
    
    public ASCIIAnimationGUI_java(){
        super();
        initialiseUI();
        asciiMation = new ASCIImation();
        drawTimer = new Timer();
    }
    
    private void initialiseUI(){
        JTextArea animationPane = new JTextArea();
        animationPane.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12)); 
        
        JPanel toolbar = new JPanel();
        toolbar.setLayout(new FlowLayout());
        
        JTextField filenameTextField = new JTextField(50);
        JButton playButton = new JButton("Play");
        
        playButton.addActionListener((ActionEvent e) -> {
            File file = new File(filenameTextField.getText());
            if(file.exists()){
                asciiMation = new ASCIImation();
                try {
                    asciiMation.loadMovieFile(file);
                    playAnimation(asciiMation, animationPane);
                } catch (IOException ex) {
                    Logger.getLogger(ASCIIAnimationGUI.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
            }
        });
        
        toolbar.add(filenameTextField);
        toolbar.add(playButton);
        
        setSize(800,800);
        getContentPane().add(animationPane, BorderLayout.CENTER);
        getContentPane().add(toolbar, BorderLayout.PAGE_END);
        
    }
    
    private void playAnimation(ASCIImation asciiMation, JTextArea animationPane){
        if(drawTimer != null){
            drawTimer.cancel();
            drawTimer.purge();
        }
        drawTimer = new Timer();
        drawTimer.schedule(new DrawTimerTask(asciiMation, animationPane), 0, 500);
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ASCIIAnimationGUI gui = new ASCIIAnimationGUI();
        gui.setVisible(true);
    }
    
    private class DrawTimerTask extends TimerTask {
        
        private final ASCIImation animation;
        private final JTextArea textArea;
        private int counter;
        
        public DrawTimerTask(ASCIImation animation, JTextArea textArea){
            this.animation = animation;
            this.textArea = textArea;
        }

        @Override
        public void run() {
            if(counter >= animation.getNumberOfFrames()){
                counter = 0;
            }
            
            textArea.setText("");
            
            Frame currentFrame = animation.getFrame(counter);
            Iterator<String> i = currentFrame.getLines().iterator();
            while (i.hasNext()) {
                textArea.append(i.next()+"\r\n");
            }
            counter++;
            
            //textArea.revalidate();
        }
        
    }
    
}