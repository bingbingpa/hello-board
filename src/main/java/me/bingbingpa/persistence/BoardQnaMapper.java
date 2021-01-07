package me.bingbingpa.persistence;

import me.bingbingpa.domain.BoardQna;
import org.springframework.stereotype.Repository;

@Repository("boardQnaMapper")
public interface BoardQnaMapper extends BoardMapper<BoardQna, Integer> {

    void addAnswer(BoardQna boardQna);
}
