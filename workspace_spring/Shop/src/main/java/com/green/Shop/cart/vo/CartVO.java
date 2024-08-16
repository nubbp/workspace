package com.green.Shop.cart.vo;

import com.green.Shop.item.vo.ImgVO;
import com.green.Shop.item.vo.ItemVO;
import com.green.Shop.member.vo.MemberVO;
import lombok.Data;

import java.util.List;

@Data
public class CartVO {
    private int cartCode;
    private int itemCode;
    private int cartCnt;
    private String memId;
    private String cartDate;
    private List<ImgVO> imgList;
    private List<MemberVO> memberList;
    private List<ItemVO> itemList;
}