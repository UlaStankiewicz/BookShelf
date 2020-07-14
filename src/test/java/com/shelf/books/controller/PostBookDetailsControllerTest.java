package com.shelf.books.controller;

import com.shelf.books.service.BookDetailsService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(PostBookDetailsController.class)
public class PostBookDetailsControllerTest {

    @MockBean
    BookDetailsService bookDetailsService;

    @Autowired
    private MockMvc mockMvc;


}
