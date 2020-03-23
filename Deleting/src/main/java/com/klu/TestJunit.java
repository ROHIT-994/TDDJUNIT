package com.klu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestJunit {

	
	@Test
	void test1() {
		assertEquals("BCD",Deleting.del("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD",Deleting.del("AACD"));
	}
	@Test
	void test3() {
		assertEquals("ABCD",Deleting.del("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA",Deleting.del("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BAA",Deleting.del("AABAA"));
	}
	@Test
	void test6() {
		assertEquals("",Deleting.del(""));
	}
	@Test
	void test7() {
		assertEquals("",Deleting.del("A"));
	}

}
