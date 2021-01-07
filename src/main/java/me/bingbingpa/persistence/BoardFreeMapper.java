package me.bingbingpa.persistence;

import me.bingbingpa.domain.BoardFree;
import org.springframework.stereotype.Repository;

@Repository("boardFreeMapper")
public interface BoardFreeMapper extends BoardMapper<BoardFree, Long> {

    void saveComment(BoardFree boardFree);
}
