package com.example.bookpub;

import com.example.bookpub.repository.BookRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;

public class StartupRunner implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private BookRepository bookRepository;

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() throws Exception {
        logger.info("DataSource: "+jdbcTemplate.toString());

        logger.info("Number of books: " +
                bookRepository.count());

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
