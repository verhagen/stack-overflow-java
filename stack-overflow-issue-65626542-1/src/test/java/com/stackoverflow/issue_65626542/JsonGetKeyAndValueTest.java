package com.stackoverflow.issue_65626542;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JsonGetKeyAndValueTest {

	@Test
	void extract() throws Exception {
		assertEquals("\"{\\\"Name\\\":\\\"Subhajit\\\"}\"", JsonGetKeyAndValue.extract("{\"code\":\"0\",\"content\":\"{\\\"Name\\\":\\\"Subhajit\\\"}\"}"));
	}

}
