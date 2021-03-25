package vaccination;

import javax.management.relation.RoleInfoNotFoundException;
import java.io.*;
import java.util.Scanner;

public class FileReaderWriter {

	public static Scanner scanner = new Scanner(System.in);

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

	FileReaderWriter(String key, int id, String info1, String info2, String info3, String info4, String info5,
			String info6, String info7, String info8, String info9, String info10) {
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
		String idstring = String.valueOf(id);

		BufferedWriter writer = new BufferedWriter(new FileWriter("Impfstoff", true));
		writer.append(idstring);
		writer.append(key);
		writer.append(info1);
		writer.append(info2);
		writer.append(info3);
		writer.append(info4);
		writer.append(info5);
		writer.append(info6);
		writer.append(info7);
		writer.append(info8);
		writer.append(info9);
		writer.append(info10);

		writer.close();
	}

	public String fileReading(String key, int id) {

		// Elias
		boolean exit = true;
		
		File file = new File("Impfstoff.csv");
		
		try (Scanner sc = new Scanner(file)) {
		
		} catch (FileNotFoundException ex) {
			
			do {

				String currentLine = scanner.nextLine();
				String[] splittedInfos = currentLine.split(";");
				if ((splittedInfos[0] == key) && (Integer.parseInt(splittedInfos[1]) == id)) {
					System.out.println(currentLine);
					exit = false;
					return currentLine;

				}
			} while (exit);
		}
		
		return "Fehler";

	}

	public String[] ReadAllEntriesWithKey(String key) {
		String line;
		String[] arr = new String[10];
		int i = 0;

		try {
			BufferedReader read = new BufferedReader(new FileReader("./Impfung.xlsx"));
			System.out.println("File read!");
			if (read.readLine().equalsIgnoreCase(key)) {
				while (!(read.readLine().isEmpty())) {
					arr[i] = read.readLine();
					i++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return arr;
	}

	public String GetInfoFromBlock(String infoBlock, int IndexOfRequestedInformation) {

		String info = null;
		return info;
	}

}
