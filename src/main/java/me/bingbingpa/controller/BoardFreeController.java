package me.bingbingpa.controller;

import lombok.extern.slf4j.Slf4j;
import me.bingbingpa.domain.BoardFree;
import me.bingbingpa.service.BoardService;
import me.bingbingpa.service.impl.BoardFreeImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/board-free")
public class BoardFreeController extends BoardController<BoardFree, Long> {

    private final BoardFreeImpl boardFreeService;

    public BoardFreeController(BoardService<BoardFree, Long> boardService) {
        super(boardService);
        this.boardFreeService = (BoardFreeImpl) boardService;
    }

    @PostMapping("/save-comment")
    public void saveComment(BoardFree boardFree){
        log.info("board free saveComment");
        boardFreeService.saveComment(boardFree);
    }
}
