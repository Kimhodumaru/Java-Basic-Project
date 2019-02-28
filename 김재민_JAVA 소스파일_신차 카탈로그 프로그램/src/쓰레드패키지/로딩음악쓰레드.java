package 쓰레드패키지;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class 로딩음악쓰레드 extends Thread {


	public static void PlaySound(File Sound)
	{
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		
		
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}
		catch(Exception e)
		{
			
		}
	}
}
