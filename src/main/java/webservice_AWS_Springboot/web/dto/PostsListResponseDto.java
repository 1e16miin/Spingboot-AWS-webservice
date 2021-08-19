package webservice_AWS_Springboot.web.dto;

import lombok.Getter;
import webservice_AWS_Springboot.domain.posts.Posts;

import java.time.LocalDateTime;


@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private LocalDateTime modifiedDate;
    private String author;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.modifiedDate = entity.getModifiedDate();
        this.author = entity.getAuthor();
    }
}
