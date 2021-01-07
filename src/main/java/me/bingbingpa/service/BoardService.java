package me.bingbingpa.service;

import me.bingbingpa.domain.Board;
import me.bingbingpa.persistence.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public abstract class BoardService<T extends Board, ID> {

    private BoardMapper<T, ID> mapper;

    public BoardService(BoardMapper<T, ID> mapper) {
        this.mapper = mapper;
    }

    public BoardService() {}

    @Transactional(readOnly = true)
    public List<T> findAll() {
        return mapper.findAll();
    }

    @Transactional(readOnly = true)
    public T findById(ID id) {
        return mapper.findById(id);
    }

    @Transactional
    public void save(T object) {
        mapper.save(object);
    }

    @Transactional
    public T update(T object) {
        return mapper.update(object);
    }

    @Transactional
    public T deleteById(ID id) {
        return mapper.deleteById(id);
    }
}
