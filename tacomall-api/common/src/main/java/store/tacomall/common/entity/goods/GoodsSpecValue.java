/***
 * @Author: 码上talk|RC/3189482282@qq.com
 * @Date: 2021-10-21 16:44:56
 * @LastEditTime: 2021-10-21 17:30:20
 * @LastEditors: 码上talk|RC
 * @Description: 
 * @FilePath: /tacomall-api/common/src/main/java/store/tacomall/common/entity/goods/GoodsSpecValue.java
 */
package store.tacomall.common.entity.goods;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author 码上talk
 * @since 2021-10-21
 */
@Data
public class GoodsSpecValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer keyId;

    private String name;

    @TableLogic
    private Integer isDelete;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private LocalDateTime deleteTime;

}