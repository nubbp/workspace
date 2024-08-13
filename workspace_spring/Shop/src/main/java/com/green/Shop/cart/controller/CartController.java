package com.green.Shop.cart.controller;

import com.green.Shop.cart.service.CartService;
import com.green.Shop.cart.vo.CartVO;
import com.green.Shop.item.service.ItemService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Resource(name = "cartService")
    private CartService cartService;

    @PostMapping("/plusCart")
    public void plusCart(@RequestBody CartVO cartVO) {
        cartService.plusCart(cartVO);
    }

    @GetMapping("/getCartList/{memId}")
    public List<CartVO> getCartList(@PathVariable(name = "memId") String memId) {
        return cartService.getCartList(memId);
    }
}
