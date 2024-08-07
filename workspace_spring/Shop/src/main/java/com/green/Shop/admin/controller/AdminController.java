package com.green.Shop.admin.controller;

import com.green.Shop.admin.service.AdminService;
import com.green.Shop.item.vo.CategoryVO;
import com.green.Shop.item.vo.ItemVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource(name = "adminService")
    private AdminService adminService;

//    카테고리 목록 가져오기
    @GetMapping("/getCategoryList")
    public List<CategoryVO> getCategoryList() {
        return adminService.getCategoryList();
    }

//    상품 등록하기
    @PostMapping("/regItem")
    public void regItem(@RequestBody ItemVO itemVO) {
        adminService.regItem(itemVO);
    }

//    상품 목록 가져오기
    @GetMapping("/getItemList")
    public List<ItemVO> getItemList() {
        return adminService.getItemList();
    }
}
