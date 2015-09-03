import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {

	
	
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
JOptionPane.showMessageDialog(null,"I am about to play you part of a song and you are to write the next lyric in the line! Good luck!");
		// 5. Use the playSound method to play your song.
playSound("Potato.wav");
		// 6. Make a pop-up for the player to type their answer
String Answer=JOptionPane.showInputDialog(null,"Type answer here");
		// 7. If they answered correctly, tell them that they were right.

if(Answer.equals("more")){
	JOptionPane.showMessageDialog(null,"Nice job!");
}

else{
	JOptionPane.showMessageDialog(null,"Boo! It is actually more!");
}
	
	//drfgtbhunj
	}
		// 8. Otherwise, tell them they are wrong, and give them the answer.

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}

