package me.bingbingpa.persistence;

import me.bingbingpa.domain.BoardNotice;
import org.springframework.stereotype.Repository;

@Repository("boardNoticeMapper")
public interface BoardNoticeMapper extends BoardMapper<BoardNotice, Long> {

    void savaFile(BoardNotice boardNotice);
}
