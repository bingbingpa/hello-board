package me.bingbingpa.service.impl;

import me.bingbingpa.domain.BoardQna;
import me.bingbingpa.persistence.BoardMapper;
import me.bingbingpa.persistence.BoardQnaMapper;
import me.bingbingpa.service.BoardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("boardQnaService")
public class BoardQnaImpl extends BoardService<BoardQna, Integer> {

    private final BoardQnaMapper boardQnaMapper;

    public BoardQnaImpl(BoardMapper<BoardQna, Integer> boardQnaMapper) {
        super(boardQnaMapper);
        this.boardQnaMapper = (BoardQnaMapper) boardQnaMapper;
    }

    @Transactional
    public void addAnswer(BoardQna boardQna) {
        boardQnaMapper.addAnswer(boardQna);
    }
}
