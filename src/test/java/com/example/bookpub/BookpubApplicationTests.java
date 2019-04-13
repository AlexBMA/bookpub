package com.example.bookpub;

import com.example.bookpub.entity.Book;
import com.example.bookpub.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BookpubApplicationTests {

    @Autowired
    private WebApplicationContext context;
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private BookRepository repository;

    @LocalServerPort
    private int port;

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setupMockMvc() {
    }


	@Test
	public void contextLoads() {
        assertEquals(1, repository.count());
    }

    @Test
    public void webappBookIsbnApi() {
        Book book =
                restTemplate.getForObject("http://localhost:" +
                        port + "/books/978-1-78528-415-1", Book.class);
        assertNotNull(book);
        assertEquals("Packt", book.getPublisher().getName());
    }


}
