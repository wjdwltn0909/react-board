package com.nc13.react_board;

import com.nc13.react_board.model.BoardDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    @CrossOrigin
    public BoardDTO test(){
        BoardDTO b = new BoardDTO();
        b.setId(1);
        b.setTitle("테스트1");
        b.setContent("테스트1입니다.");
        b.setNickname("테스터1");
        return b;
    }
}
