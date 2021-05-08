package org.example.junit;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

public class JUnit5NewFeaturesUnitTest {

    //@TestFactory – denotes a method that is a test factory for dynamic tests
    //@DisplayName – defines custom display name for a test class or a test method
    //@Nested – denotes that the annotated class is a nested, non-static test class
    //@Tag – declares tags for filtering tests
    //@ExtendWith – it is used to register custom extensions
    //@BeforeEach – denotes that the annotated method will be executed before each test method (previously @Before)
    //@AfterEach – denotes that the annotated method will be executed after each test method (previously @After)
    //@BeforeAll – denotes that the annotated method will be executed before all test methods in the current class (previously @BeforeClass)
    //@AfterAll – denotes that the annotated method will be executed after all test methods in the current class (previously @AfterClass)
    //@Disable – it is used to disable a test class or method (previously @Ignore)

    private static final Logger log = Logger.getLogger(JUnit5NewFeaturesUnitTest.class.getName());

    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        log.info("Success");

    }

    @Test
    @Disabled("Not implemented yet.")
    void testShowSomething() {
    }

    @AfterEach
    void tearDown() {
        log.info("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        log.info("@AfterAll - executed after all test methods.");
    }


}
