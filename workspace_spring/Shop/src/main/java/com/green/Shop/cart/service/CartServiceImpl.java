package com.green.Shop.cart.service;

import com.green.Shop.cart.vo.CartVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void plusCart(CartVO cartVO) {
       sqlSession.insert("cartMapper.plusCart", cartVO);
    }

    @Override
    public List<CartVO> getCartList(String memId) {
        return sqlSession.selectList("cartMapper.getCartList", memId);
    }

    @Override
    public void updateCnt(CartVO cartVO) {
        sqlSession.update("cartMapper.updateCnt", cartVO);
    }

    @Override
    public void updateExtraCart(CartVO cartVO) {
        sqlSession.update("cartMapper.updateExtraCart", cartVO);
    }

    @Override
    public boolean existColumn(CartVO cartVO) {
        return sqlSession.selectOne("cartMapper.existColumn", cartVO);
    }

    @Override
    public void deleteOneCart(int cartCode) {
        sqlSession.delete("cartMapper.deleteOneCart", cartCode);
    }
}
