package com.stackoverflow.issue_65626542;

import java.io.IOException;
import java.io.StringReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetKeyAndValue {

	public static String extract(String jsonText) throws IOException {
		
		JsonNode rootNode = new ObjectMapper().readTree(new StringReader(jsonText));
		JsonNode innerNode = rootNode.get("content");
		System.out.println(innerNode);
		
		return innerNode.toString();
	}
	
}
