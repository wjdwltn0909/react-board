package com.nc13.react_board;

import com.nc13.react_board.model.BoardDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public BoardDTO test(){
        return new BoardDTO();
    }
}
