package vaccination;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	private int key;
	private int id;
	private String info1;
	private String info2;
	private String info3;
	private String info4;
	private String info5;
	private String info6;
	private String info7;
	private String info8;
	private String info9;
	private String info10;
	
	FileReaderWriter(int key, int id , String info1, String info2,String info3,String info4,String info5,String info6,String info7,String info8,String info9,String info10){
		this.key = key;
		this.id = id;
		this.info1 = info1;
		this.info2 = info2;
		this.info3 = info3;
		this.info4 = info4;
		this.info5 = info5;
		this.info6 = info6;
		this.info7 = info7;
		this.info8 = info8;
		this.info9 = info9;
		this.info10 = info10;
		
	}
	
	public void fileWriting(String infoBlock) 
			 throws IOException {
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter("Impfstoff", true));
	    writer.append(' ');
	    writer.append(infoBlock);
	    
	    writer.close();
	}
		
		
		
	
	
	public String fileReading(int key, int id) {
		
		//Elias

		String infoBlock;
		
		infoBlock = info1 +";"+ info2 +";"+ info3 +";"+ info4 +";"+ info5 +";"+ info6 +";"+ info7 +";"+ info8 +";"+ info9 +";"+ info10;
   		return infoBlock;
		
		
	}
	public boolean DeleteEntry(String key, int id){

		return true;
	}
	public String[] ReadAllEntriesWithKey(String key){
		String[] arr = new String[8];

		return arr;
	}
	public String GetInfoFromBlock(String infoBlock, int IndexOfRequestedInformation){
		String info = null;

		return info;
	}

}
