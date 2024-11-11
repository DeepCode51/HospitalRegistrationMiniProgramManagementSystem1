package cn.yujian95.hospital.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**

 * @date 2023/4/23
 */

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "VisitAppointmentWithQueueDTO", description = "挂号记录")
public class VisitAppointmentWithQueueDTO extends VisitAppointmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("就诊号")
    private Integer queueNum;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;
}
