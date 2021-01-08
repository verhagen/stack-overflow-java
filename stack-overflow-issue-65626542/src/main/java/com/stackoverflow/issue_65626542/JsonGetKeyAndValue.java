package com.stackoverflow.issue_65626542;

import java.io.IOException;
import java.io.StringReader;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonGetKeyAndValue {

	public String extractContent(String jsonText) throws IOException {
		JsonNode rootNode = new ObjectMapper().readTree(new StringReader(jsonText));
		JsonNode contentNode = rootNode.get("content");

		System.out.println(contentNode);
		return contentNode.getTextValue();
	}

	public String extractContentName(String jsonText) throws IOException {
		String content = extractContent(jsonText);
		System.out.println(content);
		
		JsonNode contentRootNode = new ObjectMapper().readTree(new StringReader(content));
		JsonNode nameNode = contentRootNode.get("Name");
		System.out.println(nameNode.getTextValue());

		return nameNode.getTextValue();
	}

}
