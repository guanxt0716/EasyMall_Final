package com.easymall.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "order_id", type = IdType.AUTO)
    private String orderId;

    private Double orderMoney;

    private String orderReceiverinfo;

    private Integer orderPaystate;

    private Date orderTime;

    private String userId;


}
