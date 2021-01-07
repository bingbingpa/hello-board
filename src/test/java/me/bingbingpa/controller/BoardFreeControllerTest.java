package me.bingbingpa.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.bingbingpa.domain.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BoardFreeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @ParameterizedTest
    @DisplayName("자유 게시판 등록 테스트")
    @CsvSource(value = {"'admin':'test'", "'gaia3d':'가이아쓰리디'","'shpark':'user'"}, delimiter = ':')
    void saveTest(String userId, String content) throws Exception {
        Board boardFree = Board.builder()
                .userId(userId)
                .contents(content)
                .build();
        mockMvc.perform(post("/board-free/save/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(boardFree)))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("자유 게시판 모든항목 조회 테스트")
    void getTest() throws Exception {
        mockMvc.perform(get("/board-free/"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("자유 게시판 한건 조회 테스트")
    void getById() {

    }

    @Test
    @DisplayName("업데이트 테스트")
    void save() {

    }

    @Test
    @DisplayName("삭제 테스트")
    void delete() {

    }

    @Test
    @DisplayName("댓글 추가 테스트")
    void saveComment() {

    }
}