package com.pjt.board;

import org.apache.ibatis.annotations.Mapper;

import com.pjt.board.vo.BoardVO;

@Mapper
public interface BoardMapper {

	BoardVO selBoard();

}
