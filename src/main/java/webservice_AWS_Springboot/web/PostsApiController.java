package webservice_AWS_Springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import webservice_AWS_Springboot.service.posts.PostsService;
import webservice_AWS_Springboot.web.dto.PostsResponseDto;
import webservice_AWS_Springboot.web.dto.PostsSaveRequestDto;
import webservice_AWS_Springboot.web.dto.PostsUpdateRequestDto;


@RequiredArgsConstructor //Autowired 대신 생성자로 bean을 받음. final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성.
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id){
        postsService.delete(id);
        return id;
    }

}
