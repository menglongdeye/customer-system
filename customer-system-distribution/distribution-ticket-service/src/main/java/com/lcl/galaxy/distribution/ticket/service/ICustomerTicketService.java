package com.lcl.galaxy.distribution.ticket.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lcl.galaxy.cs.infrastructure.exception.BizException;
import com.lcl.galaxy.distribution.ticket.controller.vo.AddTicketReqVO;
import com.lcl.galaxy.distribution.ticket.entity.CustomerTicket;

/**
 * <p>
 * 客服工单表 服务类
 * </p>
 */
public interface ICustomerTicketService extends IService<CustomerTicket> {

    void insertTicket(AddTicketReqVO addTicketReqVO) throws BizException;
}
