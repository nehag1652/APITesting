package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class HandleJSONFile {

	public static String loadJSONData(String filePath) throws FileNotFoundException {

		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		JSONTokener j = new JSONTokener(fr);
		JSONObject js = new JSONObject(j);
		return js.toString();

	}

}
