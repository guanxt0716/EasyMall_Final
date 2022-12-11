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
public class TOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String orderId;

    private String productId;

    private Integer num;

    private String productImage;

    private String productName;

    private Double productPrice;


}
