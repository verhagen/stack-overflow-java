package com.stackoverflow.issue_65626542;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JsonGetKeyAndValueTest {
	private JsonGetKeyAndValue jsonGetKeyAndValue = new JsonGetKeyAndValue();


	@Test
	void extractContent() throws Exception {
		String value = jsonGetKeyAndValue.extractContent("{\"code\":\"0\",\"content\":\"{\\\"Name\\\":\\\"Subhajit\\\"}\"}");
		System.out.println(value);
		assertEquals("{\"Name\":\"Subhajit\"}", value);
	}

	@Test
	void extractContentName() throws Exception {
		String value = jsonGetKeyAndValue.extractContentName("{\"code\":\"0\",\"content\":\"{\\\"Name\\\":\\\"Subhajit\\\"}\"}");
		System.out.println(value);
		assertEquals("Subhajit", value);
	}

}
