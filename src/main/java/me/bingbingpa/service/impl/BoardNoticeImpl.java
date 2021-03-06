package me.bingbingpa.service.impl;

import me.bingbingpa.domain.BoardNotice;
import me.bingbingpa.persistence.BoardMapper;
import me.bingbingpa.persistence.BoardNoticeMapper;
import me.bingbingpa.service.BoardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("boardNoticeService")
public class BoardNoticeImpl extends BoardService<BoardNotice, Long> {

    private final BoardNoticeMapper boardNoticeMapper;

    public BoardNoticeImpl(BoardMapper<BoardNotice, Long> boardNoticeMapper) {
        super(boardNoticeMapper);
        this.boardNoticeMapper = (BoardNoticeMapper) boardNoticeMapper;
    }

    @Transactional
    public void savaFile(BoardNotice boardNotice) {
        boardNoticeMapper.savaFile(boardNotice);
    }
}
