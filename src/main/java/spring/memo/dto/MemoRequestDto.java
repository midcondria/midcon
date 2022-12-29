package spring.memo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

@Getter
public class MemoRequestDto {

    private String password;

    private String author;
    private String content;
    private String title;
    
}