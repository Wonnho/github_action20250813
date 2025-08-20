package com.example.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource(properties = {
		"DATABASE_HOST=localhost",
		"DATABASE_PORT=3306",
		"DATABASE_NAME=testdb",
		"DATABASE_USERNAME=root",
		"DATABASE_PASSWORD=password"
})
class BackendApplicationTests {

	@Test
	void contextLoads() {
	}
}