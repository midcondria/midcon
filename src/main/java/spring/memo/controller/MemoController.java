package spring.memo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.memo.dto.MemoRequestDto;
import spring.memo.dto.MemoResponseDto;
import spring.memo.entity.Memo;
import spring.memo.service.MemoService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemoController {

    private final MemoService memoService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @PostMapping("/api/memos")
    public MemoRequestDto createMemo(@RequestBody MemoRequestDto requestDto) {
        log.info("createMemo");
        return new MemoRequestDto();
    }

    @GetMapping("/api/memos")
    public List<Memo> getMemos() {

        return memoService.getMemos();
    }

    @GetMapping("/api/memos/{id}")
    public Memo getMemo(@PathVariable Long id) {
        return memoService.getMemo(id);
    }


    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        return memoService.update(id, requestDto);
    }

    @DeleteMapping("api/memos/{id}")
    public Long deleteMemo(@PathVariable Long id) {
        return memoService.deleteMemo(id);
    }
}
