package com.pjt.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.board.vo.BoardVO;

@Service
public class BoardService {
	@Autowired
	BoardMapper mapper;
	
	public BoardVO selBoard() {
		return mapper.selBoard();
	}

}
