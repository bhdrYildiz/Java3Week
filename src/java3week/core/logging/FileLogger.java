package java3week.core.logging;

public class FileLogger implements Logger{

	public void log(String message) {
		
		System.out.println("Dosyaya Loglandý : " +message);
		
	}

}
