package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {

    @Resource(name = "boardService")
    private BoardService boardService;

//    게시글 목록
    @PostMapping("/list")
    public Map<String, Object> getBoardList(@RequestBody(required = false) SearchVO searchVO) {
        log.info("======넘어온 페이지 번호 : " + searchVO.getPageNo());

//        전체 게시글 수
        int totalDataCnt = boardService.getBoardCnt();

//        페이지 정보를 담을 수 있는 pageVO 객체 생성
        PageVO pageInfo = new PageVO(totalDataCnt);

        pageInfo.setNowPage(searchVO.getPageNo());

        pageInfo.setPageInfo();
        System.out.println(pageInfo);

        List<BoardVO> boardList = boardService.getBoardList(pageInfo);

//        리액트로 가져갈 모든 데이터를 담을 변수
        Map<String, Object> mapData = new HashMap<>();

//        페이징 정보가 담긴 데이터 삽입
        mapData.put("pageInfo", pageInfo);
//        게시글 목록 데이터 삽입
        mapData.put("boardList", boardList);

        return mapData;
    }

    @GetMapping("/detail/{boardNum}")
    public BoardVO getBoardDetail(@PathVariable(name = "boardNum") int boardNum) {
        return boardService.getBoardDetail(boardNum);
    }

    @PostMapping("/regBoard")
    public void regBoard(@RequestBody BoardVO boardVO) {
        log.info("============");
        log.info("====== boardController.insertBoard() 실행 ======");
        boardService.regBoard(boardVO);
    }

    @DeleteMapping("/deleteBoard/{boardNum}")
    public void deleteBoard(@PathVariable(name = "boardNum") int boardNum) {
        boardService.deleteBoard(boardNum);
    }

    @PutMapping("/updateBoard")
    public void updateBoard(@RequestBody BoardVO boardVO) {
        boardService.updateBoard(boardVO);
    }

}
