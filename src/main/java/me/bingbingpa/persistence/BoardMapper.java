package me.bingbingpa.persistence;


import me.bingbingpa.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper<T extends Board, ID> {

    List<T> findAll();

    T findById(ID id);

    void save(T object);

    T update(T object);

    T deleteById(ID id);

}
