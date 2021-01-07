package me.bingbingpa.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.bingbingpa.domain.BoardFree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class BoardFreeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("자유 게시판 등록 테스트")
    void saveTest() throws Exception {
        BoardFree boardFree = new BoardFree();
        mockMvc.perform(post("/board-free/save/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(boardFree)))
                .andDo(print());
    }

    @Test
    @DisplayName("자유 게시판 조회")
    void getTest() throws Exception {
        mockMvc.perform(get("/board-free/"))
                .andDo(print());
    }
}