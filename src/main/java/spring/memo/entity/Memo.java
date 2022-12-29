package spring.memo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spring.memo.dto.MemoRequestDto;
import spring.memo.dto.MemoResponseDto;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Memo extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String content;

//    @JsonIgnore
    @Column
    private String password;

    @Column(nullable = false)
    private String title;


    public Memo(String author, String content, String password, String title) {
        this.author = author;
        this.content = content;
        this.password = password;
        this.title = title;
    }

    public Memo(MemoRequestDto requestDto) {
        this.author = requestDto.getAuthor();
        this.content = requestDto.getContent();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
    }

    public void update(MemoRequestDto requestDto) {
        this.author = requestDto.getAuthor();
        this.content = requestDto.getContent();
        this.title = requestDto.getTitle();
    }
}