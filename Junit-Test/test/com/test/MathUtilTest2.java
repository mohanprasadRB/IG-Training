package com.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilTest2 {

	MathUtil mathUtil;

	@BeforeAll
	// static void beforeAllInit() If @TestInstance is not used
	void beforeAllInit() {
		System.out.println("Runs before All");
	}

	@BeforeEach
	void init() {
		mathUtil = new MathUtil();
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning Up...");
	}

	@Test
	@DisplayName("Testing add Method")
	void addTest() {
		// MathUtil mathUtil = new MathUtil();
		assertEquals(10, mathUtil.add(5, 5));
	}

	@Test
	@DisplayName("Test Division Method")
	void testDivide() {
		// MathUtil mathUtil = new MathUtil();
		assertThrows(ArithmeticException.class, () -> mathUtil.div(1, 0), "Devide by zero");
	}

	@Test
	@DisplayName("Testing Circle Area")
	@EnabledOnOs(OS.LINUX)
	void circleArea() {
		// MathUtil mathUtil = new MathUtil();
		assertEquals(314.1592653589793, mathUtil.circleArea(10));
	}

	@AfterAll
	void afterAllInit() {
		System.out.println("Runs After All");
	}

	@Test
	@Disabled
	@DisplayName("Do not run")
	void testDisabled()
	{
		fail("This test should be disabled");
	}
	
}
