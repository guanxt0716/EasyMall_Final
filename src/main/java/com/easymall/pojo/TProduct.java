package com.easymall.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author guanxt and Lili
 * @since 2022-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TProduct implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "product_id", type = IdType.AUTO)
    private String productId;

    private String productName;

    private Double productPrice;

    private String productCategory;

    private String productImgurl;

    private Integer productNum;

    private String productDescription;


}
