package org.example.hasher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class HasherApplication {

	public static void main(String[] args) {
		SpringApplication.run(HasherApplication.class, args);

		Hasher hasher = new HasherImpl();

		String data1 = "1";

		String data2 = "{\n" +
				"  \"array\": [\n" +
				"    1,\n" +
				"    2,\n" +
				"    3\n" +
				"  ],\n" +
				"  \"boolean\": true,\n" +
				"  \"color\": \"gold\",\n" +
				"  \"null\": null,\n" +
				"  \"number\": 123,\n" +
				"  \"object\": {\n" +
				"    \"a\": \"b\",\n" +
				"    \"c\": \"d\"\n" +
				"  },\n" +
				"  \"string\": \"Hello World\"\n" +
				"}";
		String data3 = "{\n" +
				"  \"array\": [\n" +
				"    1,\n" +
				"    2,\n" +
				"    3\n" +
				"  ],\n" +
				"  \"boolean\":true,\n" +
				"  \"color\": \"gold\",\n" +
				"  \"null\": null,\n" +
				"  \"number\": 123,\n" +
				"  \"object\": {\n" +
				"    \"a\": \"b\",\n" +
				"    \"c\": \"d\"\n" +
				"  },\n" +
				"  \"string\": \"Hello World\"\n" +
				"}";

		String data4 = "{\n" +
				"  \"array\": [\n" +
				"    1,\n" +
				"    2,\n" +
				"    3\n" +
				"  ],\n" +
				"  \"boolean\": true,\n" +
				"  \"color\": \"gold\",\n" +
				"  \"null\": null,\n" +
				"  \"number\": 123,\n" +
				"  \"address\": \"г. Москва, Красная площадь, д. 1 корп 1. кв. 001\",\n" +
				"  \"object\": {\n" +
				"    \"a\": \"b\",\n" +
				"    \"c\": \"d\"\n" +
				"  },\n" +
				"  \"string\": \"Hello World\"\n" +
				"}";
		long hash1 = hasher.hash(data1);
		long hash2 = hasher.hash(data2);
		long hash3 = hasher.hash(data3);
		long hash4 = hasher.hash(data4);
	}

}
