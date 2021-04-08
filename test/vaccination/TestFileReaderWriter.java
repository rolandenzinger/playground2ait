package vaccination;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFileReaderWriter {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWritingreding() {
		String key = "Person";
		int id = 1;
		 String info1 = "Paul";
		 String info2 = "Berger";
		 String info3 = "Tobistaﬂe8";
		 String info4 =  "8700";
		 String info5 =  "Leoben";
		 String info6 = "Deutscher";
		 String info7 = "Keine Kinder";
		 String info8 = "Ledich";
		 String info9 = "32";
		 String info10 = "M‰nnlich";
		FileReaderWriter test = new FileReaderWriter(key,id,info1,info2,info3,info4,info5,info6,info7,info8,info9,info10);
		test.fileWriting(test);
		String readingResult = "";
		readingResult = test.fileReading(key, id);
		String fieldResult = "";
		fieldResult =test.GetInfoFromBlock(readingResult, 1);
		
		assertEquals(readingResult,fieldResult);
		
		
		
		
		
		
	}

}
