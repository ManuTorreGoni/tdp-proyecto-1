package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		Student alumno = new Student(111442, "Torre Goni","Manón","manutorregoni@gmail.com","https://github.com/ManuTorreGoni","/images/foto.jpg"); 
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen ejecutable = new SimplePresentationScreen(alumno);
            	ejecutable.setVisible(true);
            }
        });
    }
}