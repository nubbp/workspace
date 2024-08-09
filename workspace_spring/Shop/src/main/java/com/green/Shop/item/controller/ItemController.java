package com.green.Shop.item.controller;

import com.green.Shop.item.service.ItemService;
import com.green.Shop.item.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Resource(name = "itemService")
    private ItemService itemService;

    @GetMapping("/itemDetail/{itemCode}")
    public ItemVO getItemDetail(@PathVariable(name = "itemCode") int itemCode) {
        return itemService.getItemDetail(itemCode);
    }
}
