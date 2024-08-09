package com.green.Shop.item.service;

import com.green.Shop.item.vo.ItemVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
    @Autowired
    SqlSessionTemplate sqlSession;

    @Override
    public ItemVO getItemDetail(int itemCode) {
        return sqlSession.selectOne("itemMapper.getItemDetail", itemCode);
    }
}
