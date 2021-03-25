package vaccination;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class FileReaderWriter {
	
	public static Scanner sc = new Scanner(System.in);
	
	private String key;
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
	
	FileReaderWriter(String key, int id , String info1, String info2,String info3,String info4,String info5,String info6,String info7,String info8,String info9,String info10){
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
		
		
		
	
	
	public String fileReading(String key, int id) {
		
		//Elias
		//BufferedReader reader = new BufferedReader(new FileReader("Impfstoff"), true);
		

		

		
		
//		file.when(key)
//			when(id)
//				return allInfos
		
//		for(int col = 0; input == key; col++) {
//			
//		}
		
		
		/*
		String[] europa = new String[632];
		File txtFile = new File(filePath);

		try (Scanner scfile = new Scanner(txtFile)) {
			int index = 0;
			while (scfile.hasNext()) {
				String tmp = scfile.nextLine();
				europa[index] = tmp;
				index++;
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
//			return -1;
		}
		for (int i = 0; i < europa.length; i++) {
//			System.out.println(europa[i]);
		}
		return europa;
	
		
		*/
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
