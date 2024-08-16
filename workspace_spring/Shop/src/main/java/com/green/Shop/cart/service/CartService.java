package com.green.Shop.cart.service;

import com.green.Shop.cart.vo.CartVO;

import java.util.List;

public interface CartService {
    void plusCart(CartVO cartVO);
    List<CartVO> getCartList(String memId);
    void updateCnt(CartVO cartVO);
    void updateExtraCart(CartVO cartVO);
    boolean existColumn(CartVO cartVO);
    void deleteOneCart(int cartCode);
}
