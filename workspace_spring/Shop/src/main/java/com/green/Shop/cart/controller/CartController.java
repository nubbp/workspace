package com.green.Shop.cart.controller;

import com.green.Shop.cart.service.CartService;
import com.green.Shop.cart.vo.CartVO;
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
        System.out.println(cartVO);
        boolean result = cartService.existColumn(cartVO);
        if (result) {
            cartService.updateExtraCart(cartVO);
        } else {
            cartService.plusCart(cartVO);
        }
    }

    @GetMapping("/getCartList/{memId}")
    public List<CartVO> getCartList(@PathVariable(name = "memId") String memId) {
        return cartService.getCartList(memId);
    }

    @PostMapping("/updateCnt")
    public void updateCnt(@RequestBody CartVO cartVO) {
        cartService.updateCnt(cartVO);
    }

    @DeleteMapping("/deleteOneCart/{cartCode}")
    public void deleteOneCart(@PathVariable(name = "cartCode") int cartCode) {
        System.out.println(cartCode);
        cartService.deleteOneCart(cartCode);
    }
}
