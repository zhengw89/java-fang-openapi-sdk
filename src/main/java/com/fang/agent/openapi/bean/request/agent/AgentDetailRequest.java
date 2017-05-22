package com.fang.agent.openapi.bean.request.agent;

import com.fang.agent.openapi.bean.request.BaseRequestBean;

public class AgentDetailRequest extends BaseRequestBean {

	@Override
	protected boolean validateBean() {
		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		return null;
	}

}
