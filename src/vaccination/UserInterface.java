package vaccination;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.*;

public class UserInterface {

	static JFrame frame = new JFrame("Vaccination");

	public static void SaySomething(String Info) {

			String say = Info;

			JOptionPane.showMessageDialog(frame, say);
			
	}
	

	
	public static String AskForString (String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question);

        String user = sc.nextLine();
        return user;
    }
	
	public static Date AskForDate (String info ) {
		
		String userInput = JOptionPane.showInputDialog(info, frame);

		Date date= null;
		try {
		date = new SimpleDateFormat("dd/MM/yyyy").parse(userInput);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(frame, "You've entered a wrong format");
			AskForDate(info);
		}

		return date;
	}
	
	public static int AskForNumber (String question) {
		int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        num = Integer.parseInt(sc.nextLine());

		return num;
    }
	
}


