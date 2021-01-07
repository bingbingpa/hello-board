package me.bingbingpa.controller;

import lombok.extern.slf4j.Slf4j;
import me.bingbingpa.domain.Board;
import me.bingbingpa.service.BoardService;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/default")
public abstract class BoardController<T extends Board, ID> {

    private final BoardService<T, ID> boardService;

    public BoardController(BoardService<T,ID> boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public void getAll() {
        log.info("call getAll ============= {} ", boardService.findAll());
    }

    @GetMapping("/{id}")
    public void getById(@PathVariable ID id) {
        log.info("call getById ============= {} ", boardService.findById(id));
    }

    @PostMapping("/save")
    public void save(@RequestBody T t) {
        log.info("call save ======================{} ", t);
        boardService.save(t);
    }

    @PutMapping("/update")
    public void update(@RequestBody T t) {
        log.info("call update ======================{}", t);
        boardService.update(t);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ID id) {
        log.info("call delete ======================{}", id);
        boardService.deleteById(id);
    }
}
