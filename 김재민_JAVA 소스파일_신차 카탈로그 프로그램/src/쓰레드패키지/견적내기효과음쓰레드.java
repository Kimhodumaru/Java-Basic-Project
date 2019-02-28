package 쓰레드패키지;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;


public class 견적내기효과음쓰레드  {
	
	public void 견적내기효과음매서드() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		
		bgm = new File("C:\\Users\\Jaemin Kim\\Desktop\\cash2.wav");; // 사용시에는 개별 폴더로 변경할 것
		
		Clip clip;
		
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip)AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
			
			
		} catch (Exception e) {
			System.out.println("err : " + e);
			}
		
	}	// 배경음악재생매서드
	
	
	
	
}

