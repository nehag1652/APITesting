package org.testing.utilities;

import java.util.regex.Pattern;

public class ReplaceJSONData {
	
	public static String replaceData(String variableName,String variableValue,String data) {
		
	return data.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
	}
	

}
