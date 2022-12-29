package spring.memo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;

@Getter
@NoArgsConstructor
public class MemoResponseDto {

    private String author;
    private String content;
    private String title;

    public MemoResponseDto(MemoRequestDto memoRequestDto) {
        this.author = memoRequestDto.getAuthor();
        this.content = memoRequestDto.getContent();
        this.title = memoRequestDto.getTitle();
    }
}
