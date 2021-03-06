package me.bingbingpa.service.impl;

import me.bingbingpa.domain.BoardFree;
import me.bingbingpa.persistence.BoardFreeMapper;
import me.bingbingpa.persistence.BoardMapper;
import me.bingbingpa.service.BoardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("boardFreeService")
public class BoardFreeImpl extends BoardService<BoardFree, Long> {

    private final BoardFreeMapper boardFreeMapper;

    public BoardFreeImpl(BoardMapper<BoardFree, Long> boardFreeMapper) {
        super(boardFreeMapper);
        this.boardFreeMapper = (BoardFreeMapper) boardFreeMapper;
    }

    @Transactional
    public void saveComment(BoardFree boardFree) {
        boardFreeMapper.saveComment(boardFree);
    }
}
